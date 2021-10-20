# ShardingJdbc年分库季度分表的demo
## 主要组件:
- sharding-jdbc 4.1.1
- mybatis-spring-boot-starter 2.1.4
- springboot 2.5.0
  
## 主要表结构:
- 172.18.21.203 
 
-- dbipg-2021 按季度分表  
--- transaction_request_2021_1  1,2,3月  
--- transaction_request_2021_2  4,5,6月  
--- transaction_request_2021_3  7,8,9月  
--- transaction_request_2021_4  10,11,12月  

- 172.18.21.204

-- dbipg-2022 按季度分表  
--- transaction_request_2022_1  1,2,3月  
--- transaction_request_2022_2  4,5,6月  
--- transaction_request_2022_3  7,8,9月  
--- transaction_request_2022_4  10,11,12月

库名,表名不要乱起.需按照规则起名.

## yml 配置:
    
```
shardingsphere:
    props:
      sql:
        show: true   # 显示sql
    datasource:
      dbipg-2021:    #一库
        driver-class-name: com.mysql.cj.jdbc.Driver
        type: com.alibaba.druid.pool.DruidDataSource
        url: jdbc:mysql://172.18.21.203:3306/dbipg-2021?useSSL=false&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&serverTimezone=GMT%2B8
        username: flypay_dev
        password: Flypay@2021!
      dbipg-2022:   #二库
        driver-class-name: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://172.18.21.204:3306/dbipg-2022?useSSL=false&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&serverTimezone=GMT%2B8
        type: com.alibaba.druid.pool.DruidDataSource
        username: root
        password: password
      names: dbipg-2021,dbipg-2022

    sharding:
      binding-tables: transaction_request   #要水平分的表,多个表用 , 分割 
      tables:
        transaction_request:  #表名
          actual-data-nodes: dbipg-2021.transaction_request_2021_$->{1..4},dbipg-2022.transaction_request_2022_$->{1..4} #节点和数据源,如多个源有重复,可用GROOVY 语法 简写.
          database-strategy: #分库策略
            standard:
              precise-algorithm-class-name: com.paywharf.ordershadingjdbcdemo.algorithm.DBShardingAlgorithm  #单个精确查询
              range-algorithm-class-name: com.paywharf.ordershadingjdbcdemo.algorithm.RangeDataBaseShardingAlgorithm  #范围查询
              sharding-column: req_initiate_date  #分表column
          key-generator:  # 内置雪花id 生成
            column: id
            props:
              worker:
                id: 123
            type: SNOWFLAKE
          table-strategy: #分表策略
            standard:
              precise-algorithm-class-name: com.paywharf.ordershadingjdbcdemo.algorithm.TableShardingAlgorithm
              range-algorithm-class-name: com.paywharf.ordershadingjdbcdemo.algorithm.RangeTableShardingAlgorithm2
              sharding-column: req_initiate_date
```
## 注意事项:
cicd 部署时,需在启动参数中加上该参数的设置,不同机器id不同.最大1024  
spring.shardingsphere.sharding.tables.transaction_request.key-generator.props.worker.id=123  

#精确搜索,范围搜索:
重写了精确查询和范围查询的方法.库名, 表名在代码里写死了.  
精确搜索对应= ,插入等单条SQL.  
范围搜索对应 between, <=,>= 等 SQL.  
不带 时间范围查询的, 会导致全库全表查询.尽量避免. 为了应对这种情况,我写了一个工具类,根据Id ,逆推回订单创建时间,根据创建时间,得到订单当月的起止年月时分秒区间.


##Demo 示例:
TransActionRequestController.  
提供了插入,时间范围查询,反推时间区间的demo.反推时间区间要注意的是,由于没设置时区,springmvc 会按照utc 0时区显示.
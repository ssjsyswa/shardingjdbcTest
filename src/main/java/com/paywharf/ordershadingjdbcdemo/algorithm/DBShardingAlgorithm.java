package com.paywharf.ordershadingjdbcdemo.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 * @author : JSY
 * @description : 数据库选择器
 * @create : 2021/10/18 12:35
 */

@Slf4j
public class DBShardingAlgorithm implements PreciseShardingAlgorithm<Date> {


    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Date> shardingValue) {

        System.out.println("DB  PreciseShardingAlgorithm  ");
        // 真实节点
        availableTargetNames.stream().forEach((item) -> {
            log.info("actual node db:{}", item);
        });

        log.info("logic table name:{},rout column:{}", shardingValue.getLogicTableName(), shardingValue.getColumnName());

        //精确分片
        log.info("column value:{}", shardingValue.getValue());

        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(shardingValue.getValue());

        String year = date.split("-")[0];

//        long db_index = orderId & (2 - 1);

//        for (String each : availableTargetNames) {
//            if (each.equals("b"+db_index)) {
//                return "";
//            }
//        }
        return "dbipg-"+year;

//        throw new IllegalArgumentException();
    }
}
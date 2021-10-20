package com.paywharf.ordershadingjdbcdemo.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 自定义范围分库
 */
@Slf4j
public class RangeDataBaseShardingAlgorithm implements RangeShardingAlgorithm<Date> {
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Date> shardingValue) {

        Date end = shardingValue.getValueRange().upperEndpoint();// 上限
        Date start = shardingValue.getValueRange().lowerEndpoint();// 下限

        List<String> monthBetween = null ;
        Set<String> result  = new HashSet<>(availableTargetNames.size());

        try {
            monthBetween = ShardingUtil.getMonthBetween(start, end);
        } catch (Exception e) {
            e.printStackTrace();
        }

        monthBetween.forEach(e->{
            result.add("dbipg-"+e.split("-")[0]);
        });

        log.info("范围查找数据库节点为:{}",result);

        return result;
    }

}
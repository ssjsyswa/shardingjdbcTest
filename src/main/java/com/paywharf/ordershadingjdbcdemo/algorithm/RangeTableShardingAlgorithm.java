package com.paywharf.ordershadingjdbcdemo.algorithm;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 自定义范围分库
 */
public class RangeTableShardingAlgorithm  implements RangeShardingAlgorithm<Date> {
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Date> shardingValue) {

        Date end = shardingValue.getValueRange().upperEndpoint();// 上限
        Date start = shardingValue.getValueRange().lowerEndpoint();// 下限

        List<String> monthBetween = null ;
//        Set<String> year  = new HashSet<>(availableTargetNames.size());
//        Set<String> month  = new HashSet<>(4);
        Set<String> tmonth  = new HashSet<>(4);

        try {
            monthBetween = ShardingUtil.getMonthBetween(start, end);
        } catch (Exception e) {
            e.printStackTrace();
        }

        monthBetween.forEach(e->{
            String[] split = e.split("-");
            String month = split[1];
            tmonth.add("transaction_request" + ShardingUtil.getResult(month));
        });

        return tmonth;
    }


}
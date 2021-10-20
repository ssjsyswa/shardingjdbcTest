package com.paywharf.ordershadingjdbcdemo.algorithm;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.*;

/**
 * 自定义范围分库
 */
public class RangeTableShardingAlgorithm2 implements RangeShardingAlgorithm<Date> {
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

        for (String availableTargetName : availableTargetNames) {
            String[] split = availableTargetName.split("_");
            String year = split[2];


            for (String s : monthBetween) {
                if (s.contains(year)) {
                    String month = s.split("-")[1];
                    tmonth.add ("transaction_request_"+year + ShardingUtil.getResult(month));
                }
            }
        }
        return tmonth;
    }


}
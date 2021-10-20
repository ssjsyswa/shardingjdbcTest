package com.paywharf.ordershadingjdbcdemo.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 * @author : JSY
 * @description :
 * @create : 2021/10/18 12:36
 */
public class TableShardingAlgorithm implements PreciseShardingAlgorithm<Date> {

    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        String value = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(preciseShardingValue.getValue());

        String month =   value.split("-")[1] ;

        String result = ShardingUtil.getResult(month);

        return "transaction_request" + result;
    }

}
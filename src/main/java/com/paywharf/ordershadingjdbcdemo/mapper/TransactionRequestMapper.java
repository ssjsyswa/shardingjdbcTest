package com.paywharf.ordershadingjdbcdemo.mapper;

import com.paywharf.ordershadingjdbcdemo.entity.TransactionRequest;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author : JSY
 * @description :
 * @create : 2021/10/15 14:44
 */
public interface TransactionRequestMapper {
    public int save(TransactionRequest transactionRequest);

    public List<TransactionRequest> findByInitTime( @Param("startTime") Date startTime,
                                                    @Param("endTime") Date endTime);
}

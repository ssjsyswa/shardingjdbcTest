package com.paywharf.ordershadingjdbcdemo.algorithm;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author : JSY
 * @description : 记录雪花id 的起始结束时间
 * @create : 2021/10/20 11:30
 */


@Data
@Builder
public class BeginAndEndDate {
    private Date startTime ;
    private Date endTime ;
}

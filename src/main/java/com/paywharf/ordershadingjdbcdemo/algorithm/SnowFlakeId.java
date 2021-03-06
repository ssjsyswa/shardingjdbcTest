package com.paywharf.ordershadingjdbcdemo.algorithm;

import java.util.Calendar;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;


public class SnowFlakeId {

    private static long twepoch = 1288834974657L;

    private static long workerIdBits = 5L;
    private static long datacenterIdBits = 5L;

    private static final long sequenceBits = 12L;

    private static long workerIdShift = sequenceBits;
    private static long dataCenterIdShift = sequenceBits + workerIdBits;
    private static long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.NOVEMBER, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        twepoch = calendar.getTimeInMillis();
    }
    
    public static JSONObject parseInfo(long id) {
        String sonwFlakeId = Long.toBinaryString(id);
        int len = sonwFlakeId.length();
        JSONObject jsonObject = new JSONObject();
        int sequenceStart = (int) (len < workerIdShift ? 0 : len - workerIdShift);
        int workerStart = (int) (len < dataCenterIdShift ? 0 : len - dataCenterIdShift);
        int timeStart = (int) (len < timestampLeftShift ? 0 : len - timestampLeftShift);
        String sequence = sonwFlakeId.substring(sequenceStart, len);
        String workerId = sequenceStart == 0 ? "0" : sonwFlakeId.substring(workerStart, sequenceStart);
        String dataCenterId = workerStart == 0 ? "0" : sonwFlakeId.substring(timeStart, workerStart);
        String time = timeStart == 0 ? "0" : sonwFlakeId.substring(0, timeStart);
        int sequenceInt = Integer.valueOf(sequence, 2);
        jsonObject.put("sequence", sequenceInt);
        int workerIdInt = Integer.valueOf(workerId, 2);
        jsonObject.put("workerId", workerIdInt);
        int dataCenterIdInt = Integer.valueOf(dataCenterId, 2);
        jsonObject.put("dataCenter", dataCenterIdInt);
        long diffTime = Long.parseLong(time, 2);
        long timeLong = diffTime + twepoch;
        Date date = fromatTime(timeLong);
        jsonObject.put("date", date);
        return jsonObject;
    }

    /**
     *  ??????????????????id ???????????????
     * @param id
     * @return Date ??????id ???????????????
     */
    public static Date getSonwFlakeDate(long id) {
        SnowFlakeId snowFlakeId = new SnowFlakeId();
        JSONObject jsonObject = snowFlakeId.parseInfo(id);
        Object dateObj = jsonObject.get("date");
        return (Date) dateObj;
    }

    private static Date fromatTime(long date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        return calendar.getTime();
    }


    /**
     *  ?????? ???????????????????????????id ???????????????
     * @param  long snowFlakeId
     * @return ?????????????????????id ???????????????
     */
    public static BeginAndEndDate getBeginAndEndDate(long snowFlakeId){
        Date sonwFlakeDate = getSonwFlakeDate(snowFlakeId);

        Date monthBegin = getMonthBegin(sonwFlakeDate);
        Date monthEnd = getMonthEnd(sonwFlakeDate);

        return  BeginAndEndDate.builder().startTime(monthBegin).endTime(monthEnd).build();

    }


    private static  Date getMonthBegin(Date time) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(time);
        //?????????1???,?????????????????????????????????
        cal.set(Calendar.DAY_OF_MONTH, 1);
        //???????????????0
        cal.set(Calendar.HOUR_OF_DAY, 0);
        //???????????????0
        cal.set(Calendar.MINUTE, 0);
        //????????????0
        cal.set(Calendar.SECOND, 0);
        //???????????????0
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    private static Date getMonthEnd(Date time) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(time);
        //???????????????????????????
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        //???????????????23
        cal.set(Calendar.HOUR_OF_DAY, 23);
        //???????????????59
        cal.set(Calendar.MINUTE, 59);
        //????????????59
        cal.set(Calendar.SECOND,59);
        //???????????????999
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }


//    public static void main(String[] args) {
////        DefaultKeyGenerator defaultKeyGenerator = new DefaultKeyGenerator();
//        SnowflakeShardingKeyGenerator defaultKeyGenerator = new SnowflakeShardingKeyGenerator();
//        long id = defaultKeyGenerator.generateKey().longValue();
//        SonwFlakeId sonwFlakeId = new SonwFlakeId();
//        JSONObject jsonObject = sonwFlakeId.parseInfo(id);
//        System.out.println("------------------------------------------");
//        System.out.println(jsonObject);
//        Object dateObj = jsonObject.get("date");
//        System.out.println("date:" + dateObj);
//        System.out.println("------------------------------------------");
//    }

}
package com.paywharf.ordershadingjdbcdemo.algorithm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author : JSY
 * @description :
 * @create : 2021/10/19 15:35
 */

public class ShardingUtil {

    public static List<String> getMonthBetween(Date minDate, Date maxDate) throws Exception {
        ArrayList<String> result = new ArrayList<String>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月

        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();

        min.setTime(minDate);
        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

        max.setTime( maxDate);
        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

        Calendar curr = min;
        while (curr.before(max)) {
            result.add(sdf.format(curr.getTime()));
            curr.add(Calendar.MONTH, 1);
        }

        return result;
    }

    public static String getResult(String month) {
        String result;
        if (month.equals("01") || month.equals("02")|| month.equals("03")){
            result = "_1";
        }
        else if (month.equals("04") || month.equals("05")|| month.equals("06")){
            result = "_2";
        }
        else if (month.equals("07") || month.equals("08")|| month.equals("09")){
            result = "_3";
        }
        else{
            result = "_4";
        }
        return result;
    }


}

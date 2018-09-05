package com.niudingfeng.financialplannerlin.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName Util
 * @Description TODO
 * @Author lin
 * @Date 2018/9/5 15:07
 * @Version 1.0
 **/
public class Util {
    public static String getUUID() {
         return UUID.randomUUID().toString().replace("-","");
    }
    public static String getStringDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateString = formatter.format(new Date());
        return dateString;
    }
}

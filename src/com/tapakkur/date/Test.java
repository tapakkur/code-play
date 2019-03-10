package com.tapakkur.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * created by tapakkur on 2019/2/2
 */
public class Test {
    public static void main (String args[]) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        StringBuffer sb = new StringBuffer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String  str = sdf.format(date);
        System.out.println("now is " + str);
        sb.append(calendar.get(Calendar.YEAR)).append("/");
        sb.append(calendar.get(Calendar.MONTH) + 1).append("/");
        sb.append(calendar.get(Calendar.DAY_OF_MONTH)).append(" ");
        sb.append(calendar.get(Calendar.HOUR_OF_DAY)).append(":");
        sb.append(calendar.get(Calendar.MINUTE)).append(":");
        sb.append(calendar.get(Calendar.SECOND)).append(" ");
        sb.append(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("now is " + sb);
    }
}

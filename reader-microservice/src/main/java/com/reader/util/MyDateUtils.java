package com.reader.util;

import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.FastDateFormat;

import java.text.ParseException;
import java.util.*;

/**
 *
 * 时间处理api
 * Created by alan on 17/1/10.
 */
public class MyDateUtils {

    private static final FastDateFormat FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("Asia/Shanghai"));
    private static final FastDateFormat FORMAT_DATE = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("Asia/Shanghai"));
    private static final FastDateFormat FORMAT_MONTH = FastDateFormat.getInstance("yyyy-MM", TimeZone.getTimeZone("Asia/Shanghai"));
    private static final FastDateFormat FORMAT_YEAR = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("Asia/Shanghai"));

    private static Calendar c = Calendar.getInstance();

    public static String time2String(Date date) {
        return FORMAT.format(date);
    }

    public static String date2String(Date date) {
        return FORMAT_DATE.format(date);
    }

    public static String dateMonth2String(Date date) {
        return FORMAT_MONTH.format(date);
    }

    public static String dateYear2String(Date date) {
        return FORMAT_YEAR.format(date);
    }

    public static Date String2Datetime(String date) {
        try {
            return DateUtils.parseDate(date, new String[]{"yyyy-MM-dd HH:mm:ss"});
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date String2Date(String date) {
        try {
            return DateUtils.parseDate(date, new String[]{"yyyy-MM-dd"});
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static Long timeAtEndOfDay() {
        return String2Datetime(timeAtEndOfDayStr()).getTime();
    }

    public static Long timeAtStartOfDay() {
        return String2Datetime(timeAtStartOfDayStr()).getTime();
    }


    public static String timeAtStartOfDayStr() {
        return FORMAT_DATE.format(new Date()) + " 00:00:00";
    }

    public static String timeAtEndOfDayStr() {
        return FORMAT_DATE.format(new Date()) + " 23:59:59";
    }


    public static String timeAtStartOfDayStr(Date date) {
        return FORMAT_DATE.format(date) + " 00:00:00";
    }

    public static String timeAtEndOfDayStr(Date date) {
        return FORMAT_DATE.format(date) + " 23:59:59";
    }


    /**
     * 获取上个星期的起始日期
     * @return
     */
    public static Map<String,String> getLastWeek() {
        Map<String,String> map=new HashMap<>();
        c.clear();
        c.setTime(new Date(timeAtStartOfDay()));
        c.add(Calendar.WEEK_OF_YEAR, -1);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        Date lastWeekStart = c.getTime();

        c.setTime(new Date(timeAtEndOfDay()));
        c.set(Calendar.DAY_OF_WEEK, 1);
        Date lastWeekEnd = c.getTime();
        map.put(time2String(lastWeekStart), time2String(lastWeekEnd));
        return map;
    }


    /**
     * 获取今年的起始日期
     * @return
     */
    public static Map<String,String> getThisYear() {
        Map<String,String> map=new HashMap<>();
        int year = c.get(Calendar.YEAR);
        c.clear();
        c.set(Calendar.YEAR, year);
        Date that = c.getTime();
        String currYearFirst = timeAtStartOfDayStr(that);

        c.clear();
        c.set(Calendar.YEAR, year);
        c.roll(Calendar.DAY_OF_YEAR, -1);
        String currYearLast = timeAtEndOfDayStr(c.getTime());
        map.put(currYearFirst, currYearLast);
        return map;
    }

    /**
     * 获取前一年的起始日期
     * @return
     */
    public static Map<String,String> getLastYear() {
        Map<String,String> map=new HashMap<>();
        int year = c.get(Calendar.YEAR);
        c.clear();
        c.set(Calendar.YEAR, year - 1);
        String currYearFirst = timeAtStartOfDayStr(c.getTime());

        c.clear();
        c.set(Calendar.YEAR, year - 1);
        c.roll(Calendar.DAY_OF_YEAR, -1);
        String currYearLast = timeAtEndOfDayStr(c.getTime());
        map.put(currYearFirst, currYearLast);
        return map;
    }

    /**
     * 获取这个月的起始日期
     * @return
     */
    public static Map<String,String> getThisMonth() {
        Map<String,String> map=new HashMap<>();
        c.add(Calendar.MONTH, 1);
        c.set(Calendar.DAY_OF_MONTH, 1);
        String currentstart = timeAtStartOfDayStr(c.getTime());

        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date currentend = c.getTime();
        map.put(currentstart, timeAtEndOfDayStr(currentend));
        return map;
    }

    /**
     * 获取上个月的起始日期
     * @return
     */
    public static Map<String,String> getLastMonth() {
        Map<String,String> map=new HashMap<>();
        int month = c.get(Calendar.MONTH) - 1;
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, 1);
        String currentstart = timeAtStartOfDayStr(c.getTime());

        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date currentend = c.getTime();
        map.put(currentstart, timeAtEndOfDayStr(currentend));
        return map;
    }


    /**
     * 获取昨天的起始日期
     * @return
     */
    public static Map<String,String> getYesterDay() {
        Map<String,String> map=new HashMap<>();
        Date today = new Date();
        c.setTime(today);
        c.add(Calendar.DAY_OF_WEEK, -1);
        map.put(timeAtStartOfDayStr(c.getTime()), timeAtEndOfDayStr(c.getTime()));
        return map;
    }


    /**
     * 计算两个日期之间的天数差
     */
    public static Integer diff(Date start, Date end) {
        c.clear();
        c.setTime(String2Date(date2String(start)));
        long time1 = c.getTimeInMillis();

        c.setTime(String2Date(date2String(end)));
        long time2 = c.getTimeInMillis();
        Long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Math.abs(between_days.intValue());
    }


    /**
     * 计算两个时间的差
     */
    public static int minutes(Date start,Date end) {
        long diff = (end.getTime() - start.getTime()) / 1000;
        if(diff<0)
            return -1;
        if (diff / 60 < 60)
            return (int) diff / 60;
        if (diff / 3600 <= 24 && diff / 3600 > 0)
            return (int) diff / 3600;
        return diff(start, end);
    }


    /**
     * http://www.epochconverter.com/webkit =>去该网站的js中找到算法
     * webkit时间转unix时间
     * @param time
     * @return
     */
    public static long webkitTime2Unix(long time){
        long sec=Math.round((double) (time/1000000));
        sec-=11644473600L;
        return new Date(sec*1000).getTime();
    }

    /**
     * unix时间转Webkit时间
     * @param time
     * @return
     */
    public static long unixTime2WebKitTime(long time){
        long sec=time/1000;
        sec+=11644473600L;
        return sec*1000000;
    }

}

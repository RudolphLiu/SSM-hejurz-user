package com.hjrz.user.util;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @ClassName HJRZDateTimeUtil
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月6日 下午1:54:52
 * @version 1.0.0
 */
public class HJRZDateTimeUtil {
  //一天结束
  public static Date getEndOfDay(Date date) {
    DateTime dt = new DateTime(date);
    return dt.withTime(23, 59, 59, 999).toDate();
  }
  
  //计算时间差
  public static Duration getDuration(Date start, Date end) {
    Duration duration = new Interval(new DateTime(start), new DateTime(end)).toDuration();
    return duration;
  }
  
  //给定时间范围来计算时间差
  public static boolean isInDayRange(Date start,Date end,Integer days) {
    boolean isIn = false;
    Duration duration = getDuration(start, end);
    if(duration!=null && duration.getStandardDays() < days){
      isIn = true;
    }
    return isIn;
  }
  
  //当前日期一天开始的时刻
  public static Date getStartOfDay(Date date) {
    DateTime dt = new DateTime(date);
    return dt.withTime(0, 0, 0, 0).toDate();
  }
  
  /**
   * 多少分钟前
   */
  public static String getLastUpdateTime(Date begin, Date end) {

    DateTime start_dt = new DateTime(begin);
    DateTime end_dt = new DateTime(end);
    StringBuilder combined_str = new StringBuilder();
    if (isAfter(begin, end)) {
      Duration duration = new Duration(start_dt, end_dt);
      // Interval interval = new Interval(start_dt,end_dt);

      // Period period = interval.toPeriod();
      long days = duration.getStandardDays();
      long hours = duration.getStandardHours();
      long mins = duration.getStandardMinutes();
      long secs = duration.getStandardSeconds();

      boolean needAppend = true;
      if (days > 0 && needAppend) {
        combined_str.append(days).append(" Days ");
        needAppend = false;
      }
      if (hours > 0 && needAppend) {
        combined_str.append(hours).append(" Hours ");
        needAppend = false;

      }

      if (mins > 0 && needAppend) {
        combined_str.append(mins).append(" Mins ");
        needAppend = false;

      }

      if (secs > 0 && needAppend) {
        combined_str.append(secs).append(" Secs ");
        needAppend = false;

      }

    } else {
      combined_str.append("0").append(" Secs ");
    }

    combined_str.append("ago");
    return combined_str.toString();
  }
  
  /**
   * 多少分钟前
   */
  public static String getLastUpdateTimeChinese(Date begin, Date end) {

    DateTime start_dt = new DateTime(begin);
    DateTime end_dt = new DateTime(end);
    StringBuilder combined_str = new StringBuilder();
    if (isAfter(begin, end)) {
      Duration duration = new Duration(start_dt, end_dt);
      // Interval interval = new Interval(start_dt,end_dt);

      // Period period = interval.toPeriod();
      long days = duration.getStandardDays();
      long hours = duration.getStandardHours();
      long mins = duration.getStandardMinutes();
     // long secs = duration.getStandardSeconds();

      boolean needAppend = true;
      if (days > 0 && needAppend) {
        combined_str.append(days).append(" 天");
        needAppend = false;
      }
      if (hours > 0 && needAppend) {
        combined_str.append(hours).append(" 小时");
        needAppend = false;

      }

      if (mins > 0 && needAppend) {
        combined_str.append(mins).append(" 分");
        needAppend = false;
      }
    } 
    return combined_str.toString();
  }
  
public static final String PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
  
  public static final String YYYYMMDD = "yyyyMMdd";

  /**
   * yyyy/MM/dd HH:mm:ss
   */
  public static final String YYYY_MM_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";



  public static final String YYYY_MM_DD_HH_MM_SS_DASH = "yyyy-MM-dd HH:mm:ss";

  public static final String MM_DD_HH_MM_SS_DASH = "MM-dd HH:mm:ss";

  public static final String MMDDHHMMssSSS = "MMddHHmmssSSS";



  public static final String YYYYMMDDHHMMssSSS = "yyyyMMddHHmmssSSS";

  public static final String YYYYMMDDHHMMss = "yyyyMMddHHmmss";

  public static final String TIMEZONE_SHANGHAI = "Asia/Shanghai";

  /**
   * 只返回日期信息
   */
  public static Date getDate(Date date) {
    DateTime dt = new DateTime(date);
    return DateTime.parse(dt.toString(PATTERN_YYYY_MM_DD)).toDate();
  }

  
  /**
   * 返回对应天数的时间
   * @param date
   * @param day
   * @return
   */
  public static Date  getDateTime(Date date,int day){
         Calendar now = Calendar.getInstance();  
           now.setTime(date);  
           now.set(Calendar.DATE, now.get(Calendar.DATE) + (day));  
         return now.getTime();  
  }

  /**
   * 将 当前时间转化为String字符串 默认格式yyyy-MM-dd HH:mm:ss
   * 
   * @param date
   * @return yulong
   */
  public static String formatDate(Date date) {
    DateTime dt = new DateTime(date);
    return dt.toString(YYYY_MM_DD_HH_MM_SS_DASH);
  }
 
  /**
   * 将 当前时间转化为String字符串 转为指定格式
   * 
   * @param date
   * @param format
   * @return yulong
   */
  public static String formatDate(Date date, String format) {
    DateTime dt = new DateTime(date);
    return dt.toString(format);
  }
  
  //转换为 yyyy-mm-dd
  public static String convertDatetime2DateStr(String datetime) {
    DateTimeFormatter dtf = DateTimeFormat.forPattern(YYYY_MM_DD_HH_MM_SS_DASH);
    DateTime dt = DateTime.parse(datetime, dtf);
    return dt.toString(PATTERN_YYYY_MM_DD);
  }
  
  /**
   * 把字符串日期解析为Date对象
   * 
   * @param datetime
   * @param pattern 解析 格式
   * @return
   */
  public static Date parseStr2Date(String datetime, String pattern) {
    DateTimeFormatter dtf = DateTimeFormat.forPattern(pattern);
    DateTime dt = DateTime.parse(datetime, dtf);
    return dt.toDate();
  }
  
  /**
   * 使用默认格式解析 yyyy-MM-dd HH:mm:ss
   * 
   * @param datetime
   * @return
   */
  public static Date parseStr2Date(String datetime) {
    DateTimeFormatter dtf = DateTimeFormat.forPattern(YYYY_MM_DD_HH_MM_SS_DASH);
    DateTime dt = DateTime.parse(datetime, dtf);
    return dt.toDate();
  }
  
  /**
   * 时间先后判断
   * 
   * @param begin 开始时间
   * @param end   结束时间
   */
  public static boolean isAfter(Date begin, Date end) {
    DateTime begin_time = new DateTime(begin);
    DateTime end_time = new DateTime(end);
    return end_time.isAfter(begin_time.getMillis());
  }
}

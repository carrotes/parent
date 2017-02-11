package com.itcuc.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtils {
	
	    public static void main(String[] args) {
		 
		 
	 }
	 
	
	  //试一试  。
		
	/**
	   * 获取现在时间
	   * 
	   * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
	   */
	public static String getStringDatelong() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}
	/**
	   * 获取现在时间
	   * 
	   * @return 返回短时间字符串格式yyyy-MM-dd
	   */
	public static String getStringDateShort() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}
	/**
	   * 获取时间 小时:分;秒 HH:mm:ss
	   * 
	   * @return
	   */
	public static String getTimeShort() {
	   SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
	   Date currentTime = new Date();
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}
	/**
	   * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
	   * 
	   * @param strDate
	   * @return
	   */
	public static Date strToDateLong(String strDate) {
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   ParsePosition pos = new ParsePosition(0);
	   Date strtodate = formatter.parse(strDate, pos);
	   return strtodate;
	}
	/**
	   * 将长时间格式时间转换为字符串 yyyy-MM-dd HH:mm:ss
	   * 
	   * @param dateDate
	   * @return
	   */
	public static String dateToStrLong(java.util.Date dateDate) {
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String dateString = formatter.format(dateDate);
	   return dateString;
	}
	/**
	   * 将短时间格式时间转换为字符串 yyyy-MM-dd
	   * 
	   * @param dateDate
	   * @param k
	   * @return
	   */
	public static String dateToStr(java.util.Date dateDate) {
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   String dateString = formatter.format(dateDate);
	   return dateString;
	}
	/**
	   * 将短时间格式字符串转换为时间 yyyy-MM-dd 
	   * 
	   * @param strDate
	   * @return
	   */
	public static Date strToDate(String strDate) {
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   ParsePosition pos = new ParsePosition(0);
	   Date strtodate = formatter.parse(strDate, pos);
	   return strtodate;
	}
	/**
	   * 得到现在时间
	   * 
	   * @return
	   */
	public static Date getNow() {
	   Date currentTime = new Date();
	   return currentTime;
	}
	/**
	   * 提取一个月中的最后一天
	   * 
	   * @param day
	   * @return
	   */
	public static Date getLastDate(long day) {
	   Date date = new Date();
	   long date_3_hm = date.getTime() - 3600000 * 34 * day;
	   Date date_3_hm_date = new Date(date_3_hm);
	   return date_3_hm_date;
	}
	/**
	   * 得到现在时间
	   * 
	   * @return 字符串 yyyyMMdd HHmmss
	   */
	public static String getStringToday() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}
	/**
	   * 得到现在小时
	   */
	public static String getHour() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String dateString = formatter.format(currentTime);
	   String hour;
	   hour = dateString.substring(11, 13);
	   return hour;
	}
	/**
	   * 得到现在分钟
	   * 
	   * @return
	   */
	public static String getTime() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String dateString = formatter.format(currentTime);
	   String min;
	   min = dateString.substring(14, 16);
	   return min;
	}
	
	
	/**
	   * 根据用户传入的时间表示格式，返回当前时间的格式 如果是yyyyMMdd，注意字母y不能大写。
	   * 
	   * @param sformat
	   *             yyyyMMddhhmmss
	   * @return
	   */
	public static String getUserDate(String sformat) {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat(sformat);
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}
	
	
	
	/**
	  * 得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数
	  */
	 public static String getNextDay(String nowdate, String delay) {
	  try{
	  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	  String mdate = "";
	  Date d = strToDate(nowdate);
	  long myTime = (d.getTime() / 1000) + Integer.parseInt(delay) * 24 * 60 * 60;
	  d.setTime(myTime * 1000);
	  mdate = format.format(d);
	  return mdate;
	  }catch(Exception e){
	   return "";
	  }
	 }  
	 

	 
	 /**
	  * 判断是否润年
	  * 
	  * @param ddate
	  * @return
	  * 
	  * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
	  * 3.能被4整除同时能被100整除则不是闰年
	  */
	  
	 public static boolean isLeapYear(String ddate) {

	  Date d = strToDate(ddate);
	  GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
	  gc.setTime(d);
	  int year = gc.get(Calendar.YEAR);
	  if ((year % 400) == 0)
	   return true;
	  else if ((year % 4) == 0) {
	   if ((year % 100) == 0)
	    return false;
	   else
	    return true;
	  } else
	   return false;
	 }
	 
	
	 
	 /**
	  * 判断二个时间是否在同一个周
	  * 
	  * @param date1
	  * @param date2
	  * @return
	  */
	 public static boolean isSameWeekDates(Date date1, Date date2) {
	  Calendar cal1 = Calendar.getInstance();
	  Calendar cal2 = Calendar.getInstance();
	  cal1.setTime(date1);
	  cal2.setTime(date2);
	  int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);
	  if (0 == subYear) {
	   if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
	    return true;
	  } else if (1 == subYear && 11 == cal2.get(Calendar.MONTH)) {
	   // 如果12月的最后一周横跨来年第一周的话则最后一周即算做来年的第一周
	   if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
	    return true;
	  } else if (-1 == subYear && 11 == cal1.get(Calendar.MONTH)) {
	   if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
	    return true;
	  }
	  return false;
	 }
	 

	 
	 /**
	  * 产生周序列,即得到当前时间所在的年度是第几周
	  * 
	  * @return
	  */
	 public static String getSeqWeek() {
	  Calendar c = Calendar.getInstance(Locale.CHINA);
	  String week = Integer.toString(c.get(Calendar.WEEK_OF_YEAR));
	  if (week.length() == 1)
	   week = "0" + week;
	  String year = Integer.toString(c.get(Calendar.YEAR));
	  return year + week;
	 }
	 
	 

	 
	 /**
	  * 两个时间之间的天数
	  * 
	  * @param date1
	  * @param date2
	  * @return
	  */
	 public static long getDays(String date1, String date2) {
	  if (date1 == null || date1.equals(""))
	   return 0;
	  if (date2 == null || date2.equals(""))
	   return 0;
	  // 转换为标准时间
	  SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	  java.util.Date date = null;
	  java.util.Date mydate = null;
	  try {
	   date = myFormatter.parse(date1);
	   mydate = myFormatter.parse(date2);
	  } catch (Exception e) {
	  }
	  long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
	  return day;
	 } 
	}
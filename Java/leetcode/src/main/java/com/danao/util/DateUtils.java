package com.danao.util;

import com.danao.command.DateFormatConstant;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author zhang
 * @version 1.0
 * @classname DateUtils
 * @descriptionclass
 * 1.处理时间的工具类
 * 2.不断改进中
 * @createdate 2019/2/12
 * @since 1.0
 */
public class DateUtils {


	/**
	 *
	 * @return
	 */
	public static Boolean isEmpty(String string){
		if(string == null || string.length() == 0){
			return true;
		}else {
			return false;
		}
	}


	/**
	 * 获取当前时间
	 * 格式为 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getNow(){
		LocalDateTime time = LocalDateTime.now();
		return getDate(time,DateFormatConstant.DATE_TIME_PATTERN);
	}

	/**
	 * jdk8之后获取时间 线程安全
	 * 格式化时间
	 * @param localDateTime
	 * @param dateFormatConstant
	 * @return
	 */
	public static String getDate(LocalDateTime localDateTime,DateFormatConstant dateFormatConstant){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatConstant.getDateFormat());
		String formattedDateTime = localDateTime.format(formatter);
		//System.out.println(formattedDateTime);
		return formattedDateTime;
	}



	/**
	 * 计算时间秒差,不管那个值大，都是计算的整数
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 */
	public static Long diffDateToSeconds(Date dateOne, Date dateTwo){
		Long seconds = 0L;
		//dateOne > dateTwo
		if(dateOne.compareTo(dateTwo) == 1){
			//System.out.println("大于");
			//后面的减去前面的
			seconds = Duration.between(dateTwo.toInstant(), dateOne.toInstant()).getSeconds();
		}else {
			//System.out.println("小于");
			seconds = Duration.between(dateOne.toInstant(),dateTwo.toInstant()).getSeconds();
		}
		return seconds;
	}

}

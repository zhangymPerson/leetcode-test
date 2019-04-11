package com.danao.util;

import com.danao.command.LogFormat;
import sun.util.resources.LocaleData;

import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @classname LoggerUtils
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/11
 * @since 1.0
 */
public class LoggerUtils {
	/**
	 * 打印日志
	 */
	public static void print(Object obj){
		print(obj,DateUtils.getNow(),LogFormat.INFO);
	}

	public static void print(Object obj, String date,LogFormat logFormat){
		String info = String.format("%s %s : %s",date,logFormat,obj.toString());
		System.out.print(info);
	}

	public static void println(Object obj){
		println(obj,DateUtils.getNow(),LogFormat.INFO);
	}

	public static void println(Object obj, String date,LogFormat logFormat){
		String info = String.format("%s %s : %s",date,logFormat,obj.toString());
		System.out.println(info);
	}
}

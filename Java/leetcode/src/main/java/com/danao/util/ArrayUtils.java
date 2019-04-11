package com.danao.util;

import com.danao.command.LogFormat;

/**
 * @author zhang
 * @version 1.0
 * @classname ArrayUtils
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/11
 * @since 1.0
 */
public class ArrayUtils {

	public static void toString(int[] arr){
		toString(arr,LogFormat.EMPTY);
	}

	/**
	 * 打印数组
	 * @param arr 要打印的数组
	 * @param logFormat 打印的状态 （计算前 BEFORE 计算后 AFTER 无 EMPTY）
	 */
	public static void toString(int[] arr, LogFormat logFormat){
		if(arr == null || arr.length == 0){
			System.out.println("arr = null");
		}else {
			LoggerUtils.print(logFormat.getLogFormat());
			for(int i : arr){
				System.out.print(" " + i);
			}
			System.out.println("");
		}

	}

	public static boolean isEmpty(int[] arr){
		return arr == null || arr.length == 0 ? true : false;
	}

}

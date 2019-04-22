package com.danao.util;

import org.apache.commons.lang3.*;

import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhang
 * @version 1.0
 * @classname NumberUtils
 * @descriptionclass class describe
 * 1.数字工具类
 * 2.生成随机数字
 * @createdate 2019/4/11
 * @since 1.0
 */
public class NumberUtils {


	/**
	 * 生成i以内的随机整数,不包含i
	 * @return
	 */
	public static int randomNum(int i){
		ThreadLocalRandom random = ThreadLocalRandom.current();
		return random.nextInt(i);
	}

	/**
	 * 生成不重复的数组
	 * @param num
	 * @param max
	 * @return
	 */
	public static int[] randomArrNoRepate(int num,int max){
		int[] arr = {};
		if(num > max){
			throw new RuntimeException("数组长度不能大于取值长度");
		}
		Set<Integer> set = new LinkedHashSet<>(num);
		while(set.size() < num){
			Integer i = randomNum(max);
			set.add(i);
		}

		Integer[] integers = new Integer[num];
		// set 转 Integer
		integers = set.toArray(integers);
		//interger[] 转 int[]
		return org.apache.commons.lang3.ArrayUtils.toPrimitive(integers);
	}




	/**
	 * 生成不重复(含负数的)数组
	 * @param num 数组长度
	 * @param max 取值范围 [-max ~ max]
	 * @return
	 */
	public static int[] randomArrNoRepateHasNegative(int num,int max){
		int[] arr = {};
		if(num > max){
			throw new RuntimeException("数组长度不能大于取值长度");
		}
		Set<Integer> set = new LinkedHashSet<>(num);
		while(set.size() < num){
			Integer i = randomNum(max);
			if(randomResult()) {
				set.add(i);
			}else {
				set.add(-i);
			}
		}

		Integer[] integers = new Integer[num];
		// set 转 Integer
		integers = set.toArray(integers);
		//interger[] 转 int[]
		return org.apache.commons.lang3.ArrayUtils.toPrimitive(integers);
	}


	/**
	 * 随机正反
	 * @return
	 */
	public static boolean randomResult(){
		int i = randomNum(2);
		return i == 1 ? true:false;
	}


	/**
	 * 生成指定长度的数组
	 * @param num 数组长度
	 * @param max 值取值范围
	 * @return
	 */
	public static int[] randomArr(int num,int max) {
		int[] arr = new int[num];
		for(int i = 0;i < num;i++){
			arr[i] = randomNum(max);
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
		System.out.println(randomNum(2));
	}

}

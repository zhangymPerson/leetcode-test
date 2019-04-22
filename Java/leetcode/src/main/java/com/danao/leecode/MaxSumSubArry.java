package com.danao.leecode;

import com.danao.util.ArrayUtils;
import com.danao.util.LoggerUtils;
import com.danao.util.NumberUtils;

/**
 * @author zhang
 * @version 1.0
 * @classname MaxSumSubArry
 * @descriptionclass class describe
 * 1.最大子序和
 * 2.给定一个整数数组 nums ，找到一个具有最大和的连续子数组
 * （子数组最少包含一个元素），返回其最大和。
 * @createdate 2019/4/19
 * @since 1.0
 */
public class MaxSumSubArry {

	/**
	 * 判断前面数之和的大小
	 * 前面加起来 > 0 ; 则 不管后面正数负数 都直接加上与前数之和比较
	 * 前面的数加起来 < 0; 则不管后面的数为多少，说明 前面的数 + 后面的数大 < 后面单独的数
	 * @param nums
	 * @return
	 */
	public static int getMax(int[] nums){
		int res = nums[0];
		int sum = 0;
		for (int num : nums) {
			if (sum > 0){
				sum += num;
			}
			else{
				sum = num;
			}
			res = Math.max(res, sum);
		}
		//System.out.println(res);
		return res;
	}


	public static void main(String[] args) {
		int[] arr = NumberUtils.randomArrNoRepateHasNegative(20,20);
		//int[] brr = new int[]{4 ,-5 ,-4, -9 ,8 ,-3 ,0 ,2 ,-19 ,17 ,6 ,-14, 3, -17, -2 ,10 ,-10 ,11 ,18 ,9};
		//int[] brrs = new int[]{-5 ,-4, -9 ,-3 ,0 ,-19 -14,  -17, -2 -10 };
		ArrayUtils.toString(arr);
		LoggerUtils.println("max  = " + getMax(arr));
	}

}

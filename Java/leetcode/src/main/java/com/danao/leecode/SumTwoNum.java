package com.danao.leecode;

import com.danao.util.ArrayUtils;
import com.danao.util.NumberUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang
 * @version 1.0
 * @classname leetcode
 * @descriptionclass class describe
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @createdate 2019/4/12
 * @since 1.0
 */
public class SumTwoNum {


	/**
	 * 暴力破解，逐个排除
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int[] getSum(int[] arr,int num){
		int x = 0;
		int y = 0;
		boolean b = false;
		aa:for(int i = 0;i < arr.length ;i ++){
			int value = num - arr[i];
			for(int j = i + 1;j<arr.length;j++){
				if(value == arr[j]) {
					x = i;
					y = j;
					b = true;
					break aa;
				}
			}
		}
		return new int[]{x,y};
	}


	/**
	 * 存放到map中 key为值,value为位置
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int[] twoSum(int[] arr,int num){
		Map<Integer,Integer> map = new HashMap<>();

		for(int i = 0;i < arr.length;i++){
			if(map.containsKey(num - arr[i])){
				return new int[]{i,map.get(num-arr[i])};
			}
			map.put(arr[i],i);
		}
		return new int[]{0,0};
	}


	public static void main(String[] args) {
		int[] arr = NumberUtils.randomArrNoRepate(10,30);
		ArrayUtils.toString(arr);
		int[] brr = getSum(arr,20);
		int[] crr = twoSum(arr,20);
		ArrayUtils.toString(brr);
		ArrayUtils.toString(crr);
	}

}

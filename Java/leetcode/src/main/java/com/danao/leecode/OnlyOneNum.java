package com.danao.leecode;

import com.danao.util.ArrayUtils;
import com.danao.util.LoggerUtils;
import com.danao.util.NumberUtils;


/**
 * @author zhang
 * @version 1.0
 * @classname OnlyOneNum
 * @descriptionclass class describe
 * 1.给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 2.****************
 * @createdate 2019/4/22
 * @since 1.0
 */
public class OnlyOneNum {

	public static int getOnlyOneNum(int[] arr){
		int result = 0;
		for(Integer i : arr){
			//交换律：a ^ b ^ c <=> a ^ c ^ b
			//任何数于0异或为任何数 0 ^ n => n
			//相同的数异或为0: n ^ n => 0
			result = result ^ i;

		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = NumberUtils.randomArr(10,10);
		ArrayUtils.toString(arr);
		int[] brr = new int[]{11111,2,2,3,4,3,4,5,6,6,5};
		LoggerUtils.println(getOnlyOneNum(brr));
	}

}

package com.danao.leecode;

import com.danao.util.LoggerUtils;

/**
 * @author zhang
 * @version 1.0
 * @classname GuessNumber
 * @descriptionclass class describe
 * 1.猜数字 大小
 * 2.****************
 * @createdate 2019/4/22
 * @since 1.0
 */
public class GuessNumber {



	public static int guessNum(int max){
		int left = 0;
		int right = max;
		int mid = 0;
		while(left <= right){
			//todo  比较好的写法: left + (right - left) / 2
			mid = left + (right - left) / 2;
			if(guess(mid) == 0){
				return mid;
			}else if(guess(mid) == -1) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
			System.out.print("left = " +  left);
			System.out.print(";right = " +  right);
			System.out.println();
		}
		return mid;
	}


	/**
	 * 假设猜测的数字是 10
	 * @param m
	 * @return
	 */
	public static int guess(int m){
		return compareNum(m,100);
	}


	/**
	 *  i与j比较大小
	 * @param i
	 * @param j
	 * @return   i > j 1   i==j 0   i < j -1
	 */
	public static int compareNum(int i,int j){
		return i > j ? 1 : i ==j ? 0 : -1;
	}


	public static void main(String[] args) {
		LoggerUtils.println(compareNum(1,2));
		LoggerUtils.println(guessNum(20011));
	}




}

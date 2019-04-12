package com.danao.sort;

import com.danao.util.ArrayUtils;
import com.danao.util.NumberUtils;

/**
 * @author zhang
 * @version 1.0
 * @classname QuickSort
 * @descriptionclass class describe
 * 1.快速排序
 * 2.
 * @createdate 2019/4/11
 * @since 1.0
 */
public class QuickSort {


	/**
	 * 找到一个指定的数，分治计算
	 * @param arr
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] sortNum(int[] arr,int left,int right){
		//ArrayUtils.toString(arr, LogFormat.BEFORE);
		if(ArrayUtils.isEmpty(arr)){
			return arr;
		}

		if (left < right) {
			int i,j,x;
			i = left;
			j = right;
			//这个值可以指定
			x = arr[i];
			while (i < j) {
				while(i < j && arr[j] > x) {
					j--; // 从右向左找第一个小于x的数
				}
				if(i < j){
					arr[i] = arr[j];
					i++;
				}
				while(i < j && arr[i] < x){
					i++; // 从左向右找第一个大于x的数
				}
				if(i < j){
					arr[j] = arr[i];
					j--;
				}
			}
			//System.out.println("i =  "+i );
			//System.out.println("j =  "+j );
			//这个值需要与上面的值一致
			arr[i] = x;
			sortNum(arr, left, i-1); /* 递归调用 */
			sortNum(arr, i+1, right); /* 递归调用 */
		}
		//System.out.println(" left = " + left);
		//System.out.println(" right = " + right);
		//ArrayUtils.toString(arr,LogFormat.AFTER);
		return null;
	}




	/**
	 * 找到一个指定的数，分治计算
	 * @param arr
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] sortNums(int[] arr,int left,int right){
		//ArrayUtils.toString(arr, LogFormat.BEFORE);
		if(ArrayUtils.isEmpty(arr)){
			return arr;
		}

		if (left < right) {
			int i,j,x;
			i = left;
			j = right;
			//这个值可以指定
			x = arr[j];
			while (i < j) {
				while(i < j && arr[i] < x){
					i++;
				}
				if(i<j && arr[i] > x){
					arr[j] = arr[i];
					j--;
				}
				while (i<j && arr[j] > x){
					j--;
				}
				if(i < j && arr[j] <x){
					arr[i] = arr[j];
					i++;
				}
			}
			//System.out.println("i =  "+i );
			//System.out.println("j =  "+j );
			//这个值需要与上面的值一致
			arr[j] = x;
			sortNum(arr, left, i-1); /* 递归调用 */
			sortNum(arr, i+1, right); /* 递归调用 */
		}
		//System.out.println(" left = " + left);
		//System.out.println(" right = " + right);
		//ArrayUtils.toString(arr,LogFormat.AFTER);
		return null;
	}




	public static void main(String[] args) {
		int[] arr = NumberUtils.randomArrNoRepate(10,50);
		//arr = new int[]{18,25,21,26,40,29,19,22,3,39};
		//arr = new int[]{ 49 ,6 ,5 ,41 ,16 ,44 ,28 ,13 ,21, 26};

		ArrayUtils.toString(arr);
		sortNum(arr,0,arr.length-1);
		ArrayUtils.toString(arr);

		int[] brr = NumberUtils.randomArrNoRepate(10,50);
		ArrayUtils.toString(brr);
		sortNums(brr,0,arr.length-1);
		ArrayUtils.toString(brr);


	}

}

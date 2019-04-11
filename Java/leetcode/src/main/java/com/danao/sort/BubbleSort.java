package com.danao.sort;


import com.danao.util.ArrayUtils;

/**
 * @author zhang
 * @version 1.0
 * @classname BubbleSort
 * @descriptionclass class describe
 * 1.冒泡排序
 * 2.从头开始，挨个和后面的数比较，大的放后面
 * @createdate 2019/4/11
 * @since 1.0
 */
public class BubbleSort {

	/**
	 * 冒泡排序
	 * @param arr
	 * @return
	 */
	public static int[] sortNum(int[] arr){
		if(arr == null|| arr.length == 0){
			return arr;
		}
		//冒泡次数
		for(int i= 0 ;i<arr.length;i++){
			int tmp = 0;
			//开始冒泡计算，每次找出最大的一个
			for(int j= 0; j < arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}

		}
		return arr;
	}

	public static int[] sortNumOne(int[] arr){
		if(ArrayUtils.isEmpty(arr)){
			return arr;
		}
		//标记符号
		boolean info = true;
		for(int i = 0; i < arr.length ; i ++){
			int tmp = 0;
			for(int j = 0; j < arr.length - 1; j++){
				if(arr[j] > arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					info = false;
				}
				if(info){
					break;
				}
			}
		}
		return arr;
	}



}

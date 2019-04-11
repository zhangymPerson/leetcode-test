package com.danao.test;

import com.danao.command.Constant;
import com.danao.command.LogFormat;
import com.danao.sort.BubbleSort;
import com.danao.util.ArrayUtils;
import com.danao.util.LoggerUtils;
import com.danao.util.NumberUtils;

/**
 * @author zhang
 * @version 1.0
 * @classname Test
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/11
 * @since 1.0
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("测试开始...");
		int[] arr;
/*		int[] arr = Constant.TEST.getArr();
		ArrayUtils.toString(arr, LogFormat.BEFORE);
		int[] brr = BubbleSort.sortNum(arr);
		int[] crr = BubbleSort.sortNumOne(arr);
		ArrayUtils.toString(arr);

		ArrayUtils.toString(crr,LogFormat.AFTER);*/

		/*for(int i = 0; i<100 ; i++){
			LoggerUtils.println(NumberUtils.randomNum(11));
		}*/

		//生成测试数据
		//ArrayUtils.toString(NumberUtils.randomArrNoRepate(100,400));
		//ArrayUtils.toString(NumberUtils.randomArr(100,12));
		//arr = NumberUtils.randomArrNoRepate(20,100);
		arr = NumberUtils.randomArr(20,100);
		ArrayUtils.toString(arr);
		int[] brr = BubbleSort.sortNum(arr);
		ArrayUtils.toString(brr);

	}

}

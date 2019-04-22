package com.danao.leecode;

/**
 * @author zhang
 * @version 1.0
 * @classname IntegerReverse
 * @descriptionclass class describe
 * 1.整数反转
 * 2.****************
 * @createdate 2019/4/15
 * @since 1.0
 */
public class IntegerReverse {


	/**
	 * 未考虑数字过大的情况
	 * @param integer
	 * @return
	 */
	public static Integer reverse(Integer integer){
		if(integer == null){
			return 0;
		}
		if(-10 < integer && integer < 10){
			return integer;
		}
		int num = 0;
		while (integer != 0){
			num = (integer % 10) + num * 10;
			integer = integer / 10 ;
		}
		return num;
	}

	public static void main(String[] args) {
		Integer num  = reverse(-12345);
		System.out.println(num);
	}

}

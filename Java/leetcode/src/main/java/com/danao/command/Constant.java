package com.danao.command;

/**
 * @author zhang
 * @version 1.0
 * @classname Constant
 * @descriptionclass class describe
 * 1.测试数据
 * 2.
 * @createdate 2019/4/11
 * @since 1.0
 */
public enum Constant {
	/**
	 * 排序测试
	 */
	TEST("sort", new int[]{323, 434, 2345, 346, 27, 38, 12, 32, 44});

	private String code;

	private int[] arr;

	private Constant(String code,int[] arr){
		this.code = code;
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

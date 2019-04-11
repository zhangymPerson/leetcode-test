package com.danao;

import com.danao.com.danao.util.PropertiesUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zhang
 * @version 1.0
 * @classname Application
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/11
 * @since 1.0
 */
public class Application {

	public static void main(String[] args) {
		System.out.println("算法练习项目");
		try {
			Properties p = PropertiesUtils.getResourceAsProperties("test.properties");
			System.out.println(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}

package com.danao.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zhang
 * @version 1.0
 * @classname PropertiesUtils
 * @descriptionclass class describe
 * 1.读取文件工具类
 * 2.阿里开源项目的代码
 * @createdate 2019/4/11
 * @since 1.0
 */
public class PropertiesUtils {


	private static final String CLASSPATH_PREFIX = "classpath:";

	/**
	 * Returns a resource on the classpath as a Properties object
	 *
	 * @param resource The resource to find
	 * @return The resource
	 * @throws IOException If the resource cannot be found or read
	 */
	public static Properties getResourceAsProperties(String resource) throws IOException {
		ClassLoader loader = PropertiesUtils.class.getClassLoader();
		return getResourceAsProperties(loader, resource);
	}

	/**
	 * Returns a resource on the classpath as a Properties object
	 *
	 * @param loader   The classloader used to load the resource
	 * @param resource The resource to find
	 * @return The resource
	 * @throws IOException If the resource cannot be found or read
	 */
	public static Properties getResourceAsProperties(ClassLoader loader, String resource) throws IOException {
		Properties props = new Properties();
		InputStream in = getResourceAsStream(loader, resource);
		props.load(in);
		in.close();
		return props;
	}

	/**
	 * Returns a resource on the classpath as a Stream object
	 *
	 * @param loader   The classloader used to load the resource
	 * @param resource The resource to find
	 * @return The resource
	 * @throws IOException If the resource cannot be found or read
	 */
	public static InputStream getResourceAsStream(ClassLoader loader, String resource) throws IOException {
		InputStream in = null;
		if (loader != null) {
			in = loader.getResourceAsStream(resource);
		}
		if (in == null) {
			in = ClassLoader.getSystemResourceAsStream(resource);
		}
		if (in == null) {
			throw new IOException("Could not find resource " + resource);
		}
		return in;
	}


}

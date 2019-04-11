package com.danao.command;

/**
 * @author zhang
 * @version 1.0
 * @classname LogFormat
 * @descriptionclass
 * 1.枚举类
 * 2.规范日志中的各种格式
 * @createdate 2019/2/13
 * @since 1.0
 */
public enum LogFormat {

	/**
	 * 日志分割符号为 +
	 */
	LONGLINEONE("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"),
	/**
	 * 日志分割符号为 @
	 */
	LONGLINETWO("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"),
	/**
	 * 日志分割符号为 #
	 */
	LONGLINETHREE("##################################################################"),
	/**
	 * 日志分割符号为 *
	 */
	LONGLINEFORE("******************************************************************"),


	/**
	 * 日期格式
	 */
	DATEFORMAT("yyyy-MM-dd HH:mm:ss"),


	/**
	 * 日志级别为INFO
	 */
	INFO("INFO"),
	/**INFO
	 * 日志级别为DEBUG
	 */
	DEBUG("DEBUG"),
	/**
	 * 日志级别为EXCEPTION
	 */
	EXCEPTION("EXCEPTION"),
	/**
	 * 日志级别为ERROR
	 */
	ERROR("ERROR"),


	EMPTY(""),
	/**
	 * 执行前
	 */
	BEFORE("BEFORE"),
	/**
	 * 执行后
	 */
	AFTER("AFTER");





	private String logFormat;

	private LogFormat(String logFormat){
		this.logFormat = logFormat;
	}


	public String getLogFormat() {
		return logFormat;
	}

	public void setLogFormat(String logFormat) {
		this.logFormat = logFormat;
	}
}

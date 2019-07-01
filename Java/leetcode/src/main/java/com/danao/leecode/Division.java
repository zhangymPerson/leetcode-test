package com.danao.leecode;

import org.apache.log4j.Logger;

/**
 * @author danao
 * @version 1.0
 * @classname Division
 * @descriptionclass
 * 题目位置29
 *  给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @createdate 2019/6/13 10:46
 * @since 1.0
 */
public class Division {

    public static Logger logger = Logger.getLogger(Division.class);

    public static int division(int i,int j){
        logger.info( i + "/" + j );

        return 1;
    }


    public static void main(String[] args) {
        logger.info("test");
    }
}

package com.danao.leecode;

import com.danao.util.LoggerUtils;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang
 * @version 1.0
 * @classname SubString
 * @descriptionclass class describe
 * 1.求一串字符串不重复最长子串
 * 2.****************
 * @createdate 2019/4/12
 * @since 1.0
 */
public class SubString {



	public static String lengthOfLongestSubstring(String string){
		if(string == null || string.length() == 0){
			return string;
		}

		Map<Character,Integer> map = new HashMap<>();
		char[] chars = string.toCharArray();
		for(int i = 0; i < chars.length ; i ++ ){
			System.out.print(" " + chars[i]);
			if(map.containsKey(chars[i])){
				map.put(chars[i],i - map.get(chars[i]));
				continue;
			}
			map.put(chars[i],i);
		}
		System.out.println(" ");
		LoggerUtils.print(map);
		return "";
	}


	/**
	 * 滑动窗口法
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstrings(String s) {
		if (s.length()==0) return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		int left = 0;
		for(int i = 0; i < s.length(); i ++){
			if(map.containsKey(s.charAt(i))){
				int y = map.get(s.charAt(i)) + 1;
				left = Math.max(left,y);
				System.out.println("left = " +left);
				System.out.println("y = " + y);
			}
			map.put(s.charAt(i),i);
			int x = i -left + 1;
			System.out.println("x = " + x);
			System.out.println("====");
			max = Math.max(max,x);
		}
		return max;

	}

	public static void main(String[] args) {
		lengthOfLongestSubstring("asdfsdafsdfsdfsfasdfsdf");
		lengthOfLongestSubstrings("abcdabcdacdac");
		LoggerUtils.print(Math.max(1,2));
	}
}

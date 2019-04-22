package com.danao.leecode;

import com.danao.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @classname ThreeNumberSum
 * @descriptionclass class describe
 * 1.三个数求和问题
 * 2.一个数组中 找出符合 a + b + c = 0 的所有组合
 * @createdate 2019/4/15
 * @since 1.0
 */
public class ThreeNumberSum {


	public static List<int[]> threeNumSum(int[] arr){
		List<int[]> list = new ArrayList<>();

		for(int i = 0;i < arr.length - 2 ;i ++ ){

			for(int j = i +1 ; j<arr.length - 1 ;j ++){

				for(int k = j + 1; k < arr.length ; k ++){
					if(arr[i] + arr[j] + arr[k] == 0){
						int[] brr = new int[]{arr[i],arr[j],arr[k]};
						list.add(brr);
					}
				}
			}

		}


		return list;
	}




	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		if(nums==null || nums.length<3){
			return ans;
		}
		Arrays.sort(nums);
		ArrayUtils.toString(nums);
		int n=nums.length;
		for(int i=0;i<n-2;){
			//双指针
			int l=i+1,r=n-1;
			while(l<r){
				if(nums[l]+nums[r]==-nums[i]){
					List<Integer> list=new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[l]);
					list.add(nums[r]);
					ans.add(list);
					int tmpl=nums[l];
					int tmpr=nums[r];
					//如果找到匹配的,跳过重复的
					while(l<r &&nums[l]==tmpl){
						l++;
					}
					while(l<r &&nums[r]==tmpr){
						r--;
					}
				}else if(nums[l]+nums[r]>-nums[i]){
					r--;
				}else {
					l++;
				}
			}
			//跳过重复的
			int tmpi=nums[i];
			while(i<n-2 && tmpi==nums[i]){
				i++;
			}
		}
		return ans;
	}



	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,-1,-2,-3,-4,-5,9};
		/*
		List<int[]> list = threeNumSum(arr);
		for(int[] brr:list){
			ArrayUtils.toString(brr);
		}
		*/
		List<List<Integer>> lists = threeSum(arr);
		ArrayUtils.toString(lists);
	}

}

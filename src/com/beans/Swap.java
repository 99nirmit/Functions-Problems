package com.beans;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		
		String name = "Nirmit";
		changeName(name);
		System.out.println(name);
		
		int[] arr = {1,2,3,4,5};
		change(arr);
		System.out.println(Arrays.toString(arr)); 
		
		int a = 10;
		changeInt(a);
		System.out.println(a);
	}
	
	static void changeName(String name) { 
		name = "Rahul";
	}
	
	static void change(int[] nums) {
		nums[0] = 99;
	}

	static void changeInt(int a) {
	a=20;
	}
	
	
//	static int changeInt(int a) {
//		return 20;
//	}
}

package com.beans;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		fun("NIrmit","Nirmit","Mohit");
		
		multiple(12, 21, "Nirmit","Mohit");
	}
	static void multiple(int a,int b,String ...v) {
		System.out.println(a+Arrays.toString(v));
	}
	
	static void fun(String ...v) {
		System.out.println(Arrays.toString(v));
	}

}

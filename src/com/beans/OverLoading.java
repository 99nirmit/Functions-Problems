package com.beans;

public class OverLoading {
	public static void main(String[] args) {
		fun(23);
		fun("Mohit");
		int ans = sum(12,98);
		System.out.println(ans);
	}
	static void fun(int a) {
		System.out.println(a);
	}
	static void fun(String name) {
		System.out.println(name);
	}
	
	static int sum(int a,int b) {
		return a+b;
	}

}

package com.beans;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
//		int ans = sum2();
//		System.out.println("This is my answer: " + ans);
		
		int ans = sum3(20,40);
		System.out.println(ans);
	}
	
	static int sum3(int a,int b) {
		int sum = a + b;
		return sum;
	}
	
	static int sum2() {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = input.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		return sum;
	}

}

package com.beans;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int ans = factorial(num);
		System.out.println("The factorial of a number: "+ans);
	}
	
	static int factorial(int num) {
		int fact = 1;
		for(int i = 1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}
}

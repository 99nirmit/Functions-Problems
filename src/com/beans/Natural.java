package com.beans;

import java.util.Scanner;

public class Natural {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int ans = sum(num);
		System.out.println("The Sum of Natural Numbers are : "+ans);
	}
	
	static int sum(int num) {
		int sum = 0;
		for(int i = 0;i<=num;i++) {
			sum = sum + i;
		}
		return sum;
	}

}

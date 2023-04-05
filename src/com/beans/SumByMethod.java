package com.beans;

import java.util.Scanner;

public class SumByMethod {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = input.nextInt();
		
		int ans = sum(num1,num2);
		System.out.println("The Sum of Numbers is: " + ans);
	}
	
	static int sum(int num1,int num2) {
		return num1 + num2;
	}

}

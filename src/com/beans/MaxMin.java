package com.beans;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = input.nextInt();
		System.out.println("Enter num2");
		int num2 = input.nextInt();
		System.out.println("Enter num3");
		int num3 = input.nextInt();

		int maxAns = max(num1,num2,num3);
		System.out.println("Max number is: " + maxAns);
		
		int minAns = min(num1,num2,num3);
		System.out.println("Min number is: " + minAns);
	}

	static int max(int num1,int num2,int num3) {

		int max,min = 0;
		max = num1;
		if(num2>max) {
			max = num2;
		}
		if(num3>max) {
			max = num3;
		}
		
		return max;
	}

	static int min(int num1,int num2,int num3) {
		int max,min = 0;
		min = num1;
		
		if(num2<min) {
			min = num2;
		}
		if(num3<min) {
			min=num3;
		}
		
		return min;
	}
}

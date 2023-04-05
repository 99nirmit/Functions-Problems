package com.beans;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = input.nextInt();
	if(ischeck(num)) {
		System.out.println("Even Number");
	}else {
		System.out.println("Odd Number");
	}
	}
	
	static boolean ischeck(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}

}

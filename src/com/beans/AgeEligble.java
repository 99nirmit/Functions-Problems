package com.beans;

import java.util.Scanner;

public class AgeEligble {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a age");
		int age = input.nextInt();
		if(check(age)) {
			System.out.println("He/She is eligible for Vote");
		}else {
			System.out.println("He/She is not eligible for Vote");
		}
		  
	}
	
	static boolean check(int age) {
		int num = 0;
		if(age>=18) {
			return true;
		}else {
			return false;
		}
	}

}

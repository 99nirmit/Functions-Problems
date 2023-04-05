package com.beans;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 =  input.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 =  input.nextInt();
		
		int ans = multiply(num1, num2);
		System.out.println("Multiplication of two Number: " + ans);
	}
	
	static int multiply(int num1,int num2) {
		return num1*num2;
	}

}

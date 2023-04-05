package com.beans;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = input.nextInt();
		if(isPrime(num)) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
	}
	
	static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2;i<num;i++){
			if(num%i==0) {
				return false;
			}else {
				return true;
			}
		}	
		return true;
	}
}

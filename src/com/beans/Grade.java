package com.beans;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int num = input.nextInt();
	}
	
	static boolean checkGrade(int num) {
		if(num>91 && num<100) {
			return true;
		}else if(num>81 && num<90) {
			return true;
		}else if(num>71 && num<80) {
		return true;
		}
	}

}

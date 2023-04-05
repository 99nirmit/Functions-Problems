package com.beans;

import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = input.nextInt();
		
		float ansCircum = circumference(radius);
		System.out.println("Circumference is: " + ansCircum);
		
		float ansAreaOfCircle = areaOfCircle(radius);
		System.out.println("Area of Circle: " + ansAreaOfCircle);
	}
	
	static float circumference(int radius) {
		return (float)(2*3.14*radius);
	}
	
	static float areaOfCircle(int radius) {
		return (float)(3.14*radius);
	}

}

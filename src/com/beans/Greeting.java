package com.beans;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
//		greeting();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String naam = input.next();
		String personalised = myGreet(naam);
		System.out.println(personalised);
	}
	
	static String myGreet(String name) {
		String message = "Hello" + name;
		return message;
	}

	static void greeting() {
		System.out.println("Hello World");
	}

}

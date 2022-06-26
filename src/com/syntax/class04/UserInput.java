package com.syntax.class04;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		String str = "Hello";
		
		//scanner is a dataType
		//input variable
		Scanner input = new Scanner(System.in);
		
		//send instruction to the console
		System.out.println("Please enter you name");
		
		//we need to grab the values from console
		//to read strings we use next()
		String name = input.next();
		System.out.println(name);
		
		//Let's send instruction
		System.out.println(name + " please enter your age");
		
		//need to capture and store age
		//use nextInt for integers
		int age = input.nextInt();
		
		System.out.println(name + " is " + age + " years old");
	}

}

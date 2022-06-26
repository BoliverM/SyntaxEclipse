package com.syntax.class04;

import java.util.Scanner;

public class UserInputNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter second number");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("The first number " + num1 + " is larger than the second number " + num2 );
		}
		else {
			System.out.println("The second number " + num2 + " is larger than the first number " + num1);
		}
	}
}

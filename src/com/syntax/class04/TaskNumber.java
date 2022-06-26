package com.syntax.class04;

public class TaskNumber {
	public static void main(String[] args) {
		/*
		 * Write a program to check
		 * if number is positive or negative
		 */
		// if and else if statement has to be a boolean expression
		
		int number = 0;
		
		if (number > 0) {
			System.out.println("Number is positive");
		}
		else if (number == 0) {
			System.out.println(number + " is not positive or negative");
		}
		else {
			System.out.println("Number is negative");
		}
	}
}

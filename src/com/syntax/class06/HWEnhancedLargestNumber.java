package com.syntax.class06;

import java.util.Scanner;
public class HWEnhancedLargestNumber {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		/*
		 * write a program to find the largest number among three numbers using nested
		 * provided by a user (number must be distinct
		 */
		
		int num1 = 500;
		int num2 = 500;
		int num3 = 500;
		/* compiler can initialize variables to it's default values
		 * int > 0
		 * double > 0.0
		 * boolean > false
		 * String > null
		 */
		int largest = 0;
		
		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
		}
		else if (num2 >= num1 || num2 >= num3) {
			largest = num2;
		}
		else if (num3 >= num1 || num3 >= num2) {
			largest = num3;
		}
		else {
			System.out.println("All numbers are equal");
		}
		if (largest != 0) {
			System.out.println("The largest mumber is " + largest);
			//The variable largest may not have been initialized
		}
	}
}

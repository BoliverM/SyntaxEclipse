package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {
	public static void main(String[] args) 
	{
		/*  IF ELSE IF Statements
		 *  Using scanner class create calculator. 
		 *  Allow user to enter 2 numbers and operator(+,-,*,/). 
		 *  Based on operator provide the result to user.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first whole number:");
		int firstNum = input.nextInt();
		System.out.println("Enter the second whole number:");
		int secondNum = input.nextInt();
		System.out.println("Do you want to add, subtract, multiply or divide? (Enter +, -, * or /).");
		char operator = input.next().charAt(0);
		
		if (operator == '+') {
			int totalSum = firstNum + secondNum;
			System.out.println("The sum of two numbers is " + totalSum + ".");
		}
		else if (operator == '-') {
			int totalSub = firstNum - secondNum;
			System.out.println("The subraction of two numbers is " + totalSub + ".");
		}
		else if (operator == '*') {
			int totalMulti = firstNum * secondNum;
			System.out.println("The multiplication of two numbers is " + totalMulti + ".");
		}
		else if (operator == '/') {
			int totalDiv = firstNum / secondNum;
			System.out.println("The division of two numbers in whole number is " + totalDiv + ".");
		}
	}
}

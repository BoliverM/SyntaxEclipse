package com.syntax.class06;

import java.util.Scanner;

public class HWCalculatorSwitch {
	public static void main(String[] args) 
	{
		/*  SWITCH Statements
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
		int total = 0;
		switch (operator) {
		
		case '+':
			total = firstNum + secondNum;
			break;
		case '-':
			total = firstNum - secondNum;
			break;
		case '*':
			total = firstNum * secondNum;
			break;
		case '/':
			total = firstNum / secondNum;
			break;
		default:
			total = 0;
		}
		System.out.println("The total of the two numbers is " + total + ".");
	}
}

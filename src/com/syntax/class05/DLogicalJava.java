package com.syntax.class05;

public class DLogicalJava {
	public static void main(String[] args) 
	{
		
		System.out.println("-------------------------------");
		
		/*
		 * write a program to find the largest number among three numebrs using nested
		 * provided by a user (number must be distinct
		 */
		
		int num1 = 65;
		int num2 = 66;
		int num3 = 23;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("The largest number is " + num3);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);
		}
	}
}

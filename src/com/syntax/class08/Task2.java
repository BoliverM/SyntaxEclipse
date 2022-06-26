package com.syntax.class08;

public class Task2 {
	public static void main(String[] args) 
	{

		/*
		 * write a program to find sum of all even and all odd numbers
		 * from 1 to 70
		 */
		int sum1 = 0;
		for(int x = 2; x <= 70; x += 2) {
			sum1 += x;
		}
		System.out.print("Sum of all even numbers " + sum1);
		
		System.out.println();
		int sum2 = 0;
		for(int x = 1; x <= 70; x += 2) {
			sum2 += x;
		}
		System.out.print("Sum of all odd numbers " + sum2);
		System.out.println("----------------------" );
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 1; i <= 70; i++) {
			if(i % 2 == 0) {
				sumEven += i;
			}else {
				sumOdd += 1;
			}
			System.out.println("Sum of the even numbers is " + sumEven);
			System.out.println("Sum of the odd numbers is " + sumOdd);
		}	
	}
}

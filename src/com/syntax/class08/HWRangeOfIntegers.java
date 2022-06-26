package com.syntax.class08;
import java.util.Scanner;
public class HWRangeOfIntegers {
	public static void main(String[] args) 
	{
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two whole numbers");
		int x = input.nextInt();
		int y = input.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = x; i <= y; i++) {
			if(i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("The sum of the two even numbers is " + sumEven);
		System.out.println("The sum of the two odd numbers is " + sumOdd);
	}
}

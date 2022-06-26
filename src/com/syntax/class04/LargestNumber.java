package com.syntax.class04;

public class LargestNumber {
	public static void main(String[] args) {
		
		int a = 9;
		int b = 8;
		int c = 10;
		
		if (a >= b) {
			if(a >= c) {
				System.out.println("Number " + a + " is the largest number");
			}
			else {
				System.out.println("Number " + c + " is the largest number");
				}
		}
		else {
			if (b >= c) {
				System.out.println("Number " + b + " is the largest number");
			}
			else {
				System.out.println("Number " + c + " is the largest number");
			}
		}
	}
}

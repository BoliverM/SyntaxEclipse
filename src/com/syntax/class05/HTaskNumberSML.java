package com.syntax.class05;

import java.util.Scanner;

public class HTaskNumberSML {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number between 1 to 1000");
		long number = input.nextInt();
		
		if (number >= 1 && number <= 10) {
			System.out.println(number + " is a small number");
		}
		else if (number >= 11 && number <= 100) {
			System.out.println(number + " is a medium number");
		}
		else if (number >= 101 && number <= 1000) {
			System.out.println(number + " is a large number");
		}
	}
}

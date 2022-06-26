package com.syntax.class05;

import java.util.Scanner;

public class HWAnnualSalary {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter how many years worked");
		int years = input.nextInt();
		
		if (years >= 5) {
			System.out.println("You are eligible for bonus since you worked for 5 or more years");
			System.out.println("Enter annual salary");
			int salary = input.nextInt();
			
			if (salary > 50000) {
				System.out.println("You will receive a bonus of 5000");
			}
			else {
				System.out.println("You will receive a bonus of 3000");
			}
		}
		else {
			System.out.println("You are not eligible for bonus");
		}
	}
}

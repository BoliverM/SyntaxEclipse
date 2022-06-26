package com.syntax.class04;

public class Donor {
	public static void main(String[] args) {
		
		int age = 19;
		int weightReq = 111;
		
		if (age >= 18) {
			System.out.println("You are eligible to donate blood with your age " + age);
			if (weightReq > 110) {
				System.out.println("Person matches the weight requirements of more than 110 lbs");
			}
			else {
				System.out.println("But with your weight  of " + weightReq + " we cannot do it.");
			}
		}
		else {
			System.out.println("You are not eligible to donate blood at " + age + " years of age");
		}
	}
}

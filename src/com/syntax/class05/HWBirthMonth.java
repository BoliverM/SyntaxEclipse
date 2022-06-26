package com.syntax.class05;

import java.util.Scanner;

public class HWBirthMonth {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your birth month");
		String month = input.next();
		
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("You were born in the Spring season");
		}
		else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("You were born in the Summer season");
		}
		else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("You were born in the Fall Season");
		}
		else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("You were born in the winter Season");
		}
	}
}
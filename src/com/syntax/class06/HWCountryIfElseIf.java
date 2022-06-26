package com.syntax.class06;

import java.util.Scanner;

public class HWCountryIfElseIf {
	public static void main(String[] args) 
	{
		/* IF ELSE IF Statements
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a country between USA, Mexico, China, India, or Philippines");
		String country = input.next();
		
		if (country.equals("USA")) {
			System.out.println("The language they use in the " + country + " is English.");
		}
		else if (country.equals("Mexico")) {
			System.out.println("The language they use in " + country + " is Spanish.");
		}
		else if (country.equals("China")) {
			System.out.println("The language they use in " + country + " is Mandarin or Cantonese.");
		}
		else if (country.equals("India")) {
			System.out.println("The language they use in " + country + " is Hindi.");
		}
		else if (country.equals("Philippines")) {
			System.out.println("The language they use in the " + country + " is Tagalog.");
		}
		else {
			System.out.println("Invalid country. Try again.");
		}
	}
}
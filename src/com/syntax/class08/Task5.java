package com.syntax.class08;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		
		//Create a program that will keep asking user to apply for a credit card. 
		//As soon you get “yes” from a user program should stop asking.
		String answer = "Yes";
		Scanner input = new Scanner(System.in);
				
		do {
			System.out.println("Are you applying for a credit card?");
			answer = input.next();
		}while(!answer.equalsIgnoreCase("Yes"));
				
		System.out.println("Thank you for Applying");
	}
}

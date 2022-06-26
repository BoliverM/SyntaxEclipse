package com.syntax.class05;

import java.util.Scanner;

public class CTaskCreditCard {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a credit card? Yes or No");
		String answer = input.next();

		if(answer.equals("Yes")) {
			System.out.println("What is the balance on the card");
			long balance = input.nextInt();
			if(balance > 1000) {
				System.out.println("Please pay the card immediately");
			}
			else {
				System.out.println("You can spend more");
			}
		}
		else {
			System.out.println("I will offer you a credit card");
		}
	}

}

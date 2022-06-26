package com.syntax.class08;
import java.util.Scanner;
public class HWBuyPrice {
	public static void main(String[] args) 
	{
		/* Write a program to ask a user to enter item they want to 
		 * buy and the price of that item. Every time user enters money, 
		 * accumulate the amount and tell the user how much is left to 
		 * pay off. If user give more money program should return a change. 
		 * Whenever a user done with payments program should say 
		 * “Thank you for shopping!”
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an item you want to buy");
		String item = input.next();
		System.out.println("How much is the item?");
		double price = input.nextDouble();
		
		double money, amountOwe;
		double amountExtra = 0;
		double payment = 0;
		do {
			System.out.println("How much are you paying?");
			money = input.nextDouble();
			payment += money;
			if (payment < price) {
				amountOwe = price - payment;
				System.out.println("You still owe $" + amountOwe);
			}
			else if (payment > price) {
				amountExtra = payment - price;
				System.out.println("You have a change of " + amountExtra);
			}
		}while(payment != price);
		System.out.println("Thank you for Shopping!");
	}		
}

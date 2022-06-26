package com.syntax.class06;
import java.util.Scanner;

public class HWValueSale {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double discountedPrice;
		
		System.out.println("Are there any sales today? True or False");
		boolean sale = input.nextBoolean();
		
		if (sale) {
			System.out.println("Which item did you want to buy and how much?");
			String item = input.next();
			double price = input.nextDouble();
			
			if (price < 20) {
				discountedPrice = price - (price * 0.10);
				System.out.println("After discount of 10 percent the price of the item"
						+ " reduce from " + price + " to " + discountedPrice);
			}
			else if (price >= 20 && price <= 100) {
				discountedPrice = price - (price * 0.20);
				System.out.println("After discount of 20 percent the price of the item"
						+ " reduce from " + price + " to " + discountedPrice);
			}
			else if (price >= 101 && price <= 500) {
				discountedPrice = price - (price * 0.30);
				System.out.println("After discount of 30 percent the price of the item"
						+ " reduce from " + price + " to " + discountedPrice);
			}
			else {
				discountedPrice = price - (price * 0.50);
				System.out.println("After discount of 50 percent the price of the item"
						+ " reduce from " + price + " to " + discountedPrice);
			}
		}
		else {
			System.out.println("There is no sale today. No shopping.");
		}
	}
}

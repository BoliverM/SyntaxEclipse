package com.syntax.class05;

import java.util.Scanner;

public class HWLoan {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the amount of loan needed?");
		long loan = input.nextLong();
		
		if (loan <= 200000) {
			System.out.println("I will lend you the money");
		}
		else {
			System.out.println("I'm sorry. I cannot lend you the money");
		}
	}
}

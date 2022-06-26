package com.syntax.class04;

public class TaskMortgage {
	public static void main(String[] args) {
		
		double mortgageInterest = 3.7;
		long mortgagePrice = 49000;
		
		if (mortgageInterest > 4.5) {
			System.out.println("I will not buy the house with " + mortgageInterest + "interest");
		}
		else {
			System.out.println("I will buy the house with " + mortgageInterest + " interest rate");
			if (mortgagePrice > 50000) {
				System.out.println("I will have to take a loan");
			}
			else {
				System.out.println("I will pay cash");
			}
		}
	}
}

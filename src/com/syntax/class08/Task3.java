package com.syntax.class08;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) 
	{
		/*
		 * declare a secret number;
		 * you want to ask user to guess your secret number
		 * your code should keep asking to guess until user gets your secret number
		 * once user gets the secret numbers -> you got it!
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------");
		int secretNum1 = 25;
		int guessedNum;
		do {
			System.out.println("Guess my secret number");
			guessedNum = input.nextInt();
		}while(guessedNum != secretNum1);
		System.out.println("You got it!");
	}
}

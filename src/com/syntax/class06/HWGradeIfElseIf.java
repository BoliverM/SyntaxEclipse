package com.syntax.class06;

import java.util.Scanner;

public class HWGradeIfElseIf {
	public static void main(String[] args) 
	{
		/* IF ELSE IF Statements
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner input = new Scanner(System.in);
		
		String explanation;
		
		System.out.println("Enter your grade: beween A - F");
		char grade = input.next().charAt(0);
		
		if (grade == 'A') {
			System.out.println("Your grade A is Excellent!");
		}
		else if (grade == 'B') {
			System.out.println("Your grade B is Good!");
		}
		else if (grade == 'C') {
			System.out.println("Your grade C is Average!");
		}
		else if (grade == 'D') {
			System.out.println("Your grade D is Bad!");
		}
		else {
			System.out.println("Your grade is not high enough. This is not acceptable.");
		}
	}
}

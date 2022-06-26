package com.syntax.class06;

import java.util.Scanner;

public class HWGrade {
	public static void main(String[] args) 
	{
		/* SWITCH Statements
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner input = new Scanner(System.in);
	
		String explanation;
		
		System.out.println("Enter your grade: beween A - F");
		char grade = input.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			explanation = "Excellent!";
			System.out.println("Good Job!");
			break;
		case 'B':
			explanation = "Good!";
			System.out.println("Not Bad");
			break;
		case 'C':
			explanation = "Average!";
			System.out.println("Keep it Up!");
			break;
		case 'D':
			explanation = "Bad!";
			System.out.println("Try to study more.");
			break;
		default:
			explanation = "Not acceptible";
			System.out.println("Pay attention to class more often.");
			break;
		}
		System.out.println("You grade " + grade + " is " + explanation);
	}
}

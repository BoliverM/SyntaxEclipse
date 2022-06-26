package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the score you get in quiz");
		int quiz = input.nextInt();
		
		System.out.println("Enter the score you get in midterm");
		int mid = input.nextInt();
		
		System.out.println("Enter the score you get in final");
		int fin = input.nextInt();
		
		int averageScore = (quiz + mid + fin) / 3;
		
		System.out.println("Your average score is " + averageScore);
		char grade;
		
		if (averageScore >= 90) {
			grade = 'A';
		}
		else if (averageScore >= 70 && averageScore <= 90) {
			grade = 'B';
		}
		else if (averageScore >= 50 && averageScore < 70) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("You are a " + grade + " student");
		
		/*if you are A or B student --> you are doing great
		 * otherwise --> please try to study more
		 */
		
		if (grade == 'A' || grade == 'B' ) {
			System.out.println("You are doing great");
		}
		else {
			System.out.println("Please try to study more");
		}
	}
}

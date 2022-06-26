package com.syntax.class05;

import java.util.Scanner;

public class HWScores {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your quiz score, mid term score, and final score");
		int quiz = input.nextInt();
		int midTerm = input.nextInt();
		int finalScore = input.nextInt();
		
		int averageScore = (quiz + midTerm + finalScore) / 3;
		
		if (averageScore >= 90) {
			System.out.println("Your average marking grade is A");
		}
		else if (averageScore >= 70 && averageScore < 90) {
			System.out.println("Your average marking grade is B");
		}
		else if (averageScore >= 50 && averageScore < 70) {
			System.out.println("Your average marking grade is C");
		}
		else if (averageScore < 50) {
			System.out.println("Your average marking grade is F");
		}
	}
}

package com.syntax.class05;

import java.util.Scanner;

public class FTaskHeightInches {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter person height in inches");
		int heightInches = input.nextInt();
		
		if (heightInches < 60) {
			System.out.println("Person is short");
		}
		else if (heightInches >= 60 && heightInches <= 72) {
			System.out.println("Person is medium");
		}
		else if (heightInches > 72) {
			System.out.println("Person is tall");
		}
	}
}

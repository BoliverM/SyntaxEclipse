package com.syntax.class05;
 
import java.util.Scanner;
public class GTaskWeekDayEnd {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose a number between 1 and 7");
		int number = input.nextInt();
		
		if (number >= 1 || number <= 5) {
			System.out.println("It is a weekday");
		}
		else if (number == 6 && number ==7) {
			System.out.println("It is a weekend");
		}
		else {
			System.out.println("Invalid Day");
		}
	}
}

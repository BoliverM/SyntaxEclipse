package com.syntax.class05;

import java.util.Scanner;

public class HWTime {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What time is it in military time?");
		int hour = input.nextInt();
		
		if (hour >= 0100 && hour <= 1100) {
			System.out.println("It is the morning");
		}
		else if (hour >= 1200 && hour <= 1500) {
			System.out.println("It is the afternoon");
		}
		else if (hour >= 1600 && hour <= 2000) {
			System.out.println("It is the evening");
		}
		else if (hour >= 2100 && hour <= 2400) {
			System.out.println("It is the night");
		}
	}
}

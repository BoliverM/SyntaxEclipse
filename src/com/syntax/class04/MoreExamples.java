package com.syntax.class04;

public class MoreExamples {
	public static void main(String[] args) {
		
		boolean mothersDay = false;
		
		if (mothersDay == true) {
			System.out.println("Happy Mother's Day to all Moms");
		}
		else {
			System.out.println("Hello");
		}
		
		System.out.println("---------------------------------");
		/*
		 * How to Debug
		 * step 1 mark a point, 
		 *step 2 right click , select debug
		 *step 3 click on step over, longer u-turn button
		 *step 4 makes sure to step over till end of program
		 *or terminate by clicking red square button
		*/
		
		boolean rain = false;
		//does not rain == false since it is already stated
		if (rain) {
			System.out.println("I will take umbrella");
		}
		else {
			System.out.println("No need for umbrella");
		}
		
		System.out.println("-------------------------------");
		
		boolean breakTime = true;
		
		if (breakTime) {
			System.out.println("Let's take a break");
		}
		else {
			System.out.println("Let's continue the class");
		}
	}
}

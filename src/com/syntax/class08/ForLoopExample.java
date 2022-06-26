package com.syntax.class08;

public class ForLoopExample {
	public static void main(String[] args) 
	{
		//I need to print number from 1 to 90
		for(int i = 1; i <= 90; i++) {
			System.out.print(i + " ");
		}
		
		/* starting poin
		 * ending point
		 * increment/decrement
		 */
		System.out.println();
		
		// I need numbers from 60 to 10
		for(int i = 60; i >= 10; i--) {
			System.out.println(i + " ");
		}
		System.out.println();
		// what is the output?
		for(int i = 5; i <= 40; i += 5) {
			System.out.println(i + " ");//increments of 5, 10, 15,.....40
		}
		
		/*we use for - when we know in advance how many times we want to iterate block of code
		 * we use while loop - when we do not know the # of iterations
		 * 
		 * while - first checks the condition
		 */
	}
}

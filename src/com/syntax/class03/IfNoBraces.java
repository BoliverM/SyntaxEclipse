package com.syntax.class03;

public class IfNoBraces {
	public static void main(String[] args) {
		
		/*
		 * withour braces java can identify only one statement per block
		 */
		
		String time = "Morning";
		
		if (time.equals("Morning")) {
			System.out.println("Say Good Morning");
		}
		else {
			System.out.println("Say Good Day");
			System.out.println("Or say Good Evening");
		}
			System.out.println("End of the Code");
			System.out.println("Make sure to use {} with if statements");
	}

}

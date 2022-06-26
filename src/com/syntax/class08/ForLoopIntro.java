package com.syntax.class08;

public class ForLoopIntro {
	public static void main(String[] args)
	{
		
		//I want to say GM 5 times
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good Morning");
		}
		
		/* for (int i = 1; i <= 5; i--) {
			System.out.println("Hello"); //infinite loop
		}
		*/
		System.out.println(" ------------------ ");
		
		for (int i = 1; i >= 5; i++) {
			System.out.println("How are you?"); //0 because first loop is not greater that 5
		}
	}
}

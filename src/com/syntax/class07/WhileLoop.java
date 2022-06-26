package com.syntax.class07;

public class WhileLoop {
	public static void main(String[] args) 
	{
		int time = 10;
		
		if(time < 12) {
			System.out.println("Morning"); //1 loop output
		}
		System.out.println("----------------------------------------------");
		
		/*
		   while(time < 12) {
			System.out.println("Morning"); //infinite loop
		}
		*/
		
		while(time < 12) {
			System.out.println("Good Morning");
			time++;
		}
		System.out.println("Hello");
	}

}

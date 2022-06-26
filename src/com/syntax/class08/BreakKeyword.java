package com.syntax.class08;

public class BreakKeyword {
	public static void main(String[] args) 
	{
		for(int i = 1; 1 <= 5; i++) {
			System.out.println("Hello");
			if(i == 2) {
				break;
			}
			//break; //will execute only one code
		}
		
		boolean summer = true;
		int temp = 95;
		while(summer) {
			System.out.println("it is hot");
			if(temp < 70) {
				System.out.println("It is not hot anymore");
				break;
			}
			temp -= 10;
		}
	}

}

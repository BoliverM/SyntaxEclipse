package com.syntax.class08;

public class Task4 {
	public static void main(String[] args) 
	{
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		for(int x = 0; x <= 50; x++) {
			if(x % 3 == 0) {
				continue;
			}
				System.out.print(x + " ");
		}
	}
}

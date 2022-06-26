package com.syntax.class09;

public class Recap {
	public static void main(String[] args) {
		//recap for for look with break
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		
			for (int y = 1; y <= 3; y++) {
				System.out.println("Bye");
			}
		}
		System.out.println("---------------------");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			for(int y = 1; y <= 3; y++) {
				System.out.println("Bye");
				break;
			}
		}
	}
}

package com.syntax.class09;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		/*
		 * Enhanced For Loop/Advanced For Loop/for each loop
		 * can be used only when we work with array or collections
		 */
		
		String [] colors = {"pink", "blue", "white", "black"};
		for(String color:colors) {
			System.out.print(color + " ");
		}
		
		System.out.println();
		
		int[] numbers = {10, 20, 30, 40};
		for(int num : numbers) {
			System.out.print(num + " ");
		}
	}

}

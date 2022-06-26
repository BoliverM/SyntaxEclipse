package com.syntax.class09;

public class HWArrayIntegers {
	public static void main(String[] args) {
		
		//create an array on integers and calculate the sum 
		//of all elements in an array
		
		int [] numbers = {5,11,50,10,80};
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum of all elements = " + sum);
	}
}

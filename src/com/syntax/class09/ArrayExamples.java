package com.syntax.class09;

public class ArrayExamples {
	public static void main(String[] args) {
		
		//I want to store prices in array
		
		double[] price = new double [4];
		price[1] = 1.99;
		price[2] = 2.99;
		price[3] = 3.99;
		System.out.println(price[0]);
		
		int [] numbers = new int[3];
		
		numbers[0] = 10;
		numbers[1] = 11;
		numbers[2] = 12;
		//numbers[3] = 13; //cannot store because only 3 spaces are available
		//java.lang.ArrayIndexOutOfBoundsException <--- run time error
		
		System.out.println(numbers[2]);
		
		//arrays are fixed in size
		//during runtime JAVA cannot increase or decrease in size of an array
	}
}

package com.syntax.class09;

public class HWArraysDouble {
	public static void main(String[] args) {
		
		//Create an array to store double values and
		//then print all the elements using 2 different loops
		
		double[] x = {1.1, 2.2, 3.3};
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " - ");
		}
		System.out.println("");
		
		//enhanced for loops
		for (double x1 : x) {
			System.out.print(x1 + " - ");
		}
	}
}

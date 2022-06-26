package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a 2D array of integers.
		// Develop a program which will calculate
		// the sum of even and odd numbers for that array.
		
		int[][] arr = { { 10, 15, 10 }, 
						{ 20, 50, 20 }, 
						{ 30, 30, 30 } };
		int evenSum = 0;
		int oddSum = 0;

		for (int x = 0; x < arr.length; x++) {

			for (int y = 0; y < arr[y].length; y++) {
				if (arr[x][y] % 2 == 0) {
					evenSum = evenSum + arr[x][y];
				} else {
					oddSum = oddSum + arr[x][y];
				}
			}

		}
		System.out.println("Odd Sum " + oddSum);
		System.out.println("Even Sum " + evenSum);
	}

}
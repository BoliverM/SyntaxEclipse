package com.syntax.class10;

public class HW3 {
	public static void main(String[] args) {
		
		int [][] numbers = {
						   {1, 2, 3, 4, 5},
						   {10, 20, 30, 40, 11},
						   {6, 7, 8, 9, 10}
						   };
		int sum = 0;
		for (int i = 0; i <= numbers[0].length; i++) {
			sum = sum + numbers[i].length;
			System.out.println();
		}
	}

}

package com.syntax.class10;

public class AnotherWayOf2DArray {
	public static void main(String[] args) {
		
		//create 2d array of states
		/*
		 * 1 array -> NY --> all cities of NY States
		 * 2 array -> CA --> all cities of CA States
		 * 3 array -> FL --> all cities of FL States
		 * 3 array -> VA --> all cities of VA States
		 */
		
		String [][] usa = {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
						  };
		
		System.out.println(usa[1][2]); //San Jose
		System.out.println("I want to go to " + usa[2][0]); // Miami
		System.out.println("Total # of 1D arrays in array usa " + usa.length); //4
		
		//I want to see how many element inside my first array
		int elem1array = usa[0].length;
		System.out.println("# of elements in 1 array = " + elem1array);
		//I want to see how many element inside my 2 array
		int elem2array = usa[1].length;
		System.out.println("# of elements in 2 array = " + elem2array);
		
		//outer loops iterates over rows
		//inner loops iterates over columns
		for (int row = 0; row < usa.length; row++)
			for (int col = 0; col < usa[row].length; col++)
			{
				System.out.println(usa[row][col]);
			}
	}
}

package com.syntax.class09;

public class HWArraysCars {
	public static void main(String[] args) {
		
		//create an array of cars and store 6 elements into it.
		//using 2 different loops print all values from the array.
		
		String[] cars = {"Maserati", "Alfa Romeo", "Toyota", "Lexus", "Audi", "Fisker"};
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " - ");
		}
		
		System.out.println("");
		//Enhanced Loop
		for (String c : cars) {
			System.out.print(c + " - ");
		}
	}
}

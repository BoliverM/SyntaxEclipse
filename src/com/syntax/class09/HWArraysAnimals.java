package com.syntax.class09;

public class HWArraysAnimals {
	public static void main(String[] args) {
		
		//Create an array of animals and store 5 elements into it.
		//Using 2 different loops print all elements from the array.
		
		String [] animals = {"Seagull", "Eagle", "Crow", "Hawk", "Falcon"};
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " - ");
		}
		
		System.out.println("");
		//Enhanced For Loop
		for (String animals1 : animals) {
			System.out.print(animals1 + " - ");
		}
	}
}

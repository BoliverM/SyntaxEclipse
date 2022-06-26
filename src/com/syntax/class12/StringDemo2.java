package com.syntax.class12;

public class StringDemo2 {
	public static void main(String[] args) {
		
		String firstName = "Adem";
		String lastName = " Jones";
		String fullName = firstName + lastName; // always always prefer this
		String fullName2 = firstName.concat(lastName); //never use this because it can
													   //lead to nullpointer exception
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name = " ";
		System.out.println(name.isEmpty());
		System.out.println(name.isBlank());
		
		String anyWords = " never ";
		System.out.println(anyWords.trim()); //trim will only remove space 
											 //front and back/ not in between
	}
}

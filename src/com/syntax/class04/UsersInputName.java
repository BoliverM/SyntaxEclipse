package com.syntax.class04;

import java.util.Scanner;

public class UsersInputName {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter you first name");
		String firstName = input.next();
		System.out.println("Please enter you last name");
		String lastName = input.next();
		System.out.println("Please enter the state you live in");
		String state = input.next();
		
		System.out.println("My name is " + firstName + " " + lastName + " and I live in " + state);
	}
}

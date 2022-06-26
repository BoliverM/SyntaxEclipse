package com.syntax.class05;

import java.util.Scanner;

public class AUserInput {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name = input.nextLine(); //captures the whole input in string
		System.out.println(name);
		
		System.out.println("Please enter age");
		int age = input.nextInt();
		System.out.println(age);
		
		System.out.println("Please enter price");
		double price = input.nextDouble();
		System.out.println(price);
		
		System.out.println("Please enter boolean");
		boolean boo = input.nextBoolean();
		System.out.println(boo);
	}
}

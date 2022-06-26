package com.syntax.class05;

import java.util.Scanner;

public class HWTemperatue {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your city");
		String city = input.next();
		
		System.out.println("Enter temperature in fahrenheit");
		int temperature = input.nextInt();
		
		int celsius = (temperature - 32) * 5 / 9;
		System.out.println("The temperature in the city " + city + " is " + celsius + " degrees celsius");
	}
}

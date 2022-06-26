package com.syntax.class03;

public class ShorthandandOperators {
	public static void main(String[] args)
	{
		int num =100;
		num = num+100;
		
		System.out.println(num); //200
		
		num = num+50;
		System.out.println(num); //250
		
		num += 100; //num = num+100 adding shorthand operator
		
		num -= 10; // num = num-10;
		
		System.out.println(num); //outcome would be 340
		
		num /= 10; // outcome will be 34
		num *= 2;
		System.out.println(num); //68
		
		num %= 2;
		System.out.println(num); //0
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		a += b; //left value is the output value, added by the right value
		System.out.println(a); // a is now equal to 30
		
		a += b+c; //a = 30 + b + c
		          // right value will execute first before adding to the left value
		System.out.println(a); //80
		
		a *= 10;
		System.out.println(a); //800
	}

}

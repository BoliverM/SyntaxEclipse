package com.syntax.class03;

public class PrimitiveCasting {
	
	//Casting in Java means converting one type into another
	
	//widening / implicit/ automatic
	//data type   byte -> short -> int -> long -> float -> double
	
	//narrowing
	//double -> float -> long -> int -> short -> byte
	//type in main then press ctrl+space -> press enter
	
	public static void main(String[] args)
	{
		int i = 100;
		double d = 100; //widening happens automatically/implicity
		
		System.out.println(i); //100
		System.out.println(d); //100.0
		
		long l = 10000;
		
		//byte b = 130; error, cannot convert from int to byte
		//int x = 99.99 error;cannot convert from double to int
		
		int x = (int)99.99; // narrowing
		System.out.println(x);
		
		//Type mismatch: cannot convert from int to byte
		byte b = (byte)130;
		System.out.println(b);
		
		//Type Mismatch: cannot convert from double to float
		float f = 10.99f;
		
		double dd = 9.99;
		
		double price = 100;
		
	}

}

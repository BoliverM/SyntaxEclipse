package com.syntax.class15;
import java.util.Scanner;
import java.util.Arrays;
public class arrayScanner {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int length = input.nextInt();
		int [] array = new int [length];
		for(int i = 0; i < length; i++){
		      array[i] = input.nextInt();
		}
	}
}

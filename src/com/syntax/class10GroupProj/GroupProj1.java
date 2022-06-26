package com.syntax.class10GroupProj;
import java.util.Scanner;
public class GroupProj1 {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integer values");
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
			sum += num[i];
		}
		System.out.println("Sum of all 5 values is " + sum);
	}
}

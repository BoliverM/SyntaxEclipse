package com.syntax.class10;

public class TaskArrayCharReverse {
	public static void main(String[] args) {
		
		int [] x = new int[]
				{2, 50, 10, 70, 80, 4};
		
		for(int i = x.length - 1; i >= 0; i--) {
			System.out.print(x[i] + " ");
		}
	}
}

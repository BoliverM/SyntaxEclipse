package com.syntax.class07;

public class WhileLoopExamples {
	public static void main(String[] args) 
	{
		//print numbers from 1 to 10;
		int num = 1;
		while(num <= 10) {
			System.out.print(num + " ");
			num++;
		}
		//print numbers from 10 to 100;
		System.out.println();
		int a = 10;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}
		
		//print numbers from 10 + 1;
		System.out.println();
		int b = 1;
		while (b >= 1) {
			System.out.println(b);
			b--;
		}
		
		//print numbers from 100 to 50;
		int c = 100;
		while(c >= 50) {
			System.out.print(c + " ");
			c--;
		}
		
		//print numbers from -1 to -10
		int d = -1;
		while (d >= -10) {
			System.out.print(d + " ");
			d--;
		}
		//print number from 1 to 20 but only even numbers
		//1st way
		System.out.println();
		int e = 2;
		while (e <= 20) {
			System.out.print(e + " ");
			e += 2;
		}
		System.out.println();
		//2nd way
		int f = 1;
		while(f <= 20) {
			if(f % 2 == 0) {
				System.out.print(f + " ");
			}
			f++;
		}
		
		System.out.println();
		int r = 100;
		while (r >= 1) {
			if (r % 2 != 0 ) {
				System.out.print(r + " ");
			}
			r--;
		}
		System.out.println();
		
		//another way
		int y = 99;
		while (y >= 1) {
			System.out.print(y + " ");
			y -= 2;
		}
	}
}

package com.syntax.class08;

public class LoopsPractice {
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 1; i < 6; i++) {
			sum += i;//loop will keep running and will initialize SUM
		}
		System.out.println(sum); // 15
		
		int sum1 = 0;
		for(int i = 1; i < 6; i++) {
			System.out.print(sum1 + " "); //0 1 3 6 10
			sum1 += i;
			//System.out.println(sum + " "); 1 3 6 10 15
		}
		System.out.println();
		System.out.print(sum1); //15
		
	}

}

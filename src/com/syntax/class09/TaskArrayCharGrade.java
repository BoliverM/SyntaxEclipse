package com.syntax.class09;

public class TaskArrayCharGrade {
	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		char [] grade = new char[6];
		grade [0] = 'A';
		grade [1] = 'B';
		grade [2] = 'C';
		grade [3] = 'D';
		grade [4] = 'E';
		grade [5] = 'F';
		
		System.out.println(grade[1]);
		//2nd way
		char [] grade1 = {'A', 'B', 'C', 'D'};
		System.out.println(grade[1]);
		
		char [] grade2 = {'A', 'B', 'C', 'D'};
		for(int i = 0;i < grade2.length; i++) {
			System.out.print(grade2[i] + " ");
		}
	}
}

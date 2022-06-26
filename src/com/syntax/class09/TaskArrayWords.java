package com.syntax.class09;

public class TaskArrayWords {
	public static void main(String[] args) {
		
		String [] words = new String [5];
		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "day";
		words[3] = "coding";
		words[4] = "is";
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + 
						   words[3] + " " + words[2]);
		
		String [] words1 = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " +
						   words[3] + " " + words[2]);
		
		String [] words2 = {"Java", "Saturday", "day"};
		//I want to retrieve all elements
		for (int i = 0; i < words2.length; i++) {
			System.out.print(words2[i] + " ");
		}
	}
}

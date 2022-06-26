package com.syntax.class12;

public class StringDemo6 {
	public static void main(String[] args) {
		
		String str = "123457861425411";
		
		int counter = 0;
		
		for (int i1 = 0; i1 < str.length(); i1++) {
			if(str.charAt(i1) == '1') {
				counter++;
			}
		}
	
		System.out.println(counter);
	}
}


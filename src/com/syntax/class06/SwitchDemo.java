package com.syntax.class06;

public class SwitchDemo {
	public static void main(String[] args) 
	{
		char choice = 'Y';
		String meaning;
		
		//Variable and matching cases must be of same type
		switch (choice) {
		
		case 'Y':
			meaning = "Yes";
			break;
		case 'M':
			meaning = "Maybe";
			break;
		case 'N':
			meaning = "No";
			break;
		default:
			meaning = "Unknown";
			break;
		}
		System.out.println(meaning);
	}

}

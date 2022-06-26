package com.syntax.class06;

import java.util.Scanner;

public class HWCountryLanguage {
	public static void main(String[] args) 
	{
		/* SWITCH Statements
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		Scanner input = new Scanner(System.in);
		String country, language;
		
		System.out.println("Enter a country");
		country = input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "usa":
			language = "English";
			break;
		case "mexico":
			language = "Spanish";
			break;
		case "china":
			language = "Mandarin";
			break;
		case "india":
			language = "Hindi";
			break;
		case "Philippines":
			language = "Tagalog";
			break;
		default:
			language = "Unknown";
		}
		
		System.out.println("The language they speak in " + country + " is " + language);
	}
}

package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String[] args) 
	{
		/*let's ask a user where is he from
		 * based on the country we will define a favorite food
		 */
		
		Scanner scan = new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from");
		country = scan.nextLine();
		//if country is converted to lowercase, case must match with lowercase
		//country.toUppperCase()-->
		switch (country.toLowerCase()) {
		
		case "mMexico":
			favoriteFood = "taco";
			break;
		case "Canada":
			favoriteFood = "poutine";
			break;
		case "Turkey":
			favoriteFood = "lahmacun";
			break;
		case "Pakistan":
			favoriteFood = "pati chai";
			break;
		case "Egypt":
			favoriteFood = "koshary";
			break;
		case "USA":
			favoriteFood = "burgers";
			break;
		default:
			favoriteFood = "unknown";
			break;
		}
		System.out.println("You are from " + country + " and your favorite food is " + favoriteFood);
	}

}

package com.syntax.class05;

public class ELogicalOr {
	public static void main(String[] args) 
	{
		/*
		 * Monday and Friday -------> No Class
		 * Tuesday and Wednesday ---> Manual Testing Class
		 * Thursday ----------------> Review Class
		 * Saturday and Sunday -----> Java Class
		 */
		
		String day = "Monday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		}
		else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have Manuesl Testing Class");
		}
		else if (day.equals("Thursday")) {
			System.out.println("I have a Review Class");
		}
		else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}
		
		System.out.println("---------------------------");
		
		int num1 = 20;
		int num2 = 10;
		int num3 = 22;
		
		if (num1 > num2 || num1 > num3) {
			System.out.println("The largest number is " + num1);
		}
		else if (num3 > num1 || num3 > num2) {
			System.out.println("The largest number is " + num3);
		}
		else if (num2 > num1 || num2 > num3) {
			System.out.println("The largest number is " + num2);
		}
	}

}

package com.syntax.class07;

public class IncrementAndDecrement {
	public static void main(String[] args) 
	{
		int x = 10;
		
		x = x + 1;
		x += 1;
		System.out.println(x); //12
		
		x++; //increments value of a variable by 1
		System.out.println(x); //13
		
		x--; //decrements value of a variable by 1
		System.out.println(x); //12
		
		//increment and decrement operators work only with variables (x, y, z)
		
		//10++; CE: Invalid argument to operator ++/--
		
		int num = 100;
		num++;
		System.out.println(num);
		
		/*LOOP
		 * what? - statement that executes block of code # of times based on the condition
		 * 
		 * why? -- eliminate redundancy
		 * 
		 * how?
		 * 
		 * -----while loop - repeats block of code based on the true condition
		 * -----do while - when we have to execute code at least 1 time - do loops is used
		 * -----for loop - executes block of code as long as condition is true.
		 * for loop is best choice to use when we know how many times we want to repeat
		 * block of codes
		 * enhanced for loop/advanced for loop/for each loop
		 * 
		 * for (initialization; condition; increment/decrement)
		 * {
		 *   block of code;
		 * }
		 * 
		 * int time = 10;
		 * if(time < 12) {
		 * System.out.println("Morning");} 1 output
		 * 
		 * while (time < 12 ) {
		 * System.out.println("Morning");} //output infinite loop
		 */
	}
}

package com.syntax.class10;

public class HWDOUBLE {
	public static void main(String[] args) {
		
		/*create an array to store double values and then print all the elements
		 * using 2 differnt loops
		 */
		
		double[] num = {2.99, 3.99, 4.99, 5};
		for(double x : num) {
			System.out.print(x + " - ");
		}
		
		System.out.println(" ");
		for(int i= 0; i < num.length; i++) {
			System.out.print(num[i] + " - ");
		}
		
		//create an array of integers
		//and calculate the sum of all elements in an array
		int[] num1 = {10, 2, 3, 8, 5};
		int sum = 0;
		for(int i = 0; i < num1.length; i++) {
			sum += num1[i];
		}
		System.out.println(" ");
		System.out.println("Sum of all elements " + sum);
		
		sum = 0;
		for(int n : num1) {
			System.out.print(n + " - ");
		}
		
	}
}

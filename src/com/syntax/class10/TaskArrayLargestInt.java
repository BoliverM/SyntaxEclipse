package com.syntax.class10;

public class TaskArrayLargestInt {
	public static void main(String[] args) {
		
		int[] array = {5 ,110, 80, 55, 1, 50, 90};
		//regular array
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The largest element is " + max);
		
		//enhanced array
		max = array[0];
		
		for (int num : array) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("Enhanced: The largest element is " + max);
	}	
}

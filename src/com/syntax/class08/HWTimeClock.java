package com.syntax.class08;

public class HWTimeClock {
	public static void main(String[] args) 
	{
		/*
		 * Using nested loop, create a 24 hour clock that will 
		 * display 2 digits for an hour and 2 digits for a minute.
		 * Example:
		 * 10:00	10:01	10:02	10:59	11:00	……etc
		 */
		for (int x1 = 0; x1 <= 2; x1++) {
			for (int x2 = 0; x2 <= 3; x2++ ) {
				for (int y1 = 0; y1 <= 5; y1++) {
					for (int y2 = 0; y2 <= 9; y2++) {
						if(x1 == 1 && x2 >= 2) {
							break;
						}else {
							System.out.println(x1 + "" + x2 + ":" + y1 + ""+ y2);
						}
					}
				}
			}
		}	
	}
}

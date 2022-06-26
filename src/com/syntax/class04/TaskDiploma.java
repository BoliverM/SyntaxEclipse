package com.syntax.class04;

public class TaskDiploma {
	public static void main(String[] args) {
		
		boolean studentDiploma = false;
		String student = "Degree";
		double gpa = 3.4;
		
		if (studentDiploma) {
			System.out.println("Congratulations");
			if (student == "Degree") {
				System.out.println("Check GPA score");
				if (gpa >= 3.5) {
					System.out.println("You are eligible for scholarship with a GPA of " + gpa);
				}
				else {
					System.out.println("You should have studied harder");
				}
			}
		}
		else {
			System.out.println("Student should get a degree");
		}
	}
}

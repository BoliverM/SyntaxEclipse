package com.syntax.class12;

public class Task1 {
	public static void main(String[] args) {
		
		String userName = "admin";
		String password = "pass12311";
		String confirmPassword = "pass12311";
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empy");
		}
		else if(password.length() < 8) {
			System.out.println("Password is too short");
		}
		else if(password.contains(userName)) {
			System.out.println("Password cannot contain username");
		}
		else if(!password.contains(confirmPassword)) {
			System.out.println("Password do not match");
		}
		else {
			System.out.println("Your username and password has been created");
		}
	}
}

package com.emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String program;
	private String email;
	private int emailCapacity = 500;
	private int defaultPwdLength = 8;
	private String alternateEmail;

	// constructor to receive data
	public Email ( String firstName, String lastName ) {
		this.firstName = firstName;
		this.lastName = lastName;
		

		//calling a method to ask about the program
		this.program = setProgram();
		
		//show username
		this.username = username;
		System.out.println("Your Username is: " + lastName + "." + firstName );
		
		//call a method to retrieve random password
		this.password = randomPwd(defaultPwdLength);
		System.out.println("Your Password is: " + this.password);
		
		//combine element to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + program + "." + "college.com";
	
		
	}

	// ask for program
	private String setProgram() {
		System.out.println("PROGRAM CODE: \n1 Medical \n2 Engineer \n3 Geologyst \nProgram code: ");
		
		Scanner input = new Scanner(System.in);
		
		int choice = input.nextInt();
			if (choice == 1) {
				return "Medical";
			} 
			else if (choice == 2) {
				return "Engineer";
			} 
			else if (choice == 3) {
				return "Geologyst";
			}
			return " ";
	}

	// generate password
	private String randomPwd(int pwd) {
		String pwdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$";
		char [] password = new char [pwd];
		
		for (int i = 0; i < password.length; i++) {
		int random = (int) (Math.random() * pwdSet.length());
			password[i] = pwdSet.charAt(random);
		}
		return new String(password);
	}

	
	// set for the email capacity
	public void setMailBoxCApacity(int capacity) {
		this.emailCapacity = capacity;
	}
	
	public int getMailBoxCapacity() {
			return emailCapacity;
		}
	
	// set the alternate email
	public void setAlternateEmail(String alternate) {
		this.alternateEmail = alternate;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}

	// change the password
	public void setPasswordChange( String ChangePwd) {
		this.password = ChangePwd;
	}
	
	public String getPAsswordChange() {
		return password;
	}
	
	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName +
				"\nEMAIL: " + email +
				"\nMAILBOX CAPACITY: " + emailCapacity + " mb";
	}
	
}

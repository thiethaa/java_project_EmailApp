package com.emailApp;

import java.util.UUID;

public class EmailApp {

	public static void main(String[] args) {
		
		Email email = new Email ("Omar","Zaman");
		System.out.println(email.showInfo());
		
		email.setAlternateEmail("zamanOmar@gmail.com");
		System.out.println("ALTERNATE EMAIL: "+ email.getAlternateEmail());
		
		email.setPasswordChange("loveOmar");
		System.out.println("NEW PASSWORD: " +  email.getPAsswordChange());
		
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		uuid = uuid.replace("-", "");
		System.out.println(uuid);

	}

}

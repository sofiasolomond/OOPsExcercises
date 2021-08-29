package com.greatlearning.service;

import java.util.Random;

public class CredentialService {

	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyx";
		String numbers = "1234567890";
		String specialChars = "@#$%";
		String totalStr = capitalLetters + smallLetters + numbers + specialChars;

		Random random = new Random();
		char[] passwd = new char[8];

		for (int i = 0; i < 8; i++) {
			passwd[i] = totalStr.charAt(random.nextInt(totalStr.length()));
		}
		return passwd;
	}

	public String generateEmailAddress(String firstName, String lastName, String dept) {
		return firstName + lastName + "@" + dept + ".company.com";

	}

	public void displayCredentials(String firstName, String email, char[] password) {
		System.out.print("\n");
		System.out.println("Dear " + firstName + ",\n" + "Your credentails are as follows:");
		System.out.println("Email -->  " + email);
		System.out.println("Password -->  " + String.valueOf(password));
	}

}

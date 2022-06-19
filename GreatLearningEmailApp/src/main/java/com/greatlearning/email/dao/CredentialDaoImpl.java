package com.greatlearning.email.dao;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class CredentialDaoImpl implements CredentialDao {

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		String emailAddress = emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + department + ".greatlearning.com";
		return emailAddress;	
	}

	@Override
	public char[] generatePassword() {
		Random random = new Random();
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%^&*()_~`{}[]:;'<>?/.,\"";
		String combinedValues = capitalLetters + smallLetters + numbers + specialCharacters;
		// considering the password length as 8
		char[] password = new char[8]; 
		// generate the password
		for(int i = 0; i< 8 ; i++) {
			password[i] = combinedValues.charAt(random.nextInt(combinedValues.length()));
		}
		return password;
	}
}

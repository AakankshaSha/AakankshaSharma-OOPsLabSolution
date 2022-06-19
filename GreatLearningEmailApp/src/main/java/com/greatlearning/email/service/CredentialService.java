package com.greatlearning.email.service;

import com.greatlearning.email.model.Employee;

public interface CredentialService {
	public char[] generatePassword();
	public String generateEmailAddress(Employee emp, String department);
	public void showCredentials(Employee emp, String department); 
}

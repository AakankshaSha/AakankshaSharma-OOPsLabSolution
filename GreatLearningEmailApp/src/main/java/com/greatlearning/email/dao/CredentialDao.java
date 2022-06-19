package com.greatlearning.email.dao;

import com.greatlearning.email.model.Employee;

public interface CredentialDao {
	public String generateEmailAddress(Employee emp, String department);
	public char[] generatePassword();
}

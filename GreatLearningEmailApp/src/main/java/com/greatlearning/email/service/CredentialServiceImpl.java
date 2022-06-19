package com.greatlearning.email.service;

import com.greatlearning.email.dao.CredentialDao;
import com.greatlearning.email.dao.CredentialDaoImpl;
import com.greatlearning.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	CredentialDao dao = new CredentialDaoImpl();

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		return dao.generateEmailAddress(emp, department);
	}

	@Override
	public char[] generatePassword() {
		return dao.generatePassword();
	}

	@Override
	public void showCredentials(Employee emp, String department) {
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email    --> " + dao.generateEmailAddress(emp, department));
		System.out.println("Password --> " + dao.generatePassword());	
	}
}

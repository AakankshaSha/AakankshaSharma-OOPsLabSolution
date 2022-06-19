package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.CredentialServiceImpl;

public class EmailApp {
	public static void main(String[] args) {
		CredentialService service = new CredentialServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name");
		String firstName = sc.next().toLowerCase();
		
		System.out.println("Enter the Last Name");
		String lastName = sc.next().toLowerCase();
		
		Employee employee = new Employee(firstName, lastName);
		
		String department = "";
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			System.out.println("Enter correct choice");
			break;
		}
		service.showCredentials(employee, department);
	}
}

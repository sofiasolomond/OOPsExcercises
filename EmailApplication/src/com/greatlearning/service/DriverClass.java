package com.greatlearning.service;

import java.util.Scanner;
import com.greatlearning.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Credential Creation Service !! ");
		String options = "";
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter Employee first name");
			String fname = sc.next();
			System.out.println("\nEnter Employee last name");
			String lname = sc.next();
			Employee emp1 = new Employee(fname, lname);
			System.out.println("\nPlease Enter the department from the following");
			System.out.println("-->Technical");
			System.out.println("-->Admin");
			System.out.println("-->Human Resources");
			System.out.println("-->Legal");
			System.out.println("Enter full name of department");
			String dept = sc.next();
			CredentialService cs = new CredentialService();
			String email = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(), emp1.getLastName().toLowerCase(),
					dept.toLowerCase());
			char[] password = cs.generatePassword();
			cs.displayCredentials(emp1.getFirstName(), email, password);
			System.out.println("\n\nDo you want to continue for next employee(yes/no)");
			options = sc.next();
		} while (options.toLowerCase().equals("yes"));
		System.out.print("Thank you for using the service !!! ");
		sc.close();

	}

}

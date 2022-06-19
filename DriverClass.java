package com.GreatLearning.service;

import java.util.Scanner;

import com.GreatLearning.model.Employee;

public class DriverClass {

	public static void main(String[]args) {
	Employee employee = new Employee("Naveen","Muwal")	;
	CredentialService cs = new CredentialService();
	String generatedEmail ;
	char[] generatedPassword ;
		
	
	System.out.println("please enter the department from the following") ;
	
	System.out.println("1.Technical");
	System.out.println("2.Admin") ;
	System.out.println("3. Human Resource") ;
	System.out.println("4. legal");
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	
	if(option==1) {
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"technical");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	
	else if(option==2) {
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"Admin");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if(option==3) {
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"Human Resource");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if (option==4) {
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"Legal");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	
	else 
		System.out.println("enter correct option");
	}

}

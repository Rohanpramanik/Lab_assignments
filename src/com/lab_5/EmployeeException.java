package com.lab_5;

import java.util.Scanner;

public class EmployeeException extends Exception {
	// this method extend the exception class
	public EmployeeException() {
		// no-arg constructor
		super("salary of employee");
	}

	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // read input from user
		System.out.println("Salary of an employee : ");
		int s = sc.nextInt(); // store input in a

		try { // here we write which codes may occur exception
			if (s < 3000) {
				throw new EmployeeException();
			}
		} catch (EmployeeException Ee) { // it handle the exception
			System.out.println("Salary of the employee is less then the 3000");
		} finally { // it must execute whether exception is handle or not
			System.out.println("Your salary is " + s);
		}

	}

}

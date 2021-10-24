package com.lab_5;

import java.util.Scanner;

public class ValidateAge extends Exception {
	//this method extends the exception class
	public ValidateAge() { // no-arg constructor
		super("The Age should be above 15");
	}
	// main method
	public static void main(String[] args) {
		Scanner age = new Scanner(System.in); //read the input from user
		System.out.print("Enter your age : ");
		int n = age.nextInt();   //store the input in n
		try {   // here we write which codes may occur exception
			if (n < 15) { 
				throw new ValidateAge(); 
			}
		} catch (ValidateAge ag) {  // it handle the exception
			System.out.println("Your age is below the minimum age, which is 15");
		} finally {  // it must execute whether exception is handle or not
			System.out.println("Your age is " + n);
		}
	}

}

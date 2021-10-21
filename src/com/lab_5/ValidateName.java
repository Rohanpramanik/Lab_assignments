package com.lab_5;

import java.util.Scanner;

public class ValidateName extends Exception {
	
	public ValidateName() {
		super("full name of the employee");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First name : ");
		String fn = sc.nextLine();
		System.out.print("Last name : ");
		String ln = sc.nextLine();
		
		try {
			if(fn.isEmpty() || ln.isEmpty()) {
				throw new ValidateName();
			}
		} catch (ValidateName vn) {
			System.out.println("firstName and lastName can not be blank");
		}finally {
			System.out.println("Your name is : "+ fn +" "+ ln);
		}
		

	}

	

}



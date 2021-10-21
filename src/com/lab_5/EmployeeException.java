package com.lab_5;

import java.util.Scanner;

public class EmployeeException extends Exception {
	
	public EmployeeException() {
		super("salary of employee");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Salary of an employee : ");
		int s = sc.nextInt();
		
		try{  
   	     if(s < 3000){         
   	        throw new EmployeeException();
   	     }          
		}
   	    catch(EmployeeException Ee){
   	    System.out.println("Salary of the employee is less then the 3000" );        
   	    }
   	    finally{
   	        System.out.println("Your salary is " + s);
   	    }   

	}

}


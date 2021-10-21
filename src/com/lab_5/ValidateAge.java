package com.lab_5;

import java.util.Scanner;

public class ValidateAge extends Exception{

	public ValidateAge() {
		super("The Age should be above 15"); 
		
	}

	public static void main(String[] args) {
		  Scanner age = new Scanner (System.in);
	      System.out.print("Enter your age : ");
	      int n = age.nextInt();
	      
	      try{  
	    	     if(n < 15){         
	    	        throw new ValidateAge();
	    	     }          
	    	    }
	    	    catch(ValidateAge ag){
	    	    System.out.println("Your age is below the minimum age, which is 15" );        
	    	    }
	    	    finally{
	    	        System.out.println("Your age is " + n);
	    	    }   
	    	}

	}




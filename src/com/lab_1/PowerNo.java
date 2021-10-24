package com.lab_1;

import java.util.Scanner; // import the scanner class property

public class PowerNo 
{
	// write the logic of the program
	public static boolean checkNumber(int n)  // directly calling allowed
	{
	    return(n==1 || n==2 || n%4==0);  // retrun the boolean value either true or false
	}
	//main method
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // read the input from user
		System.out.println("Enter the number : ");
		int n = sc.nextInt();     // store the input in n
		System.out.print(checkNumber(n)); // call the method and print the result

	}

}

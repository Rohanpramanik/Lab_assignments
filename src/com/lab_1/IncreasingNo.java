package com.lab_1;

import java.util.Scanner; //using to import scanner class property

public class IncreasingNo 
{
	//method where we write the logic of the program
	public static boolean checkNumber(int n)  //allow direct access
	{
		int max = n;
		while (n > 0) {
			int rem = n % 10;
			if (rem < max) 
			{
				max = rem;
			} 
			else 
			{
				break;  
			}
			n = n / 10;
		}
		return (n == 0);    //return statement

	}
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   //read the input from the user
		System.out.println("Enter the no : ");
		int n = sc.nextInt();              // store the input to n 
		System.out.println(checkNumber(n)); // calling the method and printing the result
	}

}

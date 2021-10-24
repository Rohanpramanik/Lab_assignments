package com.lab_1;

import java.util.Scanner;  // import the scanner class property

public class NaturalNo 
{
	static int sum = 0; // allow direct access because of static.
	public static int calculateSum(int n)  //method where we write the logic and it also allow direct access
	{
		for (int i = 1; i <= n; i++)   // used to iterate the logic 
		{
			if (i % 3 == 0 && i % 5 == 0) 
			{
				sum = sum + i;
			}
		}
		return sum; // return statement
	}
	//main method
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  // read the input from user
		System.out.println("Enter the no : ");
		int n = sc.nextInt();       //store the input to n
		System.out.println(calculateSum(n));  // call the method and print the result 
	}
}

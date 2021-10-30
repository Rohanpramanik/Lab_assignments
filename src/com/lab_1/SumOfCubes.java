package com.lab_1;

import java.util.Scanner; // import the scanner class property

public class SumOfCubes 
{
	static int temp = 0;
	// main method and also write the logic here
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);   //read the user input
		System.out.println("enter the digit");
		int n = sc.nextInt();    //store the input in n

		for (int i = 1; i <= n; i++) // used to iterate the certain code  
		{
			temp = temp + (i * i * i);
		}
		System.out.println(temp);  // print the result
	}
}


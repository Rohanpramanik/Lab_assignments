package com.lab_1;

import java.util.Scanner;

//Using Recursive
// method where we write the logic 
public class Fibonacci 
{
	static int n1=1, n2=1,n3=0;
	static void printFibonacci(int n) 
	{
		if(n>0) 
		{
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" " + n3);
			printFibonacci(n-1);// calling again the same method this is recursive
		}
	}
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // read the input from user
		System.out.print("enter the range ");
		int n = sc.nextInt();               // store the input in veriable n
		System.out.println(n1 + " " + n2);
		printFibonacci(n-2); //calling the method
	}
}


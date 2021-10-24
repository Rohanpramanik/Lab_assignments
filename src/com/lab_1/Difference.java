package com.lab_1;

import java.util.Scanner;
// logic of the program used to write in the method
public class Difference 
{
	public static int calculateDifference(int n) 
	{
		int temp = 0, emp = 0;
		for (int i = 1; i <= n; i++) 
		{
			temp = temp + (i * i);
			emp = emp * i;
		}
		emp = emp * emp;
		int diff = temp - emp;
		return diff; // or we can write return(temp-emp)
	}
// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //for taking input
		System.out.println("enter the no : ");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n)); // calling the method

	}

}


package com.lab_2;

import java.util.Scanner;

public class ReverseArray {
	//method where we write the logic 
	public static int[] getSorted(int a[], int n)  // allow direct calling
	{
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) 
			{
				if (a[j] < a[i])   //argument should be boolean type
				{
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}

		}
		return a; // return an array 

	}
	//main method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);  //read input from user
		System.out.print("enter the range : ");  
		int n = sc.nextInt();   //store the input
		System.out.println("enter the element : ");
		int[] a = new int[n];  // store the input in array
		
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();  //
		}
		
		int b[] = getSorted(a, n); //calling the getSorted method 
		
		for (int i = 0; i < n; i++) 
		{
			System.out.print(a[i] + " "); 
		}

	}

}
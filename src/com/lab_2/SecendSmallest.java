package com.lab_2;

import java.util.Scanner;

public class SecendSmallest {
	//method where write the logic 
	public static int getSecondSmallest(int a[], int n) { //allow direct access
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {   //nested loop
				if (a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Second Smallest element : ");
		return a[1];    //return the value which stored at 1 index position

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);// read the input from user
		System.out.print("enter the range : ");
		int n = sc.nextInt();    //store the input in n varible
		System.out.println("enter the element : ");
		int[] a = new int[n];        //input store in array
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(a, n));  //calling getSecond method using print statement
	}
}

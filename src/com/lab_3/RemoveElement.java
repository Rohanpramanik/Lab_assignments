package com.lab_3;

import java.util.*;

public class RemoveElement {
	//method where we write business logic
	public static int[] getSorted(int a[], int n) {
		// it allow the direct access because of static
		for (int i = 0; i < n; i++) {  //iterate the statement
			int rev = 0;
			while (a[i] > 0) { // argument should be boolean
				int rem = a[i] % 10;
				rev = rev * 10 + rem;
				a[i] = a[i] / 10;
			}
			a[i] = rev;
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {  //nested loop
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;  //return the array a
	}
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// read the input from user
		System.out.println("enter the range");
		int n = sc.nextInt(); // store the input in n
		int[] a = new int[n]; 
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}	
		int b[] = getSorted(a, n); 
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
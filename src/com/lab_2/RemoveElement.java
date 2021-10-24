package com.lab_2;

import java.util.Scanner;

public class RemoveElement {
	//method where we write the logic of the program
	public static int modifyArray(int a[], int n) { //allow direct access
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {   //nested loop
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		if (n == 0 || n == 1) {
			return n;    //return the value of n
		}
		int j = 0;
		int[] temp = new int[n];
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;//return statement 

	}
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//read input from the user
		int n = sc.nextInt(); //  store the input in n
		int[] a = new int[n];  // store the input into array
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int b = modifyArray(a, n); //calling the method
		for (int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
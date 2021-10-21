package com.lab_1;

import java.util.Scanner;

//Using Recursive
public class Fibonacci {
	static int n1=1, n2=1,n3=0;
	static void printFibonacci(int n) {
		if(n>0) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" " + n3);
			printFibonacci(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the range ");
		int n = sc.nextInt();
		System.out.println(n1 + " " + n2);
		printFibonacci(n-2);

	}
	

}


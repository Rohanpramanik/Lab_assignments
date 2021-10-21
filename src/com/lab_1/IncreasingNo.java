package com.lab_1;

import java.util.Scanner;

public class IncreasingNo {
	public static boolean checkNumber(int n) {
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
		return (n == 0);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
	}

}

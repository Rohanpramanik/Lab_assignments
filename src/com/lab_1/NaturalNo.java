package com.lab_1;

import java.util.Scanner;

public class NaturalNo {
	static int sum = 0;
	public static int calculateSum(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = sc.nextInt();
		System.out.println(calculateSum(n));

	}

}

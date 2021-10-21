package com.lab_1;

import java.util.Scanner;

public class SumOfCubes {
	static int temp = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			temp = temp + (i * i * i);
		}
		System.out.println(temp);
	}
	
}


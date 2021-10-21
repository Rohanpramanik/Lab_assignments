package com.lab_1;

import java.util.Scanner;

public class PowerNo {
	public static boolean checkNumber(int n) {
	    return(n==1 || n==2 || n%4==0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.print(checkNumber(n));

	}

}

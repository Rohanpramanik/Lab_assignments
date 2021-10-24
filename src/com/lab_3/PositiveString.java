package com.lab_3;

import java.util.Scanner;

public class PositiveString {
	//this method return boolean and it allow direct access
	public static boolean positiveString(String s) {
		char[] ch = s.toCharArray(); 
		/*
		 * char[] holds character data types value
		 * toCharArray converts the string into character array
		 */
		int c = 1;
		int i = 0;
		while (i < s.length() - 1) { //in while, argument shoud be boolean
			if (ch[i] < ch[i + 1]) {
				c = c + 1;
			}
			i = i + 1;
		}
		if (c == s.length()) {
			return true;
		}
		return false;
	}
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //read input from user
		System.out.println("enter the element");
		String s = sc.nextLine();  //holds the input at s
		System.out.print(positiveString(s)); //calling positiveString
	}

}

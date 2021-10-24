package com.lab_1;

import java.util.Scanner; // import the scanner class property

public class TrafficLight {
	// main method, program starts from here
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); // read input from user
		String str = sc.nextLine(); // store input in str
		switch (str) // it check the statement 
		{
		case "red": {
			System.out.println("stop");
			break;       // used to break the flow of control
		}
		case "yellow": {
			System.out.println("ready");
			break;
		}
		case "green": {
			System.out.println("go");
			break;
		}
		default: {
			System.out.println("");
		}
		}
	}
}

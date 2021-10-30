package com.lab_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SquareNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking input from user
		System.out.println("Enter Size of the array: ");
		int s = sc.nextInt(); //store the input in size

		// Asking for array size
		int[] arr = new int[s];

		System.out.println();
		System.out.println("Enter " + s + " numbers you wants to do square: ");
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Original array: ");
		for (int n : arr)
			System.out.println(n);

		// Invoking the method
		Map<Integer, Integer> map = getSquares(arr);

		System.out.println();
		System.out.println("Squares of each numbers : ");
		// Fetching each number and square of the each number
		// and printing the same
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	// Creating a method to perform the square of numbers
	public static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		// taking each number from array and making the square of that number and add on
		// the map
		for (int n : arr) {
			map.put(n, n * n);
		}

		return map;
	}
}

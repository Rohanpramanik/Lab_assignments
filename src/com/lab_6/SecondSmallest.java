package com.lab_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallest {
	public static int getSecondSmallest(Integer[] arr) {
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		return list.get(1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //using to take input
		System.out.println("Enter the size:");
		int s = sc.nextInt();   //store the input in s

		Integer[] arr = new Integer[s];// used to take s elements in array

		System.out.println("Enter " + s + " elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Second smallest element in list: " + getSecondSmallest(arr) );
	}
}

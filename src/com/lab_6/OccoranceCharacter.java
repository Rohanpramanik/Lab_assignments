package com.lab_6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccoranceCharacter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// Taking input from user
		System.out.println("Enter a String : ");
		String str = scn.next();

		// Convert the string to char array
		char[] arr = str.toCharArray();

		// Fetching each char from char array
		for (char ch : arr) {
			System.out.println("Char array contains: " + ch + " ");
		}

		System.out.println();

		// invoking the function
		Map<Character, Integer> map = getValues(arr);

		// Fetching each char and the occurrence of the each char
		// and printing the same
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// creating a method to count each char occurrence in char array
	public static Map<Character, Integer> getValues(char[] arr) {

		// Creating a LinkedHashMap
		// Contain char as a key and occurrence as a value
		Map<Character, Integer> map = new LinkedHashMap<>();

		// checking each char from char array
		for (char ch : arr) {
			if (map.containsKey(ch)) {
				// if char is present in map,
				// incrementing it's count by 1
				map.put(ch, map.get(ch) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				map.put(ch, 1);
			}
		}
		// return the resultant map to the method
		return map;
	}
}

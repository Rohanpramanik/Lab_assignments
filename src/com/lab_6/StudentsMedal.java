package com.lab_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentsMedal {

	public static void main(String[] args) {

		HashMap<String, Integer> student = new HashMap<>();

		student.put("Rohan", 68);
		student.put("Dhawan", 86);
		student.put("Sohan", 70);
		student.put("Mohan", 96);
		student.put("pawan", 80);
		student.put("Hawan", 59);

		// Calling the method and store the result in map
		Map<String, String> sd= getStudent(student);

		// iterating the results
		for (Entry<String, String> entry : sd.entrySet())
			System.out.println(entry.getKey() + " won " + entry.getValue());
	}

	// Creating a method to perform the given operation
	public static HashMap<String, String> getStudent(HashMap<String, Integer> student) {

		HashMap<String, String> std= new HashMap<>();

		// Fetching the key from input hashmap and store it in a set
		Set<String> set = student.keySet();

		// Logic for perform the operation in given condition
		for (String s : set) {
			Integer marks = student.get(s);

			if (marks > 90)
				std.put(s, "Gold");
			else if (marks < 90 && marks >= 80) {
				std.put(s, "Silver");
			} else if (marks < 80 && marks >= 70) {
				std.put(s, "Bronze");
			}
		}
		// return the resultant hashmap
		return std;
	}
}

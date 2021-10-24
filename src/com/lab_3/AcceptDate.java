package com.lab_3;

import java.util.*;
import java.time.*;

public class AcceptDate {
	//method used to write the logic
	public static int[] difference(LocalDate past_date, LocalDate today) {
		int[] m = new int[3];
		Period diff = Period.between(past_date, today);
		int years = diff.getYears();//it is used to get the amount of years of the particular period
		int months = diff.getMonths(); //this method returns the month 
		int date = diff.getDays(); //this method returns the day of the week 
		m[0] = date;
		m[1] = months;
		m[2] = years;
		return m;
	}
	//main method
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);  //read the user input
		LocalDate past_date = LocalDate.of(1955, 01, 19); 
		/*
		 * LocalDate.of used to create an instance of LocalDate 
		 * from the input year, month and day of the month.
		 */
		LocalDate today = LocalDate.now();

		int[] m = difference(past_date, today);
		System.out.println("date: " + m[0] + "  month:" + m[1] + "  year:" + m[2]);

	}

}
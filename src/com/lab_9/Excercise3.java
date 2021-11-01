package com.lab_9;
import java.util.Scanner;

@FunctionalInterface
interface UsernameAndPassword{
	boolean validation(String username, String password);
}
public class Excercise3 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		UsernameAndPassword up= (username, password) -> 
			username.equals("Rohan") && password.equals("2000");
		
		System.out.print("Enter User Name : ");
		String username= scn.next();
		
		System.out.println();
		System.out.print("Enter Password : ");
		String password= scn.next();
		
		System.out.println();
		System.out.println("Status: "+ up.validation(username, password));
		
		scn.close();
	}

}
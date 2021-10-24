package com.lab_3;
import java.util.*;

public class MirrorImage{
	//method where write the business logic
	public static String getImage(String s) {
                String str ="";
                char ch;
                int i = 0;
                while(i<s.length()) //length() return the length of the string
                {
                  ch = s.charAt(i); //charAt() return the character at a specified index in a string
                  str = ch + str;
                  i++;
                }
                 s += "|" + str;
                 return s;   //return statement
                 
	}
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // store input as a string in s
        //StringBuilder s1 = new StringBuilder(s);

        System.out.println(getImage(s)); //calling getImage method
     }
}

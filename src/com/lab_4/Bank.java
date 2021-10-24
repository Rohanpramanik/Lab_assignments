package com.lab_4;

public class Bank
{
	//main method
	public static void main(String[] args) 
	{
		
		Person p1= new Person("smith", 24);
		Person p2= new Person("Kathy", 23);
		
		//object reference of salaryAccount and CurrentAccount
		SalaryAccount s1= new SalaryAccount();
		CurrentAccount c1= new CurrentAccount();
		
		//calling the createAccount method 
		s1.createAccount(p1,2000);  
		c1.createAccount(p2, 3000);
		
		// printing the final balence
		System.out.println(s1.balance);
		System.out.println(c1.balance);
		
		
	}

}
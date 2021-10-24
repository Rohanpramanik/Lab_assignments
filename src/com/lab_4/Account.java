package com.lab_4;

public class Account {
	
	//declaring fields
	private static long accNum=1000;
	static double minBal=500;    // allow direct access
	private double balance;
	private String accHolder;
	Person p;
	
	//no-arg constructor
	public Account() 
	{
		
	}
	
	//parameterised constructor
	public Account(Person p) 
	{
		this.p=p;
	}
	
	//getter & setters
	public static long getAccNum() {
		return accNum;
	}

	public static void setAccNum(long accNum) {
		Account.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person p) {
		this.accHolder = p.getName();
	}
	
	//using toString method to override  
	@Override
	public String toString() 
	{
		return "Account [balance=" + balance + ", accHolder=" + accHolder + ", p=" + p + "]";
	}
	
	//logic for deposit, its used when any money deposite to account
	public void deposit(double depAmount) 
	{
		if(depAmount>0) 
		{
			this.balance+= depAmount;
			System.out.println("Your total balance is: "+this.balance);
		}
	}	
	
	//declaring withdraw method
	public void withdraw(double withAmount) 
	{
		
	}	
}

package com.lab_4;

public class SalaryAccount extends Account{
	
	//declaring fields
	static final double MINIMUM_BALANCE=500; //allow direct access
	String name= this.getAccHolder();
	double balance= this.getBalance();
	
	//no-arg constructor
	public SalaryAccount() {
	}
	
	//parameterised constructor
	public SalaryAccount(Person p) {
		super(p);
	}
	//toString method
	@Override
	public String toString() {
		return "SalaryAccount [name=" + name + ", balance=" + balance + "]";
	}
	// Overridden method from account class
	@Override
	public void withdraw(double withAmount) {
		double checkBal= this.balance-withAmount;
		if(checkBal<= MINIMUM_BALANCE) {
			System.out.println("Your current balance is: "+this.balance +"It is less then minimum balence so, your request is not possible");
		}
		
		else if (this.balance>=withAmount) {
			this.balance-=withAmount;
			 System.out.println(this.name+" having account number has remaining balance is:"+this.balance);
		}
		 else {
			System.out.println("Your don't have sufficient amount to withdraw. available balance is: "+this.balance);
		}
	}	
	//create account method
	public void createAccount(Person p, double initialBal) {
		this.balance=initialBal;
		long accNum= getAccNum()+1;
		System.out.println("Your account name is: "+p.getName()+" ,your account number is: "+accNum+" and your balance is: "+this.balance);
	}	
}
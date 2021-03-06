package com.lab_4;

public class CurrentAccount extends Account{
	
	//declaring fields
	double overDraftLimit=10000;
	String name= this.getAccHolder();
	double balance= this.getBalance();
	static long accountNum= Account.getAccNum();
		
	//no-arg constructor
	public CurrentAccount() {
		super();
	}
	
	//parameterised constructor
	public CurrentAccount(Person p) {
		super(p);
	}
	
	// Using toString method to override
	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", name=" + name + ", balance=" + balance + "]";
	}
	// Overridden method of Account class
	@Override
	public void withdraw(double withAmount) {
		double checkOverDraft=this.overDraftLimit-withAmount;
		if(checkOverDraft<withAmount) {
			System.out.println("Your overdraft limit reached. You will not able to withdraw.");
		}
		
		else if (this.balance>=withAmount) {
			this.balance-=withAmount;
			this.overDraftLimit=checkOverDraft;
			System.out.println(this.name+" having account number "+CurrentAccount.accountNum+" has remaining balance is:"+this.balance);
		}
		
		else {
			System.out.println("You dont have sufficient balance to withdraw.");
		}
		
	}	
	//creating account method
	public void createAccount(Person p, double initBal) {
		this.balance=initBal;
		long accNum= getAccNum()+1;
		System.out.println("Account name "+p.getName()+"having account number is: "+accNum+" and your balance is: "+balance);
	}
	
}
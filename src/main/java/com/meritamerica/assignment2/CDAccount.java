package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	public CDOffering offering = new CDOffering();
	public int term; 
	public Date startDate = new Date();
	
	
	public CDAccount(CDOffering offering, double balance) {
		super();
		this.offering = offering;
		this.balance = balance; 
	}
	
	double getBalance() {
		return balance;
	}
	double getInterestRate() {
		return interestRate;
	}
	int getTerm() {
		return term;
	}
	// Double check the return.
	java.util.Date getStartDate(){
		return startDate;
	}
	long getAccountNumber() {
		return accountNumber;
	}
	double futureValue(int years) {
		double futureBalance = (balance * Math.pow(1.0 + interestRate, years));
		return futureBalance; 
	}
	
}

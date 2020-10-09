package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	
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
		return Startdate;
	}
	long getAccountNumber() {
		return accountNumber;
	}
	double futureValue() {
		
	}
	
}

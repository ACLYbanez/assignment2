package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {
	final double CHECKING_INTEREST_RATE = 0.0001;
	private double checkingBalance = .0;
	public double openingBalance;
	
	public double futureBalance;

	public CheckingAccount(double openingBalance) {
		super();
		this.openingBalance = openingBalance;
		CHECKING_INTEREST_RATE = interestRate;
	}

	public double getBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getInterestRate() {
		return CHECKING_INTEREST_RATE;
	}

	public boolean withdraw(double amount) {
		if (amount > checkingBalance) {
			return false;
		} else {
			checkingBalance -= amount;
			return true;
		}

	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			checkingBalance += amount;
			return true;
		}

	}

	public double futureValue(int years) {
		double value = Math.pow(1 + CHECKING_INTEREST_RATE, years);
		double FV = checkingBalance * value;
		return FV;
	}

	public String toString() {
		return "Checking Account Balance " + checkingBalance + "\n Checking Account Interest Rate" + CHECKING_INTEREST_RATE
				+ "\n Checking Account Balance in 3 years " + futureValue(3);
	}
}
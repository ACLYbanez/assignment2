package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {
	private double savingsBalance = .0;
	final double SAVINGS_INTEREST_RATE = 0.01;
	
	public SavingsAccount(double openingBalance) {
		this.savingsBalance = openingBalance;
	}

	public double getBalance() {
		return savingsBalance;
	}

	public void setsavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getInterestRate() {
		return SAVINGS_INTEREST_RATE;
	}

	public boolean withdraw(double amount) {
		if (amount > savingsBalance) {
			return false;
		} else {
			savingsBalance -= amount;
			return true;
		}

	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			savingsBalance += amount;
			return true;
		}

	}

	public double futureValue(int years) {
		double value = Math.pow(1 + SAVINGS_INTEREST_RATE, years);
		double FV = savingsBalance * value;
		return FV;
	}

	public String toString() {
		return "Savings Account Balance " + savingsBalance + "\n Savings Account Interest Rate" + SAVINGS_INTEREST_RATE
				+ "\n Savings Account Balance in 3 years " + futureValue(3);
	}
}
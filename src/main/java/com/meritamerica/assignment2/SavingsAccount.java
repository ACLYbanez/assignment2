package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(double openingBalance) {
		this.BalanceSavings = openingBalance;
	}

	private double BalanceSavings = .0;

	public double getBalance() {
		return BalanceSavings;
	}

	public void setBalanceSavings(double balanceSavings) {
		BalanceSavings = balanceSavings;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	private double InterestRate = 0.01;

	public boolean withdraw(double amount) {
		if (amount > BalanceSavings) {
			return false;
		} else {
			BalanceSavings -= amount;
			return true;
		}

	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			BalanceSavings += amount;
			return true;
		}

	}

	public double futureValue(int years) {
		double value = Math.pow(1 + InterestRate, years);
		double FV = BalanceSavings * value;
		return FV;
	}

	public String toString() {
		return "Savings Account Balance " + BalanceSavings + "\n Savings Account Interest Rate" + InterestRate
				+ "\n Savings Account Balance in 3 years " + futureValue(3);
	}
}
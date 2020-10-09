package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {
	private double InterestRate = 0.0001;
	private double BalanceChecking = .0;

	public CheckingAccount(double openingBalance) {
		this.BalanceChecking = openingBalance;
	}

	public double getBalance() {
		return BalanceChecking;
	}

	public void setBalanceChecking(double balanceChecking) {
		BalanceChecking = balanceChecking;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	public boolean withdraw(double amount) {
		if (amount > BalanceChecking) {
			return false;
		} else {
			BalanceChecking -= amount;
			return true;
		}

	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			BalanceChecking += amount;
			return true;
		}

	}

	public double futureValue(int years) {
		double value = Math.pow(1 + InterestRate, years);
		double FV = BalanceChecking * value;
		return FV;
	}

	public String toString() {
		return "Checking Account Balance " + BalanceChecking + "\n Checking Account Interest Rate" + InterestRate
				+ "\n Checking Account Balance in 3 years " + futureValue(3);
	}
}
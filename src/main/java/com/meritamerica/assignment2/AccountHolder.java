package com.meritamerica.assignment2;
import java.util.Arrays;


public class AccountHolder {
	public int numberOfCheckingAccounts;
	public int numberOfSavingsAccounts;
	public int numberOfCDAccounts;
	public double checkingBalance;
	public double savingsBalance; 
	public double CDBalance; 
	public double combinedBalance;
	public CheckingAccount checkingAccount;
	public SavingsAccount savingsAccount;
	public CDAccount CDaccount;
	public CheckingAccounts[] = new CheckingAccount[];
	public SavingsAccounts[] = new SavingsAccount[];
	public CDAccounts[] = new CDAccount[];
	public String firstName;
	public String middleName;
	public String lastName;
	public String ssn;
	CheckingAccount checkingAccountVariable = null;
	SavingsAccount savingsAccountVariable = null;
//a
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
			//double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccountVariable;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccountVariable;
	}
//b
	public String getFirstName() {
		return firstName;
	}
//c
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
//d
	public String getMiddleName() {
		return middleName;
	}
//e
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
//f
	public String getLastName() {
		return lastName;
	}
//g
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//h
	public String getSSN() {
		return ssn;
	}
//i
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
//j
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
	}
//k
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		return checkingAccount;
	}
//l	
	CheckingAccount[] getCheckingAccounts() {
		return null;
	}
//m
	int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccounts;
	}
//n	
	double getCheckingBalance() {
		return checkingBalance;
	}
//o	
	public double addSavingsAccount(double openingBalance) {
		return openingBalance;
	}
//p	
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		return savingsAccount;
	}
//q	
	SavingsAccount[] getSavingsAccounts() {
		return null;
	}
//r	
	int getNumberOfSavingsAccounts() {
		return numberOfSavingsAccounts;
	}
//s	
	double getSavingsBalance() {
		return savingsBalance;
	}
//t	
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		// return CDAccount ..? 
	}
//u
	CDAccount addCDAccount(CDAccount cdAccount) {
		// return something...?
	}
//v	
	CDAccount[] getCDAccounts() {
		// return the accounts....?
	}
//w	
	int getNumberOfCDAccounts() {
		return numberOfCDAccounts;
	}
//x	
	double getCDBalance() {
		return CDBalance;
	}
//y	
	double getCombinedBalance() {
		double combinedBalance = checkingBalance + savingsBalance + CDBalance;
		return combinedBalance; 
	}
	
	

	public String toString() {
		return "Name " + this.firstName + " " + this.middleName + " " + this.lastName + "\n SSN " + this.ssn
				+ checkingAccountVariable.toString() + savingsAccountVariable.toString();
	}

}
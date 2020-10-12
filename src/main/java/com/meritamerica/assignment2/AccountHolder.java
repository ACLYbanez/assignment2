package com.meritamerica.assignment2;
import java.util.Arrays;


public class AccountHolder {
	public int numberOfCheckingAccounts;
	public int numberOfSavingsAccounts;
	public int numberOfCDAccounts;
	public int size = 5;
	public double checkingBalance;
	public double savingsBalance; 
	public double CDBalance; 
	public double totalBalance;
	public CheckingAccount checkingAccount;
	public SavingsAccount savingsAccount;
	public CDAccount CDaccount;
	public CheckingAccount[] checkingAccounts = new CheckingAccount[size];
	public SavingsAccount[] savingsAccounts = new SavingsAccount[size];
	public CDAccount[] CDAccounts = new CDAccount[size];
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
		if(totalBalance >= 250000.0) {
			System.out.println("You cannot hold more than $250,000");
			return null;
		} 
		if(numberOfCheckingAccounts == size) {
			size *= 2;
			CheckingAccount[] temp = new CheckingAccount[size];
			for(int i = 0; i < numberOfCheckingAccounts; i++) {
				temp[i] = checkingAccounts[i];
			}
			CheckingAccount account = new CheckingAccount(openingBalance); 
			temp[numberOfCheckingAccounts] = account;
			checkingAccounts = temp;
			numberOfCheckingAccounts++;
			return account;
		} else { 
			CheckingAccount account = new CheckingAccount(openingBalance);
			checkingAccounts[numberOfCheckingAccounts] = account;
			numberOfCheckingAccounts++;
			return account; 
		}
	}
//k
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if(totalBalance >= 250000.0) {
			System.out.println("You cannot hold more than $250,000");
			return checkingAccount; 
		}
		if(numberOfCheckingAccounts == size) {
			size *= 2; 
			CheckingAccount[] temp = new CheckingAccount[size];
			for(int i = 0; i < numberOfCheckingAccounts; i++) {
				temp[i] = checkingAccounts[i];
			}
			
			temp[numberOfCheckingAccounts] = checkingAccount; 
			checkingAccounts = temp;
			numberOfCheckingAccounts++;
			return checkingAccount;
		} else { 
			checkingAccounts[numberOfCheckingAccounts] = checkingAccount; 
			numberOfCheckingAccounts++;
			return checkingAccount;
		}
	}
//l	
	CheckingAccount[] getCheckingAccounts() {
		return checkingAccounts;
	}
//m
	int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccounts;
	}
//n	
	double getCheckingBalance() {
		double total = 0.0;
		for(int i = 0; i < numberOfCheckingAccounts; i++) {
			total += checkingAccounts[i].getBalance();
		}
		return total;
	}
//o	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		if(totalBalance >= 250000.0) {
			System.out.println("You cannot hold more than $250,000");
			return null; 
		}
		if(numberOfSavingsAccounts == size) {
			size *= 2; 
			SavingsAccount[] temp = new SavingsAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = savingsAccounts[i];
			}
			SavingsAccount account = new SavingsAccount(openingBalance); 
			temp[numberOfSavingsAccounts] = account;
			savingsAccounts = temp;
			numberOfSavingsAccounts++;
			return account;
		} else {
			SavingsAccount account = new SavingsAccount(openingBalance); 
			savingsAccounts[numberOfSavingsAccounts] = account;
			numberOfSavingsAccounts++;
			return account;
		}
	}
//p	
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if(totalBalance >= 250000.0) {
			System.out.println("You cannot hold more than $250,000");
			return null;
		}
		if(numberOfSavingsAccounts == size) {
			size *= 2; 
			SavingsAccount[] temp = new SavingsAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = savingsAccounts[i]; 
			}
			temp[numberOfSavingsAccounts] = savingsAccount;
			savingsAccounts = temp;
			numberOfSavingsAccounts++; 
			return savingsAccount;
		} else { 
			savingsAccounts[numberOfCheckingAccounts] = savingsAccount;
			numberOfSavingsAccounts++; 
			return savingsAccount;
		}
	}
//q	
	SavingsAccount[] getSavingsAccounts() {
		return savingsAccounts;
	}
//r	
	int getNumberOfSavingsAccounts() {
		return numberOfSavingsAccounts;
	}
//s	
	double getSavingsBalance() {
		double total = 0.0;
		for(int i = 0; i < numberOfSavingsAccounts; i++) {
			total += savingsAccounts[i].getBalance();
		}
		return total;
	}
//t	
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		if(numberOfCDAccounts == size) {
			size *= 2; 
			CDAccount[] temp = new CDAccount[size]; 
			for(int i = 0; i < numberOfSavingsAccounts; i++ ) {
				temp[i] = CDAccounts[i];
			}
			CDAccount account = new CDAccount(offering, openingBalance);
			temp[numberOfCDAccounts] = account; 
			CDAccounts = temp; 
			numberOfCDAccounts++; 
			return account; 
		} else {
			CDAccount account = new CDAccount(offering, openingBalance); 
			CDAccounts[numberOfCDAccounts] = account; 
			numberOfCDAccounts++;
			return account;
		}
	}
//u
	CDAccount addCDAccount(CDAccount CDAccount) {
		if(numberOfCDAccounts == size) {
			size *= 2; 
			CDAccount[] temp = new CDAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = CDAccounts[i];
			}
			temp[numberOfCDAccounts] = CDAccount; 
			CDAccounts = temp; 
			return CDAccount; 
		} else {
			CDAccounts[numberOfCDAccounts] = CDAccount;
			numberOfCDAccounts++; 
			return CDAccount; 
		}
	}
//v	
	CDAccount[] getCDAccounts() {
		return CDAccounts;
	}
//w	
	int getNumberOfCDAccounts() {
		return numberOfCDAccounts;
	}
//x	
	double getCDBalance() {
		double total = 0.0; 
		for(int i = 0; i < numberOfCDAccounts; i++) {
			total += CDAccounts[i].getBalance();
		}
		return total; 
	}
//y	
	double getCombinedBalance() {
		double combinedBalance = checkingBalance + savingsBalance + CDBalance;
		return combinedBalance; 
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	

	public String toString() {
		return "Name " + this.firstName + " " + this.middleName + " " + this.lastName + "\n SSN " + this.ssn
				+ checkingAccountVariable.toString() + savingsAccountVariable.toString();
	}

}
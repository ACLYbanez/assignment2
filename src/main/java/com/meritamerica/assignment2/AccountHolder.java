package com.meritamerica.assignment2;
import java.util.Arrays;


public class AccountHolder {
	public String firstName;
	public String middleName;
	public String lastName;
	public String ssn;
	CheckingAccount checkingAccountVariable = null;
	SavingsAccount savingsAccountVariable = null;

	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountVariable = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccountVariable = new SavingsAccount(savingsAccountOpeningBalance);
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccountVariable;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccountVariable;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getmiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String geLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public String toString() {
		return "Name " + this.firstName + " " + this.middleName + " " + this.lastName + "\n SSN " + this.ssn
				+ checkingAccountVariable.toString() + savingsAccountVariable.toString();
	}

}
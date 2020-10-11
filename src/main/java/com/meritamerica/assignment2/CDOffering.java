package com.meritamerica.assignment2;

public class CDOffering {
	int term;
	double interestRate;
	
	public CDOffering(int term, double interestRate) {
		this.interestRate = interestRate;
		this.term = term;
	}
	int getTerm(){
		return term;
	}
	double getInterestRate() {
		return interestRate;
	}
}

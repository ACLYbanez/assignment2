package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	public static int size = 5; 
	public static int numberOfAccountHolders;
	public static long[] accountNumbers = new long[size];
	public static AccountHolder[] accountHolders = new AccountHolder[size];
	public static CDOffering[] CDOfferings = new CDOffering[size];
	
	
	static void addAccountHolder(AccountHolder accountHolder) {
		
	}
	 static AccountHolder[] getAccountHolders() {
		 return accountHolders;
	 }
	
	static CDOffering[] getCDOfferings() {
		return CDOfferings;
	}
	
	static CDOffering getBestCDOffering(double depositAmount) {
		CDAccount temp = new CDAccount(CDOfferings[0], depositAmount);
		CDOffering bestOffering = CDOfferings[0];
		for(int i = 0; i < size; i++) {
			if(temp.futureValue(CDOfferings[i].getTerm()) > temp.futureValue(CDOfferings[i - 1].getTerm())) {
				bestOffering = CDOfferings[i];
			}
		}
		return bestOffering;
	}
	
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		CDAccount temp = new CDAccount(CDOfferings[0], depositAmount);
		CDOffering secondBestOffering = CDOfferings[0];
		CDOffering bestOffering = CDOfferings[0];
		for (int i = 1; i < size; i++) {
			if(temp.futureValue(CDOfferings[i].getTerm()) > temp.futureValue(CDOfferings[i - 1].getTerm())) {
				secondBestOffering = bestOffering;
				bestOffering = CDOfferings[i];
			}
		}
		return secondBestOffering;
	}
	
	public static void clearCDOfferings() {
		CDOfferings = null;
	}
	
	static void setCDOfferings(CDOffering[] offerings) {
		CDOfferings = offerings;
	}
	
	static long getNextAccountNumber() {
		return  accountNumbers[numberOfAccountHolders];
	}
	
	static double totalBalances() {
		double totalBalance = 0.0;
		for(int i = 0; i < numberOfAccountHolders; i++) {
			totalBalance += (accountHolders[i].getTotalBalance());
		}
		return totalBalance;
	}
	
	static double futureValue(double presentValue, double interestRate, int term) {
		double futureValue = (presentValue * Math.pow(1.0 + interestRate, term));
		return futureValue;
	}
}

package com.meritamerica.assignment2;

//import static org.junit.Assert.assertEquals;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		CDOffering[] CDOfferings = new CDOffering[5];
		
		CDOfferings[0] = new CDOffering(1,1.8/100); 
		CDOfferings[1] = new CDOffering(2,1.9/100); 
		CDOfferings[2] = new CDOffering(3,2.0/100); 
		CDOfferings[3] = new CDOffering(5,2.5/100); 
		CDOfferings[4] = new CDOffering(10,2.2/100); 
		
		MeritBank.setCDOfferings(CDOfferings);
		
		CDOffering[] fromMeritBankCDOfferings = MeritBank.getCDOfferings();
		
		System.out.println(fromMeritBankCDOfferings[0].getTerm());
		System.out.println(fromMeritBankCDOfferings[0].getInterestRate());
		System.out.println(fromMeritBankCDOfferings[1].getTerm());
		System.out.println(fromMeritBankCDOfferings[1].getInterestRate());
		System.out.println(fromMeritBankCDOfferings[2].getTerm());
		System.out.println(fromMeritBankCDOfferings[2].getInterestRate());
		System.out.println(fromMeritBankCDOfferings[3].getTerm());
		System.out.println(fromMeritBankCDOfferings[3].getInterestRate());
		System.out.println(fromMeritBankCDOfferings[4].getTerm());
		System.out.println(fromMeritBankCDOfferings[4].getInterestRate());
		System.out.println("------------------------");
	}
	public void testAccountHolder() {
		AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston", "633378899");
		
		accountHolder.addCheckingAccount(1000);
		accountHolder.addSavingsAccount(10000);
		
		System.out.println(accountHolder.getFirstName());
		System.out.println(accountHolder.getMiddleName());
		System.out.println(accountHolder.getLastName());
		System.out.println(accountHolder.getSSN());
		System.out.println(accountHolder.getCheckingBalance());
		System.out.println(accountHolder.getSavingsBalance());
		
		// these aren't printing out 
	} public void testAccountHolderBalanceNoMoreThan25000() {

    	
    	AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston","633378899");
    	
    	CheckingAccount checkingAccount1 = new CheckingAccount(1000);
    	SavingsAccount savingsAccount1 = new SavingsAccount(10000);
    	
    	CheckingAccount checkingAccount2 = new CheckingAccount(5000);
    	SavingsAccount savingsAccount2 = new SavingsAccount(50000);
    	
    	CheckingAccount checkingAccount3 = new CheckingAccount(50000);
    	SavingsAccount savingsAccount3 = new SavingsAccount(130000);
    	
       	CheckingAccount checkingAccount4 = new CheckingAccount(5000);
    	SavingsAccount savingsAccount4 = new SavingsAccount(50000);    	

    	accountHolder.addCheckingAccount(checkingAccount1);
    	accountHolder.addSavingsAccount(savingsAccount1);
    	
    	accountHolder.addCheckingAccount(checkingAccount2);
    	accountHolder.addSavingsAccount(savingsAccount2);    	
    	
    	accountHolder.addCheckingAccount(checkingAccount3);
    	accountHolder.addSavingsAccount(savingsAccount3);    	    
    	
    	accountHolder.addCheckingAccount(checkingAccount4);
    	accountHolder.addSavingsAccount(savingsAccount4);  
	
    	System.out.println(accountHolder.getCheckingAccount());
    	System.out.println(accountHolder.getSavingsAccount());
	}
	public void testAdCDAccountToAccountHolder() {
    	CDOffering cdOffering = new CDOffering(1,1.8/100);
    	CDAccount cdAccount = new CDAccount(cdOffering, 5000);
    	
    	
    	AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston","633378899");
    	
    	accountHolder.addCDAccount(cdAccount);
    	System.out.println(accountHolder.getCDAccounts()[0].getTerm());
    	System.out.println(accountHolder.getCDAccounts()[0].getInterestRate());
    	System.out.println(accountHolder.getCDAccounts()[0].getBalance());
	}
	public void tesAddAccountHolderToMeritBank() {
    	
    	AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston","633378899");
    	
    	accountHolder.addCheckingAccount(1000);
    	accountHolder.addSavingsAccount(10000);
    	MeritBank.addAccountHolder(accountHolder);
    	
    	System.out.println(MeritBank.getAccountHolders()[0].getFirstName());
    	System.out.println(MeritBank.getAccountHolders()[0].getMiddleName());
    	System.out.println(MeritBank.getAccountHolders()[0].getLastName());
   		System.out.println(MeritBank.getAccountHolders()[0].getSSN());
    	System.out.println(MeritBank.getAccountHolders()[0].getCheckingBalance());
    	System.out.println(MeritBank.getAccountHolders()[0].getSavingsBalance());
	}
	public void tesCDClearingByMeritBank() {
    	
    	//    Clear the CDs being offered by MeritBank
    	MeritBank.clearCDOfferings();
    	AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston","633378899");
    	
    	accountHolder.addCheckingAccount(1000);
    	accountHolder.addSavingsAccount(10000);
    	MeritBank.addAccountHolder(accountHolder);
    	
    	System.out.println(MeritBank.getCDOfferings());
	}
	 public void tesMeritBankAccountHoldersTotalBalance() {
	    	
	    	AccountHolder accountHolder1 = new AccountHolder("Sam", "John", "Houston","633378899");
	    	
	    	accountHolder1.addCheckingAccount(1000);
	    	accountHolder1.addCheckingAccount(5000);
	    	accountHolder1.addCheckingAccount(50000);    	
	    	
	    	accountHolder1.addSavingsAccount(10000);
	    	accountHolder1.addSavingsAccount(50000);
	    	accountHolder1.addSavingsAccount(130000);
	    	
	    	accountHolder1.addCDAccount(new CDOffering(1, 1.8/100),5000);
	    	
	        System.out.println(accountHolder1.getCombinedBalance()); 
	    	
	    	MeritBank.addAccountHolder(accountHolder1);
	    	
	    	AccountHolder accountHolder2 = new AccountHolder("Jack", "John", "Houston","633378898"); 
	    	
	    	accountHolder2.addCheckingAccount(1000);
	    	accountHolder2.addSavingsAccount(10000);    	
	    	
	    	accountHolder2.addCDAccount(new CDOffering(2, 1.9/100),5000);
	    	MeritBank.addAccountHolder(accountHolder2);
	    	
	        System.out.println(accountHolder2.getCombinedBalance());     	
	    	
	    	AccountHolder accountHolder3 = new AccountHolder("Shiva", "John", "Houston","633378898"); 
	    	
	    	accountHolder3.addCheckingAccount(1000);
	    	accountHolder3.addSavingsAccount(10000);    	
	    	
	    	MeritBank.addAccountHolder(accountHolder3);
	    	
	    	System.out.println(accountHolder3.getCombinedBalance());
	 }
}

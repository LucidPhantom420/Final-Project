//Dani Mayorga (dmayorga6@toromail.csudh.edu)
//Sathwika Reddy Nevoori (snevoori1@toromail.csudh.edu)

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Bank {
	
	String bankName;
	long nextAvailableAccountNumber = 100;
	HashMap<Long, Account> accounts;
	
	
	public Bank(String bankName) {
		this.accounts = new HashMap<Long, Account>();
		this.bankName = bankName;
		
		
	}
	public long createAccount(String customerFirstName, String customerLastName, String customerSSN, String customerEmailAddress, String accountName) {
		Customer newCustomer = new Customer(customerFirstName, customerLastName, customerEmailAddress, customerSSN);
		Account newAccount = new Account(0.0, nextAvailableAccountNumber, false, newCustomer, accountName);
		accounts.put(nextAvailableAccountNumber, newAccount);
		nextAvailableAccountNumber++;
		return newAccount.getaccountNumber();
		
	}
	public void listAccounts() {
		Account currentAccount;
		String accountStatus;
		for(Map.Entry<Long, Account> entry : accounts.entrySet()) {
			currentAccount = entry.getValue();
			
			if(currentAccount.getisClosed()==false) {
				accountStatus = "Account Open";
			}
			else {
				accountStatus = "Account Closed";
			}
			System.out.println(currentAccount.getaccountNumber() + " ( " + currentAccount.getAccountName() + " ): " + currentAccount.getCustomer().getfirstName() + ":" + currentAccount.getCustomer().getlastName() + ":" + currentAccount.getCustomer().getsocialSecurityNumber() + ":" + currentAccount.getbalance() + ":" + accountStatus);
		}
	}
	public void depositFunds(long accountNumber, double amount) {
		if(accounts.containsKey(accountNumber)) {				//Checking if the account exists
			Account account = accounts.get(accountNumber);
			double currentBalance = account.getbalance();
			if(account.getisClosed()) {
				System.out.println("Deposit failed, the balance is: " + currentBalance);
			}
			else {
				currentBalance = currentBalance + amount;
				account.setBalance(currentBalance);
				System.out.println("Deposit successful, the new balance is: " + currentBalance);
			}
		}
		else {
			System.out.println("Account NOT found");
		}
	}
	public void withdrawFunds(long accountNumber, double amount) {
		if(accounts.containsKey(accountNumber)) {				//Checking if the account exists
			Account account = accounts.get(accountNumber);
			double currentBalance = account.getbalance();		//Checking the account balance for that account
			
			if(currentBalance < amount) {
				System.out.println("Withdraw failed, your balance is: " + currentBalance);
			}
			else {
				currentBalance = currentBalance - amount;	//Your current balance is getting subtracted with the amount you are withdrawing
				account.setBalance(currentBalance);
				System.out.println("Withdraw successful, the new balance is: " + currentBalance);
			}	
		}
		else {
			System.out.println("Account NOT found");
		}
	}
	public void closeAccount(long accountNumber) {
		if(accounts.containsKey(accountNumber)) {				//Checking if the account exists
			Account account = accounts.get(accountNumber);
			double currentBalance = account.getbalance();		//Checking the account balance for that account
			account.setisClosed(true);
			System.out.println("Account closed, current balance is: " + currentBalance + ", deposits are no longer possible");
		}
		else {
			System.out.println("Account not found ");
		}
	}
	
	
}

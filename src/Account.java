//Dani Mayorga (dmayorga6@toromail.csudh.edu)
//Sathwika Reddy Nevoori (snevoori1@toromail.csudh.edu)

public class Account {
	Customer accountcustomer;
	
	String accountName;
	double balance;
	long accountNumber;
	boolean isClosed;
	
	public Account(double balance, long accountNumber, boolean isClosed, Customer customer, String accountName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountcustomer = customer;
		this.accountName = accountName;
		
	}
	public double getbalance() {
		return balance;
	}
	public long getaccountNumber() {
		return accountNumber;
	}
	public boolean getisClosed() {
		return isClosed;
	}
	public String getAccountName() {
		return accountName;
		
	}
	public Customer getCustomer() {
		return accountcustomer;
	}
	public void setBalance(double amount) {
		this.balance = amount;
	}
	public void setisClosed(boolean inputValue) {
		this.isClosed = inputValue;
	}
	

}

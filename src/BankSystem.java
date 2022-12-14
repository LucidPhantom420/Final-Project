//Dani Mayorga (dmayorga6@toromail.csudh.edu)
//Sathwika Reddy Nevoori (snevoori1@toromail.csudh.edu)

import java.util.Scanner;

public class BankSystem {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank("Wells Fargo");
		int result = 0;
		String firstName;
		String lastName;
		String emailAddress;
		String socialSecurityNumber;
		String accountName;
		long accountNumber;
		double depositAmount;
		double withdrawAmount;
		
		do {
			System.out.println("1 - Open Account");
			System.out.println("2 - List Accounts");
			System.out.println("3 - Deposit Funds");
			System.out.println("4 - Withdraw Funds");
			System.out.println("5 - Close an Account");
			System.out.println("6 - Exit");
			
			System.out.print("Please enter your choice: ");
			result = scanner.nextInt();
			scanner.nextLine();		//clear buffer
			
			System.out.println("");
			
			if(result == 1) {
				System.out.print("Enter your first name: ");
				firstName = scanner.nextLine();
				
				System.out.print("Enter your last name: ");
				lastName = scanner.nextLine();
				
				System.out.print("Enter your email address: ");
				emailAddress = scanner.nextLine();
				
				System.out.print("Enter your Social Security Numbers: ");
				socialSecurityNumber = scanner.nextLine();
				
				System.out.print("Enter your account name: ");
				accountName = scanner.nextLine();
				
				accountNumber = bank.createAccount(firstName, lastName, socialSecurityNumber, emailAddress, accountName);
				System.out.println("Thank you the account number is: " + accountNumber);
			
			}
			if(result == 2) {
				bank.listAccounts();
			}
			if(result == 3) {
				System.out.print("Please enter your account number: ");
				accountNumber = scanner.nextLong();
				scanner.nextLine();
				
				System.out.print("Enter your deposit: ");
				depositAmount = scanner.nextDouble();
				scanner.nextLine();
				
				bank.depositFunds(accountNumber, depositAmount);
				
			}
			if(result == 4) {
				System.out.print("Please enter your account number: ");
				accountNumber= scanner.nextLong();
				scanner.nextLine();
				
				System.out.print("How much would you like to withdraw?: ");
				withdrawAmount = scanner.nextDouble();
				scanner.nextLine();
				
				bank.withdrawFunds(accountNumber, withdrawAmount);
			}
			if(result == 5) {
				System.out.print("Please enter your account number: ");
				accountNumber = scanner.nextLong();
				scanner.nextLine();
				bank.closeAccount(accountNumber);
			
			
			}
			System.out.println("");
			
		}while(result != 6);
		System.out.println("Goodbye, You have been logged out");
	}
}

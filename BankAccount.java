

import java.util.Scanner;
public class BankAccount {
	 private String accountNumber;
	    private String accountHolder;
	    private double balance;

	    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = initialBalance;
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.printf("Successfully deposited $%.2f.%n", amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.printf("Successfully withdrew $%.2f.%n", amount);
	            } else {
	                System.out.println("Insufficient balance for this withdrawal.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	   
	    public void viewBalance() {
	        System.out.printf("Current balance: $%.2f%n", balance);
	    }


	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        BankAccount account = new BankAccount("123456", "Alice", 1000);  // Example account

	        int choice;

	        do {
	            // Displaying the menu options
	            System.out.println("ATM Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. View Balance");
	            System.out.println("4. Exit");
	            System.out.print("Please select an option (1-4): ");

	            // Taking user input for choice
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1: // Deposit
	                    System.out.print("Enter amount to deposit: $");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;

	                case 2: // Withdraw
	                    System.out.print("Enter amount to withdraw: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;

	                case 3: // View Balance
	                    account.viewBalance();
	                    break;

	                case 4: // Exit
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid option! Please select a valid option.");
	            }
	            System.out.println(); 
	        } while (choice != 4); 

	        scanner.close();

	}

}


   
  

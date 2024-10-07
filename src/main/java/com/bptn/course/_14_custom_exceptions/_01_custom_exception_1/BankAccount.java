package com.bptn.course._14_custom_exceptions._01_custom_exception_1;

public class BankAccount {
	
	private double balance;
	private String accountNumber;
	
	private BankAccount(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public void withdraw(double amount) {
		
		
		
		balance -= amount; // balance = balance - amount;
		
		System.out.println("Withdrawal of $ " + amount + " successful. New balance $" + balance);
	}

}

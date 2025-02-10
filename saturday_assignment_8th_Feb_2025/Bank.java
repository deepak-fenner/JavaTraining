package com.celcom.saturday_assignment_8th_Feb_2025;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Account1{
	private String accountNumber;
	private String accountHolder;
	private double balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	Account1(String accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public void depositAmount(double amount) {
		System.out.println("Initial Amount: "+balance);
		if(amount>0) {
			balance+=amount;
			System.out.println("New Amount: "+balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdrawAmount(double amount) {
		if(amount>0 && amount<=balance) {
			System.out.println("Initial Balance: "+balance);
			balance-=amount;
			System.out.println("New Amount: "+balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
}
public class Bank {
	private List<Account1>accounts=new ArrayList<>();
	void addAccount(Account1 account) {
		accounts.add(account);
		System.out.println("Account Added successfully....");
	}
	void removeAccount(String accountNumber) {
		boolean flag=false;
		for(Account1 account:accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				accounts.remove(account);
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("The account is successfully removed");
		}
		else {
			System.out.println("Account doesnot exist...");
		}
	}
	public Account1 findAccount(String accountNumber1) {
		boolean flag=false;
		for(Account1 account:accounts) {
			if(account.getAccountNumber().equals(accountNumber1)) {
				return account;
			}
		}
		return null;
	}
	public void displayDetails() {
		for(Account1 account:accounts) {
			System.out.println("Account Number:"+account.getAccountNumber());
			System.out.println("Account Holder Name:"+account.getAccountHolder());
			System.out.println("Balance:"+account.getBalance());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bank bank=new Bank();
		int choice;
		do {
			System.out.println("Welcome to Bank:");
			System.out.println("Enter 1---->Add Account");
			System.out.println("Enter 2---->Remove Account");
			System.out.println("Enter 3---->Deposit");
			System.out.println("Enter 4---->Withdraw");
			System.out.println("Enter 5---->Display Accounts");
			System.out.println("Enter 6---->Exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Account Number:");
				String accountNumber=sc.next();
				System.out.println("Enter the Account Holder Name:");
				String accountHolder=sc.next();
				System.out.println("Enter the Initial Balance Amount:");
				double balance=sc.nextDouble();
				Account1 account1=new Account1(accountNumber,accountHolder,balance);
				bank.addAccount(account1);
				break;
			case 2:
				System.out.println("Enter the account Number to remove account:");
				String accountNumber1=sc.next();
				bank.removeAccount(accountNumber1);
				break;
			case 3:
				System.out.println("Enter the account Number to deposit:");
				String accountNumber2=sc.next();
				Account1 account=bank.findAccount(accountNumber2);
				if(account==null) {
					System.out.println("Account doesnot exist..");
				}
				else {
					System.out.println("Enter the amount to be deposited:");
					double depositAmount=sc.nextDouble();
					account.depositAmount(depositAmount);
				}
				break;
			case 4:
				System.out.println("Enter the account Number to Withdraw:");
				String accountNumber3=sc.next();
				Account1 account2=bank.findAccount(accountNumber3);
				if(account2==null) {
					System.out.println("Account doesnot exist..");
				}
				else {
					System.out.println("Enter the amount to be withdrawed:");
					double depositAmount=sc.nextDouble();
					account2.withdrawAmount(depositAmount);
				}
				break;
			case 5:
				System.out.println("All Account Details are as follows:");
				bank.displayDetails();
				break;
			case 6:
				System.out.println("Program Ended.....");
				break;	
			}
		}while(choice!=6);
		
	}

}

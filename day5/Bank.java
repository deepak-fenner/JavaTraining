package com.celcom.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance;
    }
}

 public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account);
    }
    
    public void removeAccount(String accountNumber) {
        Account accountToRemove = null;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accountToRemove = account;
                break;
            }
        }
        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
            System.out.println("Account removed: " + accountToRemove);
        } else {
            System.out.println("Account with number " + accountNumber + " not found.");
        }
    }

    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("Accounts in the bank:");
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Bank Menu:");
            System.out.println("1---->Add Account");
            System.out.println("2----> Remove Account");
            System.out.println("3----> Deposit Money");
            System.out.println("4----> Withdraw Money");
            System.out.println("5----> Display Accounts");
            System.out.println("6----> Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accHolder = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initBalance = sc.nextDouble();
                    Account newAccount = new Account(accNum, accHolder, initBalance);
                    bank.addAccount(newAccount);
                    break;
                case 2:
                    System.out.print("Enter account number to remove: ");
                    String removeAccNum = sc.nextLine();
                    bank.removeAccount(removeAccNum);
                    break;
                case 3:
                    System.out.print("Enter account number to deposit into: ");
                    String depAccNum = sc.nextLine();
                    Account depAccount = bank.findAccount(depAccNum);
                    if (depAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depAmount = sc.nextDouble();
                        depAccount.deposit(depAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number to withdraw from: ");
                    String withAccNum = sc.nextLine();
                    Account withAccount = bank.findAccount(withAccNum);
                    if (withAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withAmount = sc.nextDouble();
                        withAccount.withdraw(withAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    bank.displayAccounts();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

    }
}


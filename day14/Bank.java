package com.celcom.day14;
import java.util.Scanner;
import java.sql.*;
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
    Account1(){
		
	}
	//method to deposit amount to the account
    public void depositAmount(double amount, String accountnum) throws Exception {
        Connection con = DBConnection.getConnection();
        String query = "SELECT balance FROM accountDetails WHERE accountNumber = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, accountnum);
        ResultSet rs = ps.executeQuery();
        if (!rs.next()) { 
            System.out.println("Account not found!");
            rs.close();
            ps.close();
            con.close();
            return;
        }
        double currentBalance = rs.getDouble("balance");
        System.out.println("Initial Amount: " + currentBalance);
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            String query1 = "UPDATE accountDetails SET balance = ? WHERE accountNumber = ?";
            PreparedStatement ps1 = con.prepareStatement(query1);
            double newBalance = currentBalance + amount;
            ps1.setDouble(1, newBalance);
            ps1.setString(2, accountnum);
            ps1.executeUpdate();

            System.out.println("New Amount: " + newBalance);
            ps1.close();
        }
        rs.close();
        ps.close();
        con.close();
    }

	//method to withdraw amount from an account
    public void withdrawAmount(double amount, String accountnum) throws Exception {
        Connection con = DBConnection.getConnection();
        String query = "SELECT balance FROM accountDetails WHERE accountNumber = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, accountnum);
        ResultSet rs = ps.executeQuery();
        if (!rs.next()) { 
            System.out.println("Account not found!");
            rs.close();
            ps.close();
            con.close();
            return;
        }
        double currentBalance = rs.getDouble("balance");
        System.out.println("Initial Amount: " + currentBalance);
        if (amount <= 0 || amount>currentBalance) {
            System.out.println("Invalid Amount");
        } else {
            String query1 = "UPDATE accountDetails SET balance = ? WHERE accountNumber = ?";
            PreparedStatement ps1 = con.prepareStatement(query1);
            double newBalance = currentBalance - amount;
            ps1.setDouble(1, newBalance);
            ps1.setString(2, accountnum);
            ps1.executeUpdate();

            System.out.println("New Amount: " + newBalance);
            ps1.close();
        }
        rs.close();
        ps.close();
        con.close();
    }
}
public class Bank {
	void addAccount(Account1 account) throws Exception {
		Connection con=DBConnection.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into accountDetails values(?,?,?)");
		pstmt.setString(1,account.getAccountNumber());
		pstmt.setString(2,account.getAccountHolder());
	    pstmt.setDouble(3,account.getBalance());
	    pstmt.executeUpdate();
	    con.close();
		System.out.println("Account Added successfully....");
	}
	//method to remove an account
	void removeAccount(String accountNum) throws Exception {
		Connection con=DBConnection.getConnection();
		String deleteQuery="delete from accountDetails where accountNumber=?";
		PreparedStatement p=con.prepareStatement(deleteQuery);
		p.setString(1,accountNum);
		int affected=p.executeUpdate();
		if(affected==1) {
			System.out.println("Account removed successfully");
		}
		else {
			System.out.println("Account doesnot exists");
		}
	}
	//method to find an account
	public boolean findAccount(String accountNumber1) throws Exception{
		Connection con=DBConnection.getConnection();
		String findQuery="Select accountNumber from accountDetails where accountNumber=?";
		PreparedStatement ps=con.prepareStatement(findQuery);
		ps.setString(1,accountNumber1);
		ResultSet rs=ps.executeQuery();
		return rs.next();
	}
	//method to display details 
	public void displayDetails() throws Exception {
		Connection con=DBConnection.getConnection();
		String displayQuery="Select * from accountDetails";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(displayQuery);
		while(rs.next()) {
			System.out.println("Account Number:"+rs.getString(1));
			System.out.println("Account Holder Name:"+rs.getString(2));
			System.out.println("Balance:"+rs.getDouble(3));
			System.out.println("---------------------");		
			}
		
	}
	public static void main(String[] args) throws Exception {
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
				boolean exists=bank.findAccount(accountNumber2);
				if(exists==false) {
					System.out.println("Account doesnot exist..");
				}
				else {
					System.out.println("Enter the amount to be deposited:");
					double depositAmount=sc.nextDouble();
					Account1 accounts=new Account1();
					accounts.depositAmount(depositAmount,accountNumber2);
				}
				break;
			case 4:
				System.out.println("Enter the account Number to Withdraw:");
				String accountNumber3=sc.next();
				boolean exists1=bank.findAccount(accountNumber3);
				if(exists1==false) {
					System.out.println("Account doesnot exist..");
				}
				else {
					System.out.println("Enter the amount to be withdrawed:");
					double depositAmount=sc.nextDouble();
					Account1 accounts1=new Account1();
					accounts1.withdrawAmount(depositAmount,accountNumber3);
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

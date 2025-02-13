package com.celcom.day7;

import java.util.Scanner;

class SavingAccount{
	private long balanceAmount;
	public void deposit(long amount) {
		this.balanceAmount=this.balanceAmount+amount;
	}
	public void withdraw(long amount) {
		this.balanceAmount=this.balanceAmount-amount;
	}
	public long getBalanceAmount() {
		return this.balanceAmount;
	}
}
class WithDrawer extends Thread{
	SavingAccount savingAccount;
	WithDrawer(SavingAccount savingAccount){
		this.savingAccount=savingAccount;
	}
	@Override
	public void run() {
		synchronized(savingAccount) {
			System.out.println("The WithDrawer is waiting for Depositer to deposit the amount.");
			try {
				savingAccount.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Enter the Amount to withdraw:");
			Scanner sc=new Scanner(System.in);
			long amount=sc.nextLong();
			savingAccount.withdraw(amount);
			System.out.println(amount+" withdrawed successfully..");
			System.out.println("Balance :"+ savingAccount.getBalanceAmount());
		}
	}
}
class Depositer extends Thread{
	SavingAccount savingAccount;
	Depositer(SavingAccount savingAccount){
		this.savingAccount=savingAccount;
	}
	@Override
	public void run() {
		synchronized(savingAccount) {
			System.out.println("Enter the amount to deposit:");
			Scanner sc=new Scanner(System.in);
			long amount=sc.nextLong();
			savingAccount.deposit(amount);
			System.out.println("Amount deposited successfully.");
			savingAccount.notify();
		}
	}
}
public class MultiThreadingExample7 {

	public static void main(String[] args) throws InterruptedException {
		SavingAccount obj=new SavingAccount();
		WithDrawer withdrawer=new WithDrawer(obj);
		withdrawer.start();
		Thread.sleep(2000);
		Depositer depositer=new Depositer(obj);
		depositer.start();
	}

}

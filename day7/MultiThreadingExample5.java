package com.celcom.day7;

class TwoTable extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("2 "+"x "+i+" = "+(2*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class FiveTable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.err.println("5 "+"x "+i+" = "+(5*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingExample5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TwoTable t1=new TwoTable();
		t1.start();
		t1.join();
		Thread t2=new Thread(new FiveTable());
		t2.start();
		

	}

}

package com.celcom.day15;

class Even implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i+=2) {
			synchronized(this) {
				if(i%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println(i);
			notify();
		}
	}
}
class Odd implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i+=2) {
			synchronized(this) {
				if(i%2!=0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println(i);
			notify();
			
		}
	}
}
public class PrintOddAndEven {

	public static void main(String[] args) {
		Even even=new Even();
		Odd odd=new Odd();
		Thread t1=new Thread(even);
		Thread t2=new Thread(odd);
		t1.start();
		t2.start();	
	}

}

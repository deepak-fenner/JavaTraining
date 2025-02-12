package com.celcom.day7;
class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" is Running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class MultiThreadingExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First thread
		Thread t1=new Thread(new MyThread2());
		t1.setName("Thread-1");
		t1.start();
		//Second Thread
		Thread t2=new Thread(new MyThread2());
		t2.setName("Thread-2");
		t2.start();
		//Third Thread
		Thread t3=new Thread(new MyThread2());
		t3.setName("Thread-3");
		t3.start();

	}

}

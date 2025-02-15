package com.celcom.day7;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" Thread is Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		System.out.println("State of Thread: "+t.getState());
		t.setName("T1");
		System.out.println("Name of Thread: "+t.getName());
		System.out.println("Priority of Thread: "+t.getPriority());
		t.start();
		System.out.println("State of Thread: "+t.getState());

	}

}

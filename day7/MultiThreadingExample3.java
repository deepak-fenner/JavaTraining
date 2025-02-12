package com.celcom.day7;
class MyThread1 implements Runnable{
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
public class MultiThreadingExample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t=new Thread(new MyThread1());
		System.out.println("State of Thread: "+t.getState());
		t.setName("T1");
		System.out.println("Name of Thread: "+t.getName());
		System.out.println("Priority of Thread: "+t.getPriority());
		t.start();
		System.out.println("State of Thread: "+t.getState());
		Thread.sleep(3000);
		System.out.println("MAIN END");
		synchronized(t) {
	    	t.wait(2000);
	    }
	    System.out.println(t.getState());
	    synchronized(t) {
	    	t.notify();
	    }
		System.out.println("last statement");
		

	}

}

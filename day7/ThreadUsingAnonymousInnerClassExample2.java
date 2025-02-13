package com.celcom.day7;

public class ThreadUsingAnonymousInnerClassExample2 {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("5 "+" x "+i+" = "+(5*i));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1=new Thread(runnable);
		t1.start();
		
		
		//Lambda Expression
		Runnable runnable1=()->{
			for(int i=1;i<=5;i++) {
				System.err.println("10 "+" x "+i+" = "+(10*i));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2=new Thread(runnable1);
		t2.start();


	}

}

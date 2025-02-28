package com.celcom.day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Order implements Runnable{
	@Override
	public void run() {
		System.out.println("Order is Processed by :"+Thread.currentThread().getName());
	}
}
public class ExecutorServiceEcommerce {

	public static void main(String[] args) {
		int orders=10;
		 ExecutorService executorService=Executors.newFixedThreadPool(5);
		 for(int i=0;i<=orders;i++) {
			 executorService.execute(new Order());
		 }
		 executorService.shutdown();
	} 

}

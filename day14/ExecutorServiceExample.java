package com.celcom.day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		executorService.execute(runnableThread("Task-1"));
		executorService.execute(runnableThread("Task-2"));
		executorService.execute(runnableThread("Task-3"));
		executorService.shutdown();
		
	}
	public static Runnable runnableThread(String msg) {
		return new Runnable(){
			public void run() {
				System.out.println(Thread.currentThread().getName()+" : "+msg);
			}
			
		};
		
	}

}

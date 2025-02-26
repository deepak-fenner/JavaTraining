package com.celcom.day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ExecutorExample1 {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(6);
		for(int i=0;i<10;i++) {
			executorService.execute(new Thread(new Task()));
		}
	}

}

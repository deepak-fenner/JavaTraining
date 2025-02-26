package com.celcom.day14;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample2 {

	public static void main(String[] args){
		ExecutorService executorService=Executors.newCachedThreadPool();
		for(int i=0;i<10;i++) {
//			executorService.execute(()->{
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName());
//			});
			
			executorService.submit(()->{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			});
		}
		executorService.shutdown();

	}

}

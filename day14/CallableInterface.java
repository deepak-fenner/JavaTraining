package com.celcom.day14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class taskToGetSum implements Callable<String>{
	@Override
	public String call(){
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		return Thread.currentThread().getName()+" "+sum;
	}
}
public class CallableInterface {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(4);
		for(int i=1;i<=10;i++) {
			Future<String> future=executorService.submit(new taskToGetSum());
			try {
				System.out.println("Task "+i+" "+future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		executorService.shutdown();
	}

}

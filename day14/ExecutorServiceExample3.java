package com.celcom.day14;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class taskToDisplayTime implements Runnable {
	@Override
	public void run() {
		System.out.println("Curent Time: " + LocalTime.now());
	}
}

public class ExecutorServiceExample3 {
	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

		executorService.scheduleAtFixedRate(new Thread(new taskToDisplayTime()), 0, 1500, TimeUnit.MILLISECONDS);
		executorService.schedule(() -> {
			executorService.shutdown();
			System.out.println("shutdown");
		}, 10, TimeUnit.SECONDS);
	}
}

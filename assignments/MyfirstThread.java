package com.semanticsquare.concurrency;

import java.util.concurrent.TimeUnit;

public class MyfirstThread {
	private static final String TimeUnits = null;

	public static void main(String[] args)  {
		Task task=new Task();
		Thread thread=new Thread(task);
		thread.start();
		try {
			//Thread.sleep(3000);
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside main...");
	}
}
class Task implements Runnable {

	@Override
	public void run() {
	     System.out.println("Inside run...");
		go();
	}
	public void go() {
	     System.out.println("Inside go...");
	     more();
	}
	public void more() {
	     System.out.println("Inside more...");
	}
}

	

package com.ocp.book.threads;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("MyRunnable name - " + Thread.currentThread().getName());
	}
}

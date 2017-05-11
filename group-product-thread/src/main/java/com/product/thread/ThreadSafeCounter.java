package com.product.thread;

public class ThreadSafeCounter extends Thread {
	
	private int count = 1;
	
	public void increment(){
		synchronized (this) {
			count++;
		}
	}
	
	public int get(){
		synchronized (this) {
			System.out.println(String.valueOf(count));
			return count;
		}
	}
	
	@Override
	public void run() {
		this.increment();
		this.get();
	}
	
	public static void main(String[] args) {
		ThreadSafeCounter threadSafeCounter = new ThreadSafeCounter();
		Thread thread = new Thread(threadSafeCounter);
		Thread thread1 = new Thread(threadSafeCounter);
		Thread thread2 = new Thread(threadSafeCounter);
		Thread thread3 = new Thread(threadSafeCounter);
		thread.run();
		thread1.run();
		thread2.run();
		thread3.run();
		
	}

}

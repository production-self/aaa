package com.product.thread;

public class ThreadCommon extends Thread {
	
	private int value= 1;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();
		value++;
		System.out.println("由线程" + this.currentThread().getName()+"调用"+value);
	}
	
	public static void main(String[] args) {
		ThreadCommon threadCommon = new ThreadCommon();
		Thread thread = new Thread(threadCommon,"A");
		Thread thread1 = new Thread(threadCommon,"B");
		Thread thread2= new Thread(threadCommon,"C");
		Thread thread3 = new Thread(threadCommon,"D");
		Thread thread4 = new Thread(threadCommon,"E");
		Thread thread5 = new Thread(threadCommon,"F");
		Thread thread6 = new Thread(threadCommon,"G");
		Thread thread7 = new Thread(threadCommon,"H");
		Thread thread8 = new Thread(threadCommon,"I");
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
	}

}

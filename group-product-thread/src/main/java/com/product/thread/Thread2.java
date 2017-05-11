package com.product.thread;

public class Thread2 extends Thread {
	
	private int count =5 ;

	public Thread2(String name) {
		super();
		this.setName(name);
	}
	
	public Thread2() {
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(count>0){
			count--;
			System.out.println(this.currentThread().getName()+count);
		}
	}
	
	public static void main(String[] args) {
		
		/**
		 * 不共享变量
		 */
//		Thread2 thread = new Thread2("A");
//		Thread2 thread1 = new Thread2("B");
//		Thread2 thread2 = new Thread2("C");
//		thread.start();
//		thread1.start();
//		thread2.start();
		/**
		 * 共享变量
		 */
		Thread2 thread2 = new Thread2();
		Thread thread3 = new Thread(thread2,"A");
		Thread thread4 = new Thread(thread2,"B");
		Thread thread5 = new Thread(thread2,"C");
		Thread thread6 = new Thread(thread2,"D");
		Thread thread7 = new Thread(thread2,"E");
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		
		
	}
	

}

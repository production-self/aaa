package com.product.thread;

public class JavaThreadAnywhere {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("the main method was executed by " +Thread.currentThread().getName());
		Helper helper = new Helper("java thread any where");
		Thread thread = new Thread(helper);
		System.out.println(thread.getState());
		thread.setName("andy");
		thread.start();
		thread.yield();
		System.out.println(thread.getState());
	}
	
	static class Helper implements Runnable{
		
		private final String message;

		public Helper(String message) {
			this.message = message;
		}
		
		private void doSomething(String message){
			System.out.println(" The doSomeThing method was executed by thread: " +Thread.currentThread().getName());
			System.out.println(" do something with " + message);
		}

		@Override
		public void run() {
			doSomething(message);
			
		}
		
	}

}

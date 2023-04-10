package com.vrx;

public class FunctionalInterface {
	
	/*
	 * 1) Runnable  It contains only run() method 
	 * 2) Comparable  It contains only compareTo() method
	 * 3) ActionListener  It contains only actionPerformed() 
	 * 4) Callable  It contains only call() method
	 */

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		Car car = () -> System.out.println("Car is running...");
		car.drive();

	}

}

interface Car {
	public void drive();
}
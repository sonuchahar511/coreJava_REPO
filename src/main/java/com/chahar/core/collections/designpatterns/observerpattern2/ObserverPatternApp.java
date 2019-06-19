package com.chahar.core.collections.designpatterns.observerpattern2;

public class ObserverPatternApp {

	public static void main(String[] args) {
		new Thread(new InputThread()).start();
		
		System.out.println("Main Thread: "+ Thread.currentThread().getName()+ " is terminated");
	}

}

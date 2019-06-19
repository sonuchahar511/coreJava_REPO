package com.chahar.core.collections.designpatterns.observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("HexaObserver: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}

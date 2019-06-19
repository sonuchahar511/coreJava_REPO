package com.chahar.core.collections.designpatterns.observerpattern2;

import java.util.Observable;
import java.util.Observer;

//Listener OR OBSERVER
public class EventSourceObserver implements Observer{
	
	@Override
	public void update(Observable eventSource, Object arg) {
		System.out.println("Called EventSourceObserver , eventSource: " + eventSource+" , object: " + arg);
	}

}

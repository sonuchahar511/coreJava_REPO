package com.chahar.core.collections.designpatterns.observerpattern2;

import java.util.Observable;
import java.util.Scanner;

//EventService
public class InputThread  implements Runnable{

	@SuppressWarnings("resource")
	@Override
	public void run() {
		
		while(true) {
			System.out.println("Enter text: ");
			
			String data = new Scanner(System.in).nextLine();
			
			System.out.println("Received text in Thread: "+ data+"\n===================\n\n\n ");
			
			Observable eventSource = new EventSourceObservable(data);
			eventSource.addObserver(new EventSourceObserver() );
			eventSource.addObserver(new EventSourceObserver() );
			//for one event , one/multiple listener
			//Multiple event , same one listener can serve multiple event source. 
			
			if(!"exit".equals(data)) {
				((EventSourceObservable)eventSource).setChanged();
				eventSource.notifyObservers();
			}else {
				break;
			}
		}
		
		System.out.println("InputThread: "+ Thread.currentThread().getName()+ " is terminated");
	}

}

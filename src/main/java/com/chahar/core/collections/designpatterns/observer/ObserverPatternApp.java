package com.chahar.core.collections.designpatterns.observer;

/*
 https://dzone.com/articles/design-patterns-uncovered
 you want to use this pattern to reduce coupling. If you have an object that 
 needs to share it's state with others, without knowing who those objects are, the Observer is exactly what you need.

 Observer many times if you've done any UI programming, especially in Swing. The whole concept of listeners is based on this pattern

 The event listener is the most popular, where you register an ActionListener to a UI control, such a button, and
 react to action events using the actionPerformed method

 In this case, the ActionListener is the Observer.The button is your Subject.
 As the button changes state, you can react, if you choose to, in your actionPerformed method

 it’s used to observe things. 
 Suppose you want to notify for change in a particular object than you observer that object and changes are notified to you.
 Object which is being observed is refereed as Subject and classes which observe subject are called Observer. 
 Read more: http://javarevisited.blogspot.com/2011/12/observer-design-pattern-java-example.html#ixzz4W0rNTHnm

 */

public class ObserverPatternApp {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		subject.setState(10);

		System.out.println("===========");

		subject.setState(20);
	}

}

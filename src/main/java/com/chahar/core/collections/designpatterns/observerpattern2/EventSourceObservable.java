package com.chahar.core.collections.designpatterns.observerpattern2;

import java.util.Observable;

//EventSource OR SUBJECT
public class EventSourceObservable extends Observable{
	private String source;
	
	public EventSourceObservable(final String source) {
		super();
		this.source=source;
	}
	public String getSource() {
		return source;
	}
	
	@Override
	public void setChanged() {
		super.setChanged();
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder("EventSourceObservable[");
		sb.append("source="+ source);
		sb.append(",super.toString="+ super.toString());
		sb.append("]");
		
		return sb.toString();
	}
}

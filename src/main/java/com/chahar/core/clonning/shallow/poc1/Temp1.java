package com.chahar.core.clonning.shallow.poc1;

public class Temp1 implements Cloneable
{
	public int g;
	
	Temp1(int g){
		this.g=g;
	}

	@Override
	protected Temp1 clone() {
		//Shallow Copy.
		try {
			return (Temp1) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}

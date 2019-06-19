package com.chahar.core.clonning.deep.poc1;

public class Temp implements Cloneable {
	private int z=51;

	@Override
	protected Temp clone() {
		Temp t1=null;
		
		try {
			t1=(Temp) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return t1;
	}
}

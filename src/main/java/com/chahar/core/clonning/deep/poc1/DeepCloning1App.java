package com.chahar.core.clonning.deep.poc1;

public class DeepCloning1App implements Cloneable {
//	private int x=11;
//	private int y=21;
	
	private Temp t=new Temp();
	
	protected DeepCloning1App clone() {
		DeepCloning1App z=null;
		
		try {
			z=(DeepCloning1App) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return z;
	}

	public static void main(String[] args) {
		DeepCloning1App d1=new DeepCloning1App();
		
		//Shallow Cloning.
		DeepCloning1App d2=d1.clone();
		
		//Deep Cloning.
		d2.t=d1.t.clone();		
	}
}

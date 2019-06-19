package com.chahar.core.clonning.shallow.poc1;

public class ShallowCloning1App implements Cloneable {
	
	private int x=11;
	
	private Temp1 t;
	
	ShallowCloning1App(int a){
		t=new Temp1(a);
	}
	
	protected ShallowCloning1App clone() {
		
		//Shallow Copy.
		try {
			return (ShallowCloning1App) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public static void main(String[] args) {
		ShallowCloning1App c=null;
		System.out.println("Create a clone of m object and save it into c reference variable\n");
		
		ShallowCloning1App m=new ShallowCloning1App(101);
		
		System.out.println("Original Object:\n"+"m.t.g: "+m.t.g);
		System.out.println("m.x: "+m.x);
		
		c=m.clone();
		
		System.out.println("Clone Object:\n"+"c.t.g : "+c.t.g);
		System.out.println("c.x: "+c.x+"\n");
		
		System.out.println("Setting c.t.g to 501 and c.x to 31");
		c.t.g=501;
		c.x=31;
		
		System.out.println("m after change: "+m.t.g);
		System.out.println("m after change: "+ m.x+"\n");
		
		if(m.t ==c.t)
			System.out.println("Shallow Cloning Done");
		
		System.out.println("Now we are going to perform Deep Cloning\n");
		
		c.t=m.t.clone();
		
		System.out.println("Setting c.t.g to 1001 and c.x to 331\n");
		c.t.g=1001;
		c.x=331;
		
		System.out.println("m after second change: "+m.t.g);
		System.out.println("m after second change: "+ m.x);
		
		
		System.out.println("c.t.g : "+c.t.g);
		System.out.println("c.x: "+c.x);
		
	}

}

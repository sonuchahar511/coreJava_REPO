package com.chahar.core.serialization;

public class Employee1 extends Object implements Cloneable{
	int rollno;  
	String name;  	
	
	transient int i; 
	volatile  int j;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Employee1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 e1 = new Employee1(100, "yash");
		Employee1 e2 = (Employee1) e1.clone();
		
		System.out.println(e1+":"+e1.name+","+e1.rollno);
		System.out.println(e2+":"+e2.name+","+e2.rollno);
	}
	
}

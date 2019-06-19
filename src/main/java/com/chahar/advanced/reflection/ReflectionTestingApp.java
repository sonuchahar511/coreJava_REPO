package com.chahar.advanced.reflection;

interface IOperation{
	int add(int a,int b);
	int subtract(int a,int b);
}



public class ReflectionTestingApp {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class object = Class.forName(IOperation.class.getName());
		Object ob = object.newInstance();
		IOperation operation = (IOperation) ob;
		
		int value = operation.add(10, 42);
		
		System.out.println(value);
	}

}

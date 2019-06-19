package com.chahar.core.java_8_feature.funtional_interface_lamda_expression.poc3;

import com.chahar.core.java_8_feature.funtional_interface_lamda_expression.poc1.MathOperation;

public class LamdaTesterApp {

	public static void main(String[] args) {
		LamdaTesterApp tester = new LamdaTesterApp();
		
		MathOperation addtion=(int a, int b)->a+b;
		MathOperation substraction =(a,b)->a-b;
		MathOperation multiplication =(int a,int b)->a*b;
		MathOperation division =(int a,int b)->a/b;
		
		System.out.println("10+5= "+tester.operate(10,5,addtion));
		System.out.println("10-5= "+tester.operate(10,5,substraction));
		System.out.println("10*5= "+tester.operate(10,5,multiplication));
		System.out.println("10/5= "+tester.operate(10,5,division));
		
		GreetingService greetService1=message-> System.out.println("Hello "+message);
		
		GreetingService greetService2= message-> {
			System.out.println("Hello "+message);
			System.out.println("Hay "+message);
		};
		
		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");

	}

	private int operate(int a, int b, MathOperation op) {
		return op.operation(a, b);
	}

}

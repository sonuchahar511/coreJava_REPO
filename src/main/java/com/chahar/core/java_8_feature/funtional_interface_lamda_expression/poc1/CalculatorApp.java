package com.chahar.core.java_8_feature.funtional_interface_lamda_expression.poc1;

import com.chahar.core.java_8_feature.funtional_interface_lamda_expression.poc3.IntegerMath;

//import java.lang.reflect.Method;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator myApp=new Calculator();
		
		IntegerMath addtion=(int a,int b) -> a+b;
		IntegerMath substraction=(a,b) -> a-b;
		
		/*Class<? extends IntegerMath> c= substraction.getClass();
		
		if(c.isInterface())
			System.out.println("It is a interface");
		else if(c.isPrimitive())
			System.out.println("It is a Primitive");
		else if(c.isArray())
			System.out.println("It is a array");
		else
			System.out.println("It is a Class");
		
		System.out.println(c.getName());
		
		Class in[]=c.getInterfaces();
		
		for(Class t:in)
			System.out.println(t.getName());
		
		try {
			Method m=c.getDeclaredMethod("operation",int.class,int.class);
			m.getName();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("40+2= "+myApp.operateBinary(40, 2, addtion));
		System.out.println("20-10= "+myApp.operateBinary(20, 10, substraction));
		
	}

}

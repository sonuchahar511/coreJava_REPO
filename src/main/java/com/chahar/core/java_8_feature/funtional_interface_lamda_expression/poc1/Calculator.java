package com.chahar.core.java_8_feature.funtional_interface_lamda_expression.poc1;

import com.chahar.core.java_8_feature.funtional_interface_lamda_expression.poc3.IntegerMath;

public class Calculator{
	
	public int operateBinary(int a,int b,IntegerMath op) {
		return op.operation(a,b);
	}

}

package com.chahar.core.primitivetypes;

import org.apache.commons.lang3.math.NumberUtils;

public class DoubleCheckApp {

	public static void main(String[] args) {
		Double d = 123.12;
		
		System.out.println(d.toString());

		System.out.println("--------------------");

		double d1 = 0;
		System.out.println(NumberUtils.DOUBLE_ZERO.equals(Double.valueOf(d1)));

		d1=0.0;
		System.out.println(NumberUtils.DOUBLE_ZERO.equals(Double.valueOf(d1)));

		d1=0.1;
		System.out.println(NumberUtils.DOUBLE_ZERO.equals(Double.valueOf(d1)));
	}

}

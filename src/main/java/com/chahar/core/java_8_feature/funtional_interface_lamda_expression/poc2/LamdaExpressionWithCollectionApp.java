package com.chahar.core.java_8_feature.funtional_interface_lamda_expression.poc2;

import java.util.Arrays;
import java.util.List;

public class LamdaExpressionWithCollectionApp {

	public static void main(String[] args) {
		String str[]= {"lalu","rabri","meesa","nitish"};
		
		List<String> family=Arrays.asList(str);
		
		for(String s:family)
			System.out.print(s+"; ");
		System.out.println();
		
		family.forEach((s)-> System.out.print(s+"; "));
		System.out.println();
		
		family.forEach(System.out::println);

	}

}

package com.chahar.core.collections;

import java.util.HashMap;
import java.util.Map;

public class GenericTypeMapApp {

	public static void main(String[] args) {
		Map<String,User> userMap = new HashMap<>();
		
		userMap.put("2", new Employee() );
		userMap.put("3", new Customer() );
	
		System.out.println(userMap);
	}
	
}	

interface User {}
class Employee implements User{}
class Customer implements User {}
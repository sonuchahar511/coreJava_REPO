package com.chahar.core.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTestingApp {

	public static void main(String[] args) {
		Object[] obj1= {new Object(), new Object()};
		Object[] obj2= {new Object(), new Object(),new Object()};
		
		/*Object[] obj1= {new Object()};
		Object[] obj2= {new Object()};*/
		
		List<Object[]> result = new ArrayList<Object[]>();
		result.add(obj1);
		result.add(obj2);
		
		for(Object obj: result){
			System.out.println(obj); //obj can Object/Object[]
		}
		
	}

}

package com.chahar.core.collections.datastructure.sets.comparables;

import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<Employee>();
		for (int i = 0; i <= 5; i++) {
			employees.add(new Employee(i * 10, "yash" + i * 10, "chahar" + i * 10));
		}

		employees.add(new Employee(11, "yash11", "chahar11"));

		//Note: will not add in Tree if Employee.compare() return 0.
		employees.add(new Employee(39, "yash000", "chahar000"));
		employees.add(new Employee(0, "yash#########0", "chahar#############0"));
		
		System.out.println(employees);
	}

}

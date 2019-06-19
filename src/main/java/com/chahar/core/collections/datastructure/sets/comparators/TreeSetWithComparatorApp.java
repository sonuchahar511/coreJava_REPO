package com.chahar.core.collections.datastructure.sets.comparators;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparatorApp {

	public static void main(String[] args) {
		Comparator<ContractEmployee> empComparator = new ContractEmployeeIdComparator();
		//Comparator<ContractEmployee> empComparator = new ContractEmployeeFirstNameComparator();
		
		TreeSet<ContractEmployee> employees = new TreeSet<ContractEmployee>(empComparator);
		for (int i = 0; i <= 5; i++) {
			employees.add(new ContractEmployee(i * 10, "yash" + i * 10, "chahar" + i * 10));
		}

		employees.add(new ContractEmployee(11, "yash11", "chahar11"));

		employees.add(new ContractEmployee(0, "yash000", "chahar000"));
		System.out.println(employees);
	}

}

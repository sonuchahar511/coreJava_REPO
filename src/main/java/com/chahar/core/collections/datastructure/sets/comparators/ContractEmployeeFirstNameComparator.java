package com.chahar.core.collections.datastructure.sets.comparators;

import java.util.Comparator;

public class ContractEmployeeFirstNameComparator implements Comparator<ContractEmployee> {

	public int compare(ContractEmployee o1, ContractEmployee o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}

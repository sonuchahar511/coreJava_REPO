package com.chahar.core.collections.datastructure.sets.comparators;

import java.util.Comparator;

public class ContractEmployeeIdComparator implements Comparator<ContractEmployee> {

	public int compare(ContractEmployee o1, ContractEmployee o2) {
		return o1.getId() - o2.getId();
	}

}

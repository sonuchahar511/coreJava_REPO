package com.chahar.core.collections.datastructure.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.chahar.core.collections.datastructure.sets.comparables.Employee;

public class TreeMapApp {

	public static void main(String[] args) {
		/* This is how to declare TreeMap */
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		/* Adding elements to TreeMap */
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");

		/* Display content using Iterator */
		Set<Map.Entry<Integer, String>> set = tmap.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> mentry = (Map.Entry<Integer, String>) iterator.next();
			System.out.println(mentry.getKey() + " --> " + mentry.getValue());
		}
		System.out.println(tmap);

		TreeMap<Employee, Integer> empMap = new TreeMap<Employee, Integer>();
		for (int i = 1; i <= 5; i++) {
			empMap.put(new Employee(i * 100, "yash" + i * 100, "chahar" + i * 100), i * 100);
		}
		// Note: will replace keyValue if given key exists in map
		empMap.put(new Employee(200, "yash" + 200, "chahar" + 200), 29);
		System.out.println(empMap);

	}

}

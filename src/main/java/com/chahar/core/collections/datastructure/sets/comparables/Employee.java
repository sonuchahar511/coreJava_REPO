package com.chahar.core.collections.datastructure.sets.comparables;

public class Employee implements Comparable<Employee> {
	private int id;
	private String firstName;
	private String lastName;

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		super();
	}

	public int compareTo(Employee e) {
		int diff = id - e.id;
		// diff <= 0 ==> increasing order
		// diff > 0 ==> decreasing order
		return diff;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Employee[");
		sb.append("id=" + id);
		sb.append(",firstName=" + firstName);
		sb.append(",lastName=" + lastName);
		sb.append("]");

		return sb.toString();
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

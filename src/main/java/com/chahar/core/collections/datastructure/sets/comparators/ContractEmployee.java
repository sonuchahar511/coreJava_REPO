package com.chahar.core.collections.datastructure.sets.comparators;

public class ContractEmployee {
	private int id;
	private String firstName;
	private String lastName;

	public ContractEmployee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("ContractEmployee[");
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

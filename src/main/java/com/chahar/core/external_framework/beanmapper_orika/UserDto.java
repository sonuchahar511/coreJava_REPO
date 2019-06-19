package com.chahar.core.external_framework.beanmapper_orika;

public class UserDto {
	private String firstName,lastName,email;
	private String firstName1,lastName1,email1;
	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", firstName1="
				+ firstName1 + ", lastName1=" + lastName1 + ", email1=" + email1 + "]";
	}
	public UserDto(String firstName, String lastName, String email, String firstName1, String lastName1,
			String email1) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.firstName1 = firstName1;
		this.lastName1 = lastName1;
		this.email1 = email1;
	}
	public UserDto() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName1() {
		return firstName1;
	}
	public void setFirstName1(String firstName1) {
		this.firstName1 = firstName1;
	}
	public String getLastName1() {
		return lastName1;
	}
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

}

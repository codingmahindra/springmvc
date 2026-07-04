package com.student;

public class PojoClass {

	private String FirstName;
	
	private String LastName;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "PojoClass [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
		
	
	
}

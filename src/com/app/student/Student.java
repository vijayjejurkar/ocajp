package com.app.student;

import javax.sql.rowset.FilteredRowSet;

public class Student {
	
	private String firstName;
	private String lastName;
	
	//default ctor...
	public Student() {
		super();
	}

	
	//param ctor..
	public Student(String firstName, String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object first) {
		Student firstStudent = (Student)first;
		Student secondStudent = (Student)this;
		if(firstStudent.equals(secondStudent))
			return true;
		else 
			return false;
	}
		
	
	
}

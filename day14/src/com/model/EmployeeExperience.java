package com.model;

public class EmployeeExperience extends Employee {

	private int expInYear;

	public EmployeeExperience() {
		super();
	}

	public EmployeeExperience(int expInYear) {
		super();
		this.expInYear = expInYear;
	}

	public EmployeeExperience(int id, String fullName, String dob, int paymentPerHour, int expInYear) {
		super(id, fullName, dob, paymentPerHour);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

}
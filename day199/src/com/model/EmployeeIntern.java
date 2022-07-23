package com.model;

public class EmployeeIntern extends Employee {
	private String majors;
	private int workingHours;
	public EmployeeIntern() {
		super();
	}
	public EmployeeIntern(String majors, int workingHours) {
		super();
		this.majors = majors;
		this.workingHours = workingHours;
	}
	public EmployeeIntern(int id, String fullName, String dob, int paymentPerHour, String majors, int workingHours) {
		super(id, fullName, dob, paymentPerHour);
		this.majors = majors;
		this.workingHours = workingHours;
	}
	public String getMajors() {
		return majors;
	}
	public void setMajors(String majors) {
		this.majors = majors;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
}

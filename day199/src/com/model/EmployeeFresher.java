package com.model;

public class EmployeeFresher extends Employee{
	private String graduationRank;

	public EmployeeFresher() {
		super();
	}

	public EmployeeFresher(String graduationRank) {
		super();
		this.graduationRank = graduationRank;
	}

	public EmployeeFresher(int id, String fullName, String dob, int paymentPerHour, String graduationRank) {
		super(id, fullName, dob, paymentPerHour);
		this.graduationRank = graduationRank;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	
	
}

package com.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String fullName;
	private String dob;
	private int paymentPerHour;

	public Employee() {
		super();
	}

	public Employee(int id, String fullName, String dob, int paymentPerHour) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.dob = dob;
		this.paymentPerHour = paymentPerHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

}
 
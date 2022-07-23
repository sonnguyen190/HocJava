package com.model;
public class Employee {
	private int ssn;
	private String name;
	private double salary;
	private int department;

	public Employee() {
		super();
	}

	public Employee(int ssn, String name, double salary, int department) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

}

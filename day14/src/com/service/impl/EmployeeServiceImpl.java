package com.service.impl;

import java.util.Scanner;

import com.model.Employee;

public abstract class EmployeeServiceImpl {

	public void inputInfo(Employee employee) {
		Scanner scanner = new Scanner(System.in);

		int id = inputId();
		employee.setId(id);

		String fullName = inputFullName();
		employee.setFullName(fullName);

		System.out.println("Input Day Of Birth: ");
		String dob = scanner.next();
		employee.setDob(dob);

		System.out.println("Input Payment Per Hour: ");
		int paymentPerHour = scanner.nextInt();
		employee.setPaymentPerHour(paymentPerHour);
	}

	public void displayInfo(Employee employee) {
		System.out.println("Id: " + employee.getId());
		System.out.println("Full Name: " + employee.getFullName());
		System.out.println("Day Of Birth: " + employee.getDob());
		System.out.println("Payment Per Hour: " + employee.getPaymentPerHour());
	}

	public abstract double calculateSalary(Employee employee);

	public int inputId() {
		boolean isValid = false;
		int id = 0;

		while (!isValid) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Input Id: ");
				id = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Id should be Integer.");
			}

			if (id >= 1 && id <= 10) {
				isValid = true;
			} else {
				System.out.println("Id should be from 1 to 10.");
			}
		}

		return id;
	}

	public String inputFullName() {
		String fullName = "";
		boolean isValid = false;

		while (!isValid) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Input Full Name: ");
				fullName = scanner.next();
			} catch (Exception e) {
				System.out.println("Full Name should be String.");
			}

			if (fullName.length() >= 1 && fullName.length() <= 20) {
				isValid = true;
			} else {
				System.out.println("Full Name should be from 1 to 20 characters.");
			}
		}

		return fullName;
	}

}
package com.service.impl;

import java.util.Scanner;

import com.model.Employee;
import com.model.EmployeeIntern;
import com.servicee.EmployeeInternService;

public class EmployeeInternServiceImpl extends EmployeeServiceImpl implements EmployeeInternService{

	@Override
	public double calculateSalary(Employee employee) {
		int result= 8*employee.getPaymentPerHour();
		return result;
	}
	public void inputInfoIntern(EmployeeIntern employee) {
		super.inputInfor(employee);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("moi nhap majors: ");
		String major = scanner.next();
		employee.setMajors(major);
		
		System.out.println("moi nhap workingHours: ");
		int workingHour  = scanner.nextInt();
		employee.setWorkingHours(workingHour);
	}
	public void displayInfoIntern(EmployeeIntern employee) {
		super.displayInfo(employee);
		System.out.println("Major: " + employee.getMajors());
		System.out.println("gio lam viec: " + employee.getWorkingHours());
	}
	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeIntern findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeIntern[] add(int indexAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeIntern[] remove(int indexRemove) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeIntern[] update(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeIntern[] sort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeIntern displayEmployeeMaxWorkingHours() {
		// TODO Auto-generated method stub
		return null;
	}

}

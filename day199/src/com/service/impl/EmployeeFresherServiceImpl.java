package com.service.impl;

import java.util.Scanner;

import com.model.Employee;
import com.model.EmployeeFresher;
import com.servicee.EmployeeFresherService;

public class EmployeeFresherServiceImpl extends EmployeeServiceImpl implements EmployeeFresherService{

	@Override
	public double calculateSalary(Employee employee) {
		int result = 8 * employee.getPaymentPerHour() * 2;
		return result;
	}
	
	public void inputInfoFresher(EmployeeFresher employee) {
		super.inputInfor(employee);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Graduation rank: ");
		String rank = scanner.next();
		employee.setGraduationRank(rank);
	 }
	
	public void displayInfoFresher(EmployeeFresher employee) {
		super.displayInfo(employee);
		System.out.println("Graduation rank:"+employee.getGraduationRank());
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeFresher findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeFresher[] add(int indexAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeFresher[] remove(int indexRemove) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeFresher[] update(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeFresher[] sort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeFresher displayEmployeeMinSalary() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.service;

import com.model.Employee;

public class EmployeeServiceImpl<T extends Employee> implements EmployeeService<T> {

	@Override
	public void displayAll(T[] arr) {
		for (int i =0; i<arr.length;i++) {
			System.out.println(arr[i].toString());
		}
		
	}

}

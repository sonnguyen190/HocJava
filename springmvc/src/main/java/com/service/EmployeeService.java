package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee findEmployeeBySSN(int ssn);

	public Employee addNewEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee deleteEmployee(int ssn);

}
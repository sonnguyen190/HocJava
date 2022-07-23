package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee findEmployeeBySSN(int ssn);

	public boolean addNewEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployee(int ssn);

}
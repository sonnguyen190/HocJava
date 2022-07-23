
package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	public Employee findEmployeeBySSN(int ssn) {
		return employeeDAO.findEmployeeBySSN(ssn);
	}

	public boolean addNewEmployee(Employee employee) {
		return employeeDAO.addNewEmployee(employee);
	}

	public boolean updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	public boolean deleteEmployee(int ssn) {
		return employeeDAO.deleteEmployee(ssn);
	}

}

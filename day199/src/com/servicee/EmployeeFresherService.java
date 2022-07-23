package com.servicee;

import com.model.EmployeeFresher;

public interface EmployeeFresherService {
	void displayAll();
	
	EmployeeFresher findById(int id);
	
	EmployeeFresher[] add(int indexAdd);
	
	EmployeeFresher[] remove(int indexRemove);
	
	EmployeeFresher[] update(int id);
	
	EmployeeFresher[] sort();
	
	EmployeeFresher displayEmployeeMinSalary();
}

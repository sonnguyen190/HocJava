package com.servicee;

import com.model.EmployeeIntern;

public interface EmployeeInternService {
	void displayAll();
	
	EmployeeIntern findById(int id);
	
	EmployeeIntern[] add(int indexAdd);
	
	EmployeeIntern[] remove(int indexRemove);
	
	EmployeeIntern[] update(int id);
	
	EmployeeIntern[] sort();
	
	EmployeeIntern displayEmployeeMaxWorkingHours();
}

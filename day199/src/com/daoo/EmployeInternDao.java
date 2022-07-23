package com.daoo;

import com.model.EmployeeIntern;

public interface EmployeInternDao {
	EmployeeIntern[] findAll();
	
	void save(EmployeeIntern[] employees);
}

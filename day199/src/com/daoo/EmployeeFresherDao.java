package com.daoo;

import com.model.EmployeeFresher;

public interface EmployeeFresherDao {
	EmployeeFresher[] findAll();
	
	void save(EmployeeFresher[] employees);
}

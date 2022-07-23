package com.daoo;

import com.model.EmployeeExperience;

public interface EmployeeExperienceDao {
	EmployeeExperience[] findAll();
	
	void save(EmployeeExperience[] employees);
}

package com.servicee;

import com.model.EmployeeExperience;

public interface EmployeeExperienceService {
	
	void displayAll();
	
	EmployeeExperience findById(int id);

	EmployeeExperience[] add(int indexAdd);

	EmployeeExperience[] remove(int indexRemove);

	EmployeeExperience[] update(int id);

	EmployeeExperience[] sort();

	EmployeeExperience findEmployeeMaxSalary();

	EmployeeExperience findEmployeeMaxExpInYear();
	
}

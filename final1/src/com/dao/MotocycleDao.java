package com.dao;

import com.model.Motorcycle;

public interface MotocycleDao {
	Motorcycle[] findAll();
	
	void save(Motorcycle[] motocycle);
}

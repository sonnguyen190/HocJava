package com.dao;

import com.model.Car;

public interface CarDao {
	Car[] findAll();
	
	void save(Car[] car);
}

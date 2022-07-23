package com.dao;

import java.util.List;

import com.model.Vehicle;

public interface VehicleDao<T extends Vehicle> {

	List<T> findAll(String path);

	void save(List<T> list, String path);

}

package com.service;

import java.util.List;

import com.model.Vehicle;

public interface VehicleService<T extends Vehicle> {

	void displayAll(List<T> list);

	T findByVehicleNumber(List<T> list, int vehicleNumber);

	List<T> add(List<T> list, T t, int index);

	List<T> remove(List<T> list, int index);

	List<T> removeAll(List<T> list);

	List<T> update(List<T> list, int id);

	List<T> sort(List<T> list);

}

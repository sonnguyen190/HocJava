package com.model;

import java.io.Serializable;
import java.util.List;

public class Owner implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private List<Car> cars;
	private List<Motorcycle> motorcycles;
	private List<Truck> trucks;

	public Owner() {
		super();
	}

	public Owner(int id, String name, String email, List<Car> cars, List<Motorcycle> motorcycles, List<Truck> trucks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cars = cars;
		this.motorcycles = motorcycles;
		this.trucks = trucks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Motorcycle> getMotorcycles() {
		return motorcycles;
	}

	public void setMotorcycles(List<Motorcycle> motorcycles) {
		this.motorcycles = motorcycles;
	}

	public List<Truck> getTrucks() {
		return trucks;
	}

	public void setTrucks(List<Truck> trucks) {
		this.trucks = trucks;
	}

}

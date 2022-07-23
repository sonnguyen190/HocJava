package com.model;

import com.constant.Producer;

public class Motorcycle extends Vehicle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int wattage;

	public Motorcycle() {
		super();
	}

	public Motorcycle(int wattage) {
		super();
		this.wattage = wattage;
	}

	public Motorcycle(int vehicleNumber, Producer producer, int year, String color, Owner owner, int wattage) {
		super(vehicleNumber, producer, year, color, owner);
		this.wattage = wattage;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}

}

package com.model;

import com.constant.Producer;

public class Truck extends Vehicle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tonnage;

	public Truck() {
		super();
	}

	public Truck(int tonnage) {
		super();
		this.tonnage = tonnage;
	}

	public Truck(int vehicleNumber, Producer producer, int year, String color, Owner owner, int tonnage) {
		super(vehicleNumber, producer, year, color, owner);
		this.tonnage = tonnage;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

}

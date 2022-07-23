package com.model;

import com.constant.Producer;

public class Car extends Vehicle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int seat;
	private String engine;

	public Car() {
		super();
	}

	public Car(int seat, String engine) {
		super();
		this.seat = seat;
		this.engine = engine;
	}

	public Car(int vehicleNumber, Producer producer, int year, String color, Owner owner, int seat, String engine) {
		super(vehicleNumber, producer, year, color, owner);
		this.seat = seat;
		this.engine = engine;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}

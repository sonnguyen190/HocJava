package com.model;

import java.io.Serializable;

import com.constant.Producer;

public class Vehicle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vehicleNumber;
	private Producer producer;
	private int year;
	private String color;
	private Owner owner;

	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleNumber, Producer producer, int year, String color, Owner owner) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.producer = producer;
		this.year = year;
		this.color = color;
		this.owner = owner;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}

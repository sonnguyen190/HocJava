package com.model;

import com.enumm.Producer;

public class xeMay extends Vehicle{
	private int wattage;

	public xeMay() {
		super();
	}
	
	public xeMay(int wattage) {
		super();
		this.wattage = wattage;
	}
	
	public xeMay(String soXe, String year, Producer producer, String color, int wattage) {
		super(soXe, year, producer, color);
		this.wattage = wattage;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	
}

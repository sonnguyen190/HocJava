package com.model;

import java.util.Scanner;

import com.enumm.Producer;
import com.service.impl.xeHoiImpl;

public class xeHoi extends Vehicle{
	
	xeHoiImpl xeHoiimpl = new xeHoiImpl();
	private int seat;
	private String engine;
	
	public xeHoi() {
		super();
	}
	public void inputInforCar() {
		
	}
	public xeHoi(int seat, String engine) {
		super();
		this.seat = seat;
		this.engine = engine;
	}
	
	public xeHoi(String soXe, String year, Producer producer, String color, int seat, String engine) {
		super(soXe, year, producer, color);
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

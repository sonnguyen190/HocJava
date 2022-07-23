package com.model;

import java.util.Scanner;

import com.enumm.Producer;

public class Vehicle {
private String soXe;
private String year;
private Producer producer;
private String color;

public Vehicle() {
	super();
}
public Vehicle(String soXe, String year, Producer producer, String color) {
	super();
	this.soXe = soXe;
	this.year = year;
	this.producer = producer;
	this.color = color;
}
public void inputInforXe(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("moi nhap so xe: ");
	String soxe = scanner.next();
	setSoXe(soxe);
	
	System.out.println("moi nhap year: ");
	String year = scanner.next();
	setSoXe(year);
	inputProducer();
	
	System.out.println("moi nhap mau: ");
	String color = scanner.next();
	setSoXe(color);
}

public void displayInforXe() {
	System.out.println("so Xe:" + getSoXe());
	System.out.println("year:" + getYear());
	System.out.println("producer:" + getProducer());
	System.out.println("color:" + getColor());
}

public String getSoXe() {
	return soXe;
}
public void setSoXe(String soXe) {
	this.soXe = soXe;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public Producer getProducer() {
	return producer;
}
public void setProducer(Producer producer) {
	this.producer = producer;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

public Producer inputProducer() {
	Producer producer = null;
	Scanner scanner = new Scanner(System.in);
	System.out.println("input your choose Producer: ");
	int choose = scanner.nextInt();
	switch (choose) {
	case 1: 
		producer=producer.HONDA;
		break;
	case 2: 
		producer=producer.YAMAHA;
		break;
	case 3: 
		producer=producer.TOYOTA;
		break;
	case 4: 
		producer=producer.SUZUKI;
		break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + choose);
	}
	return producer;
}

}

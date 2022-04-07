package com.model;

import java.util.Scanner;

public class Person {
public String name;
public String dob;
public String address;

public Person() {
	
}
public Person(String name,String dob,String address) {
	this.name=name;
	 this.dob=dob;
	 this.address=address;
}

public void inputInfo() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("moi nhap name: ");
	String name = scanner.next();
	System.out.println("moi nhap ngay/thang/nam sinh: ");
	String dob = scanner.next();
	System.out.println("moi nhap address: ");
	String address = scanner.next();
	setName(name);
	setDob(dob);
	setAddress(address);
}

public String displayInfo() {
	String thongtin = "ten:" +getName() +"||ngay sinh:"+getDob()+"||address:"+getAddress();
	return  thongtin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}

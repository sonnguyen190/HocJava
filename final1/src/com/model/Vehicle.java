package com.model;

import java.io.Serializable;

public class Vehicle implements Serializable {
private String soXe;
private Producer nhaSanXuat;
private String namSanXuat;
private String mauXe;
public Vehicle () {
	super();
}
public Vehicle(String soXe, Producer nhaSanXuat, String namSanXuat, String mauXe) {
	super();
	this.soXe = soXe;
	this.nhaSanXuat = nhaSanXuat;
	this.namSanXuat = namSanXuat;
	this.mauXe = mauXe;
}

public String getSoXe() {
	return soXe;
}
public void setSoXe(String soXe) {
	this.soXe = soXe;
}
public Producer getNhaSanXuat() {
	return nhaSanXuat;
}
public void setNhaSanXuat(Producer nhaSanXuat) {
	this.nhaSanXuat = nhaSanXuat;
}
public String getNamSanXuat() {
	return namSanXuat;
}
public void setNamSanXuat(String namSanXuat) {
	this.namSanXuat = namSanXuat;
}
public String getMauXe() {
	return mauXe;
}
public void setMauXe(String mauXe) {
	this.mauXe = mauXe;
}


}

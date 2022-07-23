package com.model;

public class Car  extends Vehicle {
 private int choNgoi;
 private String kieuDongCo;
public Car() {
	super();
}
public Car(int choNgoi, String kieuDongCo) {
	super();
	this.choNgoi = choNgoi;
	this.kieuDongCo = kieuDongCo;
}
public Car(String soXe, Producer nhaSanXuat, String namSanXuat, String mauXe, int choNgoi, String kieuDongCo) {
	super(soXe, nhaSanXuat, namSanXuat, mauXe);
	this.choNgoi = choNgoi;
	this.kieuDongCo = kieuDongCo;
}
public int getChoNgoi() {
	return choNgoi;
}
public void setChoNgoi(int choNgoi) {
	this.choNgoi = choNgoi;
}
public String getKieuDongCo() {
	return kieuDongCo;
}
public void setKieuDongCo(String kieuDongCo) {
	this.kieuDongCo = kieuDongCo;
}
 
 
}

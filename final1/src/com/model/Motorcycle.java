package com.model;

public class Motorcycle extends Vehicle {
private int congSuat;

public Motorcycle() {
	super();
}

public Motorcycle(int congSuat) {
	super();
	this.congSuat = congSuat;
}

public Motorcycle(String soXe, Producer nhaSanXuat, String namSanXuat, String mauXe, int congSuat) {
	super(soXe, nhaSanXuat, namSanXuat, mauXe);
	this.congSuat = congSuat;
}

public int getCongSuat() {
	return congSuat;
}

public void setCongSuat(int congSuat) {
	this.congSuat = congSuat;
}

}

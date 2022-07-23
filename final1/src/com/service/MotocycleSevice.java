package com.service;

import com.model.Car;
import com.model.Motorcycle;

public interface MotocycleSevice {
	 void displayAll();
		
	 Motorcycle findMotocycleTheoSoXe(String soXe);
	
	 Motorcycle[] add(int indexAdd);
	
	 Motorcycle[] remove(String soxe);

	 Motorcycle[] findmotoTheoSoXeVaNhapLai(String soxe);
	 
	 Motorcycle[] sortTheoCongSuat();
}

package com.service;

import com.model.Car;

public interface CarService {
	 void displayAll();
	
	 Car findCarTheoSoXe(String soXe);
	
	 Car[] add(int indexAdd);
	
	 Car[] remove(String soxe);
	
	 Car[] findCarTheoSoXeVaNhapLai(String soxe);
	
	 Car[] sortTheoChoNgoi();
	
	
	
}

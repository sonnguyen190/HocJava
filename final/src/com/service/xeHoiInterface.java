package com.service;

import com.model.Vehicle;
import com.model.xeHoi;

public interface xeHoiInterface {
	public void displayAll(xeHoi[] Arr);
	
	public void displayXehoi(xeHoi xehoi);
	
	public void findXehoi();
	
	public xeHoi[] addXeHoi(int index);
	
	public void removeXeHoi();
	
	public void findxeHoiVaNhapLai();
	
	public void sort();
}	

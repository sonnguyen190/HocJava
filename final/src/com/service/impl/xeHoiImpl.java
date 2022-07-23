package com.service.impl;

import java.util.Scanner;
import com.model.Vehicle;
import com.model.xeHoi;
import com.service.xeHoiInterface;

public class xeHoiImpl extends Vehicle implements xeHoiInterface{

	public xeHoi[] arrXehoi;
	
	@Override
	public void displayXehoi(xeHoi xehoi) {
		super.displayInforXe();
		System.out.println("cho ngoi:" + xehoi.getSeat());
		System.out.println("kieu dong co:" + xehoi.getEngine());
		
	}
	@Override
	public void findXehoi() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public xeHoi[] addXeHoi(int index) {
		xeHoi xehoi = new xeHoi();
		inputInforXe(xehoi);
		xeHoi[] newArr = arrXehoi == null ? new xeHoi[1]
				: new xeHoi[arrXehoi.length + 1];
		for (int i = 0; i < index; i++) {
			newArr[i] = arrXehoi[i];
		}
		newArr[index] = xehoi;
		for (int i = index + 1; i < newArr.length; i++) {
			newArr[i] = arrXehoi[i - 1];
		}
	
		return arrXehoi;
	}
	@Override
	public void removeXeHoi() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findxeHoiVaNhapLai() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displayAll(xeHoi[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i].toString();
		}
		
	}
	public void displayMenuXeHoi() {
		 
		boolean isExit = true;
		while (isExit) {
			System.out.println(".1:display all cars. /n .2:find car by so xe. /n .3:add 1 car. /n .4:remove 1 car. /n .5:find car theo so xe. /n .6:sort car theo cho ngoi tang dan. /n .7:EXIT");
			Scanner scanner = new Scanner(System.in);
			int nhap = scanner.nextInt();
			switch (nhap) {
			case 1: 
				displayAll(arrXehoi);
				break;
			case 2: 
				displayAll(null);
				break;
			case 3: 
				System.out.println("moi nhap so");
				int indexAdd = scanner.nextInt();
				xeHoi[] newArr = addXeHoi(indexAdd);
				arrXehoi = newArr;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + nhap);
			}
		}
	}

}












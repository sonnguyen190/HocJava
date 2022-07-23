package com.service.impl;

import java.io.Serializable;
import java.util.Scanner;

import com.model.Car;
import com.model.Producer;
import com.model.Vehicle;

public abstract class VehicleServiceImpl implements Serializable{
	Scanner scanner = new Scanner(System.in);
	public void inputInfo(Vehicle vehicle) {
		
			inputSoXe(vehicle);
			
			Producer producer=inputProducer();
			vehicle.setNhaSanXuat(producer);
			
			namScanXuat(vehicle);
			
			inputColor(vehicle);	
	}
	
	public void displayInfo(Vehicle vehicle) {
		System.out.println("so xe:"+vehicle.getSoXe());
		System.out.println("nha san xuat:"+vehicle.getNhaSanXuat());
		System.out.println("nam san xuat:"+vehicle.getNamSanXuat());
		System.out.println("mau xe:"+vehicle.getMauXe());
	}
	
	public void inputSoXe(Vehicle vehicle) {
		
		boolean isExit=true;
		while (isExit) {
			System.out.println("moi nhap so xe: ");
			String soXe = scanner.next();
			boolean a=soXe.matches("V[0-9]{4}");
			if(a) {
				vehicle.setSoXe(soXe);
				isExit=false;
			}
			else {
				isExit=true;
				System.out.println("khong dung cu phap moi nhap lai!!");
				
			}	
		}
	
	}
public void inputColor(Vehicle vehicle) {
		
		boolean isExit=true;
		while (isExit) {
			System.out.println("moi nhap mau xe:");
			String color = scanner.next();
			
			boolean a=color.matches("[A-Z]{3,5}");
			if(a) {
				vehicle.setMauXe(color);
				isExit=false;
			}
			else {
				isExit=true;
				System.out.println("khong dung cu phap moi nhap lai!!");
				
			}	
		}
	
	}
	
	public void namScanXuat(Vehicle vehicle) {
		boolean isExit=true;
		while (isExit) {
			System.out.println("moi nhap nam san xuat:");
			String year = scanner.next();
			
			boolean a=year.matches("[0-9]{1,2}[/-][0-9]{1,2}[/-][0-9]{4}");
			if(a) {
				vehicle.setNamSanXuat(year);
				isExit=false;
			}
			else {
				isExit=true;
				System.out.println("khong dung cu phap moi nhap lai!!");
				
			}	
		}
	}
	
	public Producer inputProducer() {
	  Producer result ;
		System.out.println("1.HONDA \n 2.YAMAHA \n 3.TOYOTA \n 4.SUZUKI");
		int number = scanner.nextInt();
		switch (number) {
		case 1: 
			result=(Producer.HONDA);
			break;
		case 2: 
			result=(Producer.YAMAHA);
			break;
		case 3: 
			result=(Producer.TOYOTA);
			break;
		case 4: 
			result=(Producer.SUZUKI);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
		return result;
	}

	
}

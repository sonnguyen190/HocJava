package com.main;

import java.util.Scanner;

import com.service.impl.CarServiceImpl;
import com.service.impl.MotocycleServiceImpl;



public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarServiceImpl carserviceImpl = new CarServiceImpl();
		MotocycleServiceImpl moto = new MotocycleServiceImpl();
		boolean isExit = true;
		while (isExit) {
			System.out.println("1.Xe Hoi \n 2.Xe May \n 3.Exit");
			int value = scanner.nextInt();
			switch (value) {
			case 1: 
				carserviceImpl.displayMenuCar();
				break;
			case 2: 
				moto.displayMenuMotocycle();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + value);
			}
			
		}
		

	}

}

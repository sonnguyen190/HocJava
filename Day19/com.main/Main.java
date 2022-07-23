package com.main;

import java.util.Scanner;

import com.service.impl.CarServiceImpl;
import com.service.impl.MotorcycleServiceImpl;
import com.service.impl.OwnerServiceImpl;
import com.service.impl.TruckServiceImpl;

public class Main {

	public static OwnerServiceImpl ownerServiceImpl = new OwnerServiceImpl();
	public static CarServiceImpl carServiceImpl = new CarServiceImpl();
	public static MotorcycleServiceImpl motorcycleServiceImpl = new MotorcycleServiceImpl();
	public static TruckServiceImpl truckServiceImpl = new TruckServiceImpl();
	
	public static void main(String[] args) {
		boolean isExit = true;
		while (isExit) {
			System.out.println("-----VEHICLE MANAGEMENT SYSTEM-----");
			System.out.println("1. Car\n" + "2. Motorcycle\n" + "3. Truck\n" + "4. Owner\n" + "5. Exit");

			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				carServiceImpl.displayMenu();
				break;

			case 2:
				motorcycleServiceImpl.displayMenu();
				break;

			case 3:
				truckServiceImpl.displayMenu();
				break;

			case 4:
				ownerServiceImpl.displayMenu();
				break;

			case 5:
				isExit = false;
				break;

			default:
				System.out.println("Your choose is invalid.");
				break;
			}
		}
	}

}

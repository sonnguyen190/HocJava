package com.service.impl;

import static com.service.impl.OwnerServiceImpl.PATH_OWNER;
import static com.service.impl.OwnerServiceImpl.listOwners;
import static com.service.impl.OwnerServiceImpl.ownerDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.CarDaoImpl;
import com.model.Car;
import com.service.CarService;

public class CarServiceImpl extends VehicleServiceImpl<Car> implements CarService {

	public static CarDaoImpl carDaoImpl = new CarDaoImpl();
	public static final String PATH_CAR = "data/cars.txt";
	public static List<Car> listCars = carDaoImpl.findAll(PATH_CAR);

	public CarServiceImpl() {
		super();
	}

	@Override
	public void displayAll(List<Car> list) {
		for (int i = 0; i < list.size(); i++) {
			displayInfo(list.get(i));
		}
	}

	@Override
	public void inputInfo(Car car) {
		super.inputInfo(car);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Seat: ");
		int seat = scanner.nextInt();
		car.setSeat(seat);

		System.out.println("Input Engine: ");
		String engine = scanner.next();
		car.setEngine(engine);

		addToOwner(car);
	}

	public void addToOwner(Car car) {
		for (int i = 0; i < listOwners.size(); i++) {
			if (car.getOwner().getId() == listOwners.get(i).getId()) {
				List<Car> list = listOwners.get(i).getCars() == null ? new ArrayList<Car>()
						: listOwners.get(i).getCars();
				list.add(car);
				listOwners.get(i).setCars(list);
				ownerDaoImpl.save(listOwners, PATH_OWNER);
			}
		}
	}

	public void removeFromOwner(Car car) {
		for (int i = 0; i < listOwners.size(); i++) {
			if (car.getOwner().getId() == listOwners.get(i).getId()) {
				List<Car> list = listOwners.get(i).getCars();
				for (int j = 0; j < list.size(); j++) {
					if (car.getVehicleNumber() == list.get(j).getVehicleNumber()) {
						list.remove(j);
						break;
					}
				}

				listOwners.get(i).setCars(list);
				ownerDaoImpl.save(listOwners, PATH_OWNER);
			}
		}
	}

	@Override
	public void displayInfo(Car car) {
		super.displayInfo(car);

		System.out.println("Seat: " + car.getSeat());
		System.out.println("Engine: " + car.getEngine());
	}

	public void displayMenu() {
		int index = 0;
		int vehicleNumber = 0;

		boolean isExit = true;
		while (isExit) {
			System.out.println("-----CAR MANAGEMENT SYSTEM-----");
			System.out.println("1. Display All cars\n" + "2. Find Car By Id\n" + "3. Add New Car\n" + "4. Remove Car\n"
					+ "5. Update Car\n" + "6. Sort Car\n" + "7. Exit");

			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				displayAll(listCars);
				break;

			case 2:
				System.out.println("Please enter your vehicle number to find: ");
				vehicleNumber = scanner.nextInt();
				Car car = findByVehicleNumber(listCars, vehicleNumber);
				if (car != null) {
					displayInfo(car);
				} else {
					System.out.println("Not found.");
				}
				break;

			case 3:
				System.out.println("Please enter your index to add: ");
				index = scanner.nextInt();
				Car newCar = new Car();
				inputInfo(newCar);
				List<Car> newList = add(listCars, newCar, index);
				listCars = newList;
				carDaoImpl.save(newList, PATH_CAR);
				break;

			case 4:
				System.out.println("Please enter your index to remove: ");
				index = scanner.nextInt();
				removeFromOwner(listCars.get(index));
				List<Car> removedList = remove(listCars, index);
				listCars = removedList;
				carDaoImpl.save(removedList, PATH_CAR);
				break;

			case 5:
				System.out.println("Please enter your vehicle number to update: ");
				vehicleNumber = scanner.nextInt();
				listCars = update(listCars, vehicleNumber);
				carDaoImpl.save(listCars, PATH_CAR);
				break;

			case 6:
				listCars = sort(listCars);
				carDaoImpl.save(listCars, PATH_CAR);
				displayAll(listCars);
				break;

			case 7:
				isExit = false;
				break;

			default:
				System.out.println("Your choose is invalid.");
				break;
			}
		}
	}

}

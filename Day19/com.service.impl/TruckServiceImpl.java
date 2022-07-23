package com.service.impl;

import static com.service.impl.OwnerServiceImpl.PATH_OWNER;
import static com.service.impl.OwnerServiceImpl.listOwners;
import static com.service.impl.OwnerServiceImpl.ownerDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.TruckDaoImpl;
import com.model.Truck;
import com.service.TruckService;

public class TruckServiceImpl extends VehicleServiceImpl<Truck> implements TruckService {

	public static TruckDaoImpl truckDaoImpl = new TruckDaoImpl();
	public static final String PATH_TRUCK = "data/trucks.txt";
	public static List<Truck> listTrucks = truckDaoImpl.findAll(PATH_TRUCK);

	public TruckServiceImpl() {
		super();
	}

	@Override
	public void displayAll(List<Truck> list) {
		for (int i = 0; i < list.size(); i++) {
			displayInfo(list.get(i));
		}
	}

	@Override
	public void inputInfo(Truck truck) {
		super.inputInfo(truck);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Tonnage: ");
		int tonnage = scanner.nextInt();
		truck.setTonnage(tonnage);

		addToOwner(truck);
	}

	public void addToOwner(Truck truck) {
		for (int i = 0; i < listOwners.size(); i++) {
			if (truck.getOwner().getId() == listOwners.get(i).getId()) {
				List<Truck> list = listOwners.get(i).getTrucks() == null ? new ArrayList<Truck>()
						: listOwners.get(i).getTrucks();
				list.add(truck);
				listOwners.get(i).setTrucks(list);
				ownerDaoImpl.save(listOwners, PATH_OWNER);
			}
		}
	}

	public void removeFromOwner(Truck truck) {
		for (int i = 0; i < listOwners.size(); i++) {
			if (truck.getOwner().getId() == listOwners.get(i).getId()) {
				List<Truck> list = listOwners.get(i).getTrucks();
				for (int j = 0; j < list.size(); j++) {
					if (truck.getVehicleNumber() == list.get(j).getVehicleNumber()) {
						list.remove(j);
						break;
					}
				}

				listOwners.get(i).setTrucks(list);
				ownerDaoImpl.save(listOwners, PATH_OWNER);
			}
		}
	}

	@Override
	public void displayInfo(Truck truck) {
		super.displayInfo(truck);

		System.out.println("Tonnage: " + truck.getTonnage());
	}

	public void displayMenu() {
		int index = 0;
		int vehicleNumber = 0;

		boolean isExit = true;
		while (isExit) {
			System.out.println("-----TRUCK MANAGEMENT SYSTEM-----");
			System.out.println("1. Display All Trucks\n" + "2. Find Truck By Id\n" + "3. Add New Truck\n"
					+ "4. Remove Truck\n" + "5. Update Truck\n" + "6. Sort Truck\n" + "7. Exit");

			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				displayAll(listTrucks);
				break;

			case 2:
				System.out.println("Please enter your vehicle number to find: ");
				vehicleNumber = scanner.nextInt();
				Truck truck = findByVehicleNumber(listTrucks, vehicleNumber);
				if (truck != null) {
					displayInfo(truck);
				} else {
					System.out.println("Not found.");
				}
				break;

			case 3:
				System.out.println("Please enter your index to add: ");
				index = scanner.nextInt();
				Truck newTruck = new Truck();
				inputInfo(newTruck);
				List<Truck> newList = add(listTrucks, newTruck, index);
				listTrucks = newList;
				truckDaoImpl.save(newList, PATH_TRUCK);
				break;

			case 4:
				System.out.println("Please enter your index to remove: ");
				index = scanner.nextInt();
				removeFromOwner(listTrucks.get(index));
				List<Truck> removedList = remove(listTrucks, index);
				listTrucks = removedList;
				truckDaoImpl.save(removedList, PATH_TRUCK);
				break;

			case 5:
				System.out.println("Please enter your vehicle number to update: ");
				vehicleNumber = scanner.nextInt();
				listTrucks = update(listTrucks, vehicleNumber);
				truckDaoImpl.save(listTrucks, PATH_TRUCK);
				break;

			case 6:
				listTrucks = sort(listTrucks);
				truckDaoImpl.save(listTrucks, PATH_TRUCK);
				displayAll(listTrucks);
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

package com.service.impl;

import static com.service.impl.OwnerServiceImpl.PATH_OWNER;
import static com.service.impl.OwnerServiceImpl.listOwners;
import static com.service.impl.OwnerServiceImpl.ownerDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.MotorcycleDaoImpl;
import com.model.Motorcycle;
import com.service.MotorcycleService;

public class MotorcycleServiceImpl extends VehicleServiceImpl<Motorcycle> implements MotorcycleService {

	public static MotorcycleDaoImpl motorcycleDaoImpl = new MotorcycleDaoImpl();
	public static final String PATH_MOTORCYCLE = "data/motorcycles.txt";
	public static List<Motorcycle> listMotorcycles = motorcycleDaoImpl.findAll(PATH_MOTORCYCLE);

	public MotorcycleServiceImpl() {
		super();
	}

	@Override
	public void displayAll(List<Motorcycle> list) {
		for (int i = 0; i < list.size(); i++) {
			displayInfo(list.get(i));
		}
	}

	@Override
	public void inputInfo(Motorcycle motorcycle) {
		super.inputInfo(motorcycle);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Wattage: ");
		int wattage = scanner.nextInt();
		motorcycle.setWattage(wattage);

		addToOwner(motorcycle);
	}

	public void addToOwner(Motorcycle motorcycle) {
		for (int i = 0; i < listOwners.size(); i++) {
			if (motorcycle.getOwner().getId() == listOwners.get(i).getId()) {
				List<Motorcycle> list = listOwners.get(i).getMotorcycles() == null ? new ArrayList<Motorcycle>()
						: listOwners.get(i).getMotorcycles();
				list.add(motorcycle);
				listOwners.get(i).setMotorcycles(list);
				ownerDaoImpl.save(listOwners, PATH_OWNER);
			}
		}
	}

	public void removeFromOwner(Motorcycle motorcycle) {
		for (int i = 0; i < listOwners.size(); i++) {
			if (motorcycle.getOwner().getId() == listOwners.get(i).getId()) {
				List<Motorcycle> list = listOwners.get(i).getMotorcycles();
				for (int j = 0; j < list.size(); j++) {
					if (motorcycle.getVehicleNumber() == list.get(j).getVehicleNumber()) {
						list.remove(j);
						break;
					}
				}

				listOwners.get(i).setMotorcycles(list);
				ownerDaoImpl.save(listOwners, PATH_OWNER);
			}
		}
	}

	@Override
	public void displayInfo(Motorcycle motorcycle) {
		super.displayInfo(motorcycle);

		System.out.println("Wattage: " + motorcycle.getWattage());
	}

	public void displayMenu() {
		int index = 0;
		int vehicleNumber = 0;

		boolean isExit = true;
		while (isExit) {
			System.out.println("-----MOTORCYCLE MANAGEMENT SYSTEM-----");
			System.out.println("1. Display All Motorcycles\n" + "2. Find Motorcycle By Id\n" + "3. Add New Motorcycle\n"
					+ "4. Remove Motorcycle\n" + "5. Update Motorcycle\n" + "6. Sort Motorcycle\n" + "7. Exit");

			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				displayAll(listMotorcycles);
				break;

			case 2:
				System.out.println("Please enter your vehicle number to find: ");
				vehicleNumber = scanner.nextInt();
				Motorcycle motorcycle = findByVehicleNumber(listMotorcycles, vehicleNumber);
				if (motorcycle != null) {
					displayInfo(motorcycle);
				} else {
					System.out.println("Not found.");
				}
				break;

			case 3:
				System.out.println("Please enter your index to add: ");
				index = scanner.nextInt();
				Motorcycle newMotorcycle = new Motorcycle();
				inputInfo(newMotorcycle);
				List<Motorcycle> newList = add(listMotorcycles, newMotorcycle, index);
				listMotorcycles = newList;
				motorcycleDaoImpl.save(newList, PATH_MOTORCYCLE);
				break;

			case 4:
				System.out.println("Please enter your index to remove: ");
				index = scanner.nextInt();
				removeFromOwner(listMotorcycles.get(index));
				List<Motorcycle> removedList = remove(listMotorcycles, index);
				listMotorcycles = removedList;
				motorcycleDaoImpl.save(removedList, PATH_MOTORCYCLE);
				break;

			case 5:
				System.out.println("Please enter your vehicle number to update: ");
				vehicleNumber = scanner.nextInt();
				listMotorcycles = update(listMotorcycles, vehicleNumber);
				motorcycleDaoImpl.save(listMotorcycles, PATH_MOTORCYCLE);
				break;

			case 6:
				listMotorcycles = sort(listMotorcycles);
				motorcycleDaoImpl.save(listMotorcycles, PATH_MOTORCYCLE);
				displayAll(listMotorcycles);
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

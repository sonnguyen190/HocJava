package com.service.impl;

import static com.main.Main.carServiceImpl;
import static com.main.Main.motorcycleServiceImpl;
import static com.main.Main.truckServiceImpl;
import static com.service.impl.CarServiceImpl.PATH_CAR;
import static com.service.impl.CarServiceImpl.carDaoImpl;
import static com.service.impl.CarServiceImpl.listCars;
import static com.service.impl.MotorcycleServiceImpl.PATH_MOTORCYCLE;
import static com.service.impl.MotorcycleServiceImpl.listMotorcycles;
import static com.service.impl.MotorcycleServiceImpl.motorcycleDaoImpl;
import static com.service.impl.TruckServiceImpl.PATH_TRUCK;
import static com.service.impl.TruckServiceImpl.listTrucks;
import static com.service.impl.TruckServiceImpl.truckDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.OwnerDaoImpl;
import com.model.Car;
import com.model.Motorcycle;
import com.model.Owner;
import com.model.Truck;
import com.model.Vehicle;
import com.service.OwnerService;

public class OwnerServiceImpl<T extends Vehicle> implements OwnerService {

	public static OwnerDaoImpl ownerDaoImpl = new OwnerDaoImpl();
	public static final String PATH_OWNER = "data/owners.txt";
	public static List<Owner> listOwners = ownerDaoImpl.findAll(PATH_OWNER);

	public OwnerServiceImpl() {
		super();
	}

	public void inputInfo(Owner owner) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Id: ");
		int id = scanner.nextInt();
		owner.setId(id);

		System.out.println("Input Name: ");
		String name = scanner.next();
		owner.setName(name);

		System.out.println("Input email: ");
		String email = scanner.next();
		owner.setEmail(email);
	}

	public void displayInfo(Owner owner) {
		System.out.println("Id: " + owner.getId());
		System.out.println("Name: " + owner.getName());
		System.out.println("Email: " + owner.getEmail());
		System.out.println("List Cars: " + owner.getCars() != null ? owner.getCars() : "Empty");
		System.out.println("List Motorcycles: " + owner.getMotorcycles() != null ? owner.getMotorcycles() : "Empty");
		System.out.println("List Trucks: " + owner.getTrucks() != null ? owner.getTrucks() : "Empty");
	}

	@Override
	public void displayAll(List<Owner> list) {
		for (int i = 0; i < list.size(); i++) {
			displayInfo(list.get(i));
		}
	}

	@Override
	public Owner findOwnerById(List<Owner> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Owner> add(List<Owner> list, Owner owner, int index) {
		List<Owner> newList = list == null ? new ArrayList<Owner>() : list;
		newList.add(index, owner);

		return newList;
	}

	public void removeFromVehcile(Owner owner) {
		if (listCars != null) {
			List<Car> listRemoved = new ArrayList<Car>();
			for (int i = 0; i < listCars.size(); i++) {
				if (listCars.get(i).getOwner().getId() == owner.getId()) {
					listRemoved.add(listCars.get(i));
				}
			}
			listCars.removeAll(listRemoved);
			carDaoImpl.save(listCars, PATH_CAR);
		}

		if (listMotorcycles != null) {
			List<Motorcycle> listRemoved = new ArrayList<Motorcycle>();
			for (int i = 0; i < listMotorcycles.size(); i++) {
				if (listMotorcycles.get(i).getOwner().getId() == owner.getId()) {
					listRemoved.add(listMotorcycles.get(i));
				}
			}
			listMotorcycles.removeAll(listRemoved);
			motorcycleDaoImpl.save(listMotorcycles, PATH_MOTORCYCLE);
		}

		if (listTrucks != null) {
			List<Truck> listRemoved = new ArrayList<Truck>();
			for (int i = 0; i < listTrucks.size(); i++) {
				if (listTrucks.get(i).getOwner().getId() == owner.getId()) {
					listRemoved.add(listTrucks.get(i));
				}
			}
			listTrucks.removeAll(listRemoved);
			truckDaoImpl.save(listTrucks, PATH_TRUCK);
		}

	}

	@Override
	public List<Owner> remove(List<Owner> list, int index) {
		list.remove(index);

		return list;
	}

	public void displayMenu() {
		int index = 0;
		int id = 0;

		boolean isExit = true;
		while (isExit) {
			System.out.println("-----OWNER MANAGEMENT SYSTEM-----");
			System.out.println("1. Display All Owners\n" + "2. Find Owner By Id\n" + "3. Add New Owner\n"
					+ "4. Remove Owner\n" + "5. Update Owner\n" + "6. Sort Owner\n" + "7. Exit");

			Scanner scanner = new Scanner(System.in);

			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				displayAll(listOwners);
				break;

			case 2:
				System.out.println("Please enter your id to find: ");
				id = scanner.nextInt();
				Owner owner = findOwnerById(listOwners, id);
				if (owner != null) {
					if (owner.getCars() != null) {
						for (int i = 0; i < owner.getCars().size(); i++) {
							carServiceImpl.displayInfo(owner.getCars().get(i));
						}
					}

					if (owner.getMotorcycles() != null) {
						for (int i = 0; i < owner.getMotorcycles().size(); i++) {
							motorcycleServiceImpl.displayInfo(owner.getMotorcycles().get(i));
						}
					}

					if (owner.getTrucks() != null) {
						for (int i = 0; i < owner.getTrucks().size(); i++) {
							truckServiceImpl.displayInfo(owner.getTrucks().get(i));
						}
					}

				} else {
					System.out.println("Not found.");
				}
				break;

			case 3:
				System.out.println("Please enter your index to add: ");
				index = scanner.nextInt();
				Owner newOwner = new Owner();
				inputInfo(newOwner);
				List<Owner> newList = add(listOwners, newOwner, index);
				listOwners = newList;
				ownerDaoImpl.save(newList, PATH_OWNER);
				break;

			case 4:
				System.out.println("Please enter your index to remove: ");
				index = scanner.nextInt();
				removeFromVehcile(listOwners.get(index));
				List<Owner> removedList = remove(listOwners, index);
				listOwners = removedList;
				ownerDaoImpl.save(removedList, PATH_OWNER);
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

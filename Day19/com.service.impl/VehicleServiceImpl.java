package com.service.impl;

import static com.service.impl.OwnerServiceImpl.listOwners;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.constant.Producer;
import com.model.Owner;
import com.model.Vehicle;
import com.service.VehicleService;

public abstract class VehicleServiceImpl<T extends Vehicle> implements VehicleService<T> {

	public Class<T> clazzModel;

	public VehicleServiceImpl() {
		this.clazzModel = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void displayAll(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			displayInfo(list.get(i));
		}
	}

	@Override
	public T findByVehicleNumber(List<T> list, int vehicleNumber) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getVehicleNumber() == vehicleNumber) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public List<T> add(List<T> list, T t, int index) {
		List<T> newList = list == null ? new ArrayList<T>() : list;
		newList.add(index, t);

		return newList;
	}

	@Override
	public List<T> remove(List<T> list, int index) {
		list.remove(index);

		return list;
	}

	@Override
	public List<T> removeAll(List<T> list) {
		list.clear();

		return list;
	}

	@Override
	public List<T> update(List<T> list, int vehicleNumber) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getVehicleNumber() == vehicleNumber) {
				inputInfo(list.get(i));
				break;
			}
		}

		return list;
	}

	@Override
	public List<T> sort(List<T> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getVehicleNumber() > list.get(j).getVehicleNumber()) {
					T t = list.get(i);
					list.set(i, list.get(j));
					list.set(j, t);
				}
			}
		}

		return list;
	}

	public void inputInfo(T t) {
		Scanner scanner = new Scanner(System.in);

		int vehicleNumber = inputVechileNumber();
		t.setVehicleNumber(vehicleNumber);

		Producer producer = inputProducer();
		t.setProducer(producer);

		System.out.println("Input Year: ");
		int year = scanner.nextInt();
		t.setYear(year);

		System.out.println("Input Color: ");
		String color = scanner.next();
		t.setColor(color);

		System.out.println("Input Index Of Owner: ");
		int index = scanner.nextInt();
		Owner owner = listOwners.get(index);
		t.setOwner(owner);
	}

	public void displayInfo(T t) {
		System.out.println("Vehicle Number: " + t.getVehicleNumber());
		System.out.println("Producer: " + t.getProducer());
		System.out.println("Year: " + t.getYear());
		System.out.println("Color: " + t.getColor());
		System.out.println("Owner Name: " + t.getOwner().getName());
	}

	public int inputVechileNumber() {
		boolean isValid = false;
		int vehicleNumber = 0;

		while (!isValid) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Input Vehicle Number: ");
				vehicleNumber = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Vechile Number should be Integer.");
			}

			if (vehicleNumber >= 1 && vehicleNumber <= 10) {
				isValid = true;
			} else {
				System.out.println("Vechile Number should be from 1 to 10.");
			}
		}

		return vehicleNumber;
	}

	public Producer inputProducer() {
		Producer producer = null;
		System.out.println("Input the number from 1 to 4 to choose the Producer:");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			producer = Producer.HONDA;
			break;

		case 2:
			producer = Producer.SUZUKI;
			break;

		case 3:
			producer = Producer.TOYOTA;
			break;

		case 4:
			producer = Producer.YAMAHA;
			break;
		}

		return producer;
	}

}

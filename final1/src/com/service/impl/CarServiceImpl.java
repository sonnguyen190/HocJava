package com.service.impl;

import java.io.Serializable;
import java.util.Scanner;

import com.dao.impl.CarDaoImpl;
import com.model.Car;
import com.service.CarService;

public class CarServiceImpl extends VehicleServiceImpl implements CarService,Serializable {
	public Car[] arrCars;
	CarDaoImpl cardaoImpl = new CarDaoImpl();
	Scanner scanner = new Scanner(System.in);
	
	public CarServiceImpl() {
		super();
	this.arrCars = cardaoImpl.findAll();
	}
	public void inputInfoCar(Car vehicle) {
		super.inputInfo(vehicle);
		System.out.println("moi nhap so cho ngoi:");
		int seat=scanner.nextInt();
		vehicle.setChoNgoi(seat);
		
		System.out.println("moi nhap kieu dong co:");
		String engine = scanner.next();
		vehicle.setKieuDongCo(engine);
		
		
	}
	public void displayInfoCar(Car car) {
		super.displayInfo(car);
		System.out.println("so cho ngoi:"+car.getChoNgoi());
		System.out.println("kieu dong co:"+car.getKieuDongCo());
		System.out.println("--------------------------------------------------");
	}
	@Override
	public void displayAll() {
		if(arrCars!=null) {
			for(int i=0;i<arrCars.length;i++) {
			displayInfoCar(arrCars[i]);
		}
		}
		else {
			System.out.println("hien tai chua co xe nao!! hay add 1 xe truoc.");
		}
		
		
	}

	@Override
	public Car findCarTheoSoXe(String soxe) {
		
		for(int i=0;i<arrCars.length;i++) {
			if(arrCars[i].getSoXe().equals(soxe)) {
				return arrCars[i];
			}
		}
		return null;
	}

	@Override
	public Car[] add(int indexAdd) {
		Car car = new Car();
		inputInfoCar(car);
		Car[] newArr = arrCars == null ? new Car[1]:new Car[arrCars.length+1];
		
		for(int i=0;i<indexAdd;i++) {
			newArr[i]=arrCars[i];
		}
		newArr[indexAdd]=car;
		for(int i=indexAdd+1;i<newArr.length;i++) {
			newArr[i]=arrCars[i-1];
		}
		cardaoImpl.save(newArr);
		return newArr;
	}

	@Override
	public Car[] remove(String soxe) {
		Car[] CarRemoveArr = new Car[arrCars.length-1];
		for(int i=0;i<arrCars.length-1;i++) {
			
			CarRemoveArr[i]=arrCars[i];
			
			if(arrCars[i].getSoXe().equals(soxe)) {
				CarRemoveArr[i]= arrCars[i+1];
				System.out.println("remove complete :))");
				
			}
			
			
		}
		cardaoImpl.save(CarRemoveArr);
		return CarRemoveArr;
	}

	@Override
	public Car[] findCarTheoSoXeVaNhapLai(String soxe) {

		for(int i=0;i<arrCars.length;i++) {
			if(arrCars[i].getSoXe().equals(soxe)) {
				arrCars[i].toString();
				Car[] arrr =add(i);
				arrCars[i]=arrr[i];
				
			}
		}
		cardaoImpl.save(arrCars);
		return arrCars;
		
	}

	@Override
	public Car[] sortTheoChoNgoi() {
		
		for (int i = 0; i < arrCars.length - 1; i++) {
			for (int j = i + 1; j < arrCars.length; j++) {
				if ((arrCars[i].getChoNgoi()) > (arrCars[j].getChoNgoi())) {
					Car tam = arrCars[i];
					arrCars[i] = arrCars[j];
					arrCars[j] = tam;
				}
			}
		}
		cardaoImpl.save(arrCars);
		return arrCars;
		
	}
	
	public void displayMenuCar() {
		boolean isexit = true;
		while (isexit) {
			System.out.println("1.display all \n 2.find car theo so xe va xuat ra \n 3.add \n 4.remove \n 5.find car va nhap lai thong tin \n 6.sort car theo cho ngoi \n 7.Exit");
			int value = scanner.nextInt();
			switch (value) {
			case 1: 
				displayAll();
				break;
			case 2:
				System.out.println("moi nhap so xe can tim:");
				String soXe = scanner.next();
				Car car=findCarTheoSoXe(soXe);
				if(car!=null) {
					displayInfoCar(car);
				}
				else {
					System.out.println("not found");
				}
				break;
			case 3:
				System.out.println("nhap vi tri can add:");
				int add = scanner.nextInt();
				Car[] arrr =add(add);
				arrCars=arrr;
				break;
			case 4:
				System.out.println("nhap so xe can remove:");
				String indexRemove = scanner.next();
				Car[] arrayRemove =remove(indexRemove);
				arrCars=arrayRemove;
				break;
			case 5:
				System.out.println("moi nhap so xe can tim va thay the:");
				String soXeFind= scanner.next();
				Car[] carFind=findCarTheoSoXeVaNhapLai(soXeFind);
				arrCars=carFind;
				break;
			case 6:
				 arrCars=sortTheoChoNgoi();
				displayAll();
				break;
			case 7:
				isexit=false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + value);
			}
		}
	}


	

}

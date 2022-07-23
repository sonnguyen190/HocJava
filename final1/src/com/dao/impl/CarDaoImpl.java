package com.dao.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dao.CarDao;
import com.model.Car;

public class CarDaoImpl implements CarDao{

	@Override
	public Car[] findAll() {
		ObjectInputStream ois = null;
		Car[] arrCar = null;
		try {
			FileInputStream fis = new FileInputStream("data/Car.txt");
			ois = new ObjectInputStream(fis);
			arrCar = (Car[]) ois.readObject();
			System.out.println(arrCar.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrCar;
	}

	@Override
	public void save(Car[] car) {
		ObjectOutputStream oos = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("data/Car.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(oos!=null) {
					oos.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}

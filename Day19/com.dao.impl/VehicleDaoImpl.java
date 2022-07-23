package com.dao.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.dao.VehicleDao;
import com.model.Vehicle;

public abstract class VehicleDaoImpl<T extends Vehicle> implements VehicleDao<T> {

	@Override
	public List<T> findAll(String path) {
		List<T> list = null;
		ObjectInputStream ois = null;

		try {
			FileInputStream fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			list = (List<T>) ois.readObject();
			System.out.println(list.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return list;
	}

	@Override
	public void save(List<T> list, String path) {
		ObjectOutputStream oos = null;

		try {
			FileOutputStream fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

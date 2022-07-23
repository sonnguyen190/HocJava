package com.dao.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dao.MotocycleDao;
import com.model.Motorcycle;

public class MotocycleDaoImpl implements MotocycleDao{

	@Override
	public Motorcycle[] findAll() {
		ObjectInputStream ois=null;
		Motorcycle[] arrMoto = null;
		try {
			FileInputStream fis = new FileInputStream("data/Motocycle.txt");
			ois = new ObjectInputStream(fis);
			arrMoto = (Motorcycle[]) ois.readObject();
			System.out.println(arrMoto.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ois!=null) {
					ois.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrMoto;
	}

	@Override
	public void save(Motorcycle[] motocycle) {
		ObjectOutputStream oos=null;
		
		try {
			FileOutputStream fos = new FileOutputStream("data/Motocycle.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(motocycle);
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

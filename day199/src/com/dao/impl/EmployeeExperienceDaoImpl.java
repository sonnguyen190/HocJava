package com.dao.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.daoo.EmployeeExperienceDao;
import com.model.EmployeeExperience;

public class EmployeeExperienceDaoImpl implements EmployeeExperienceDao{

	@Override
	public EmployeeExperience[] findAll() {
		EmployeeExperience[] arrEmployee = null;
		ObjectInputStream ois= null;
		
		try {
			FileInputStream fis = new FileInputStream("data/EmployeeExperience.txt");
			ois = new ObjectInputStream(fis);
			arrEmployee = (EmployeeExperience[]) ois.readObject();
			System.out.println(arrEmployee.toString());
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
		return arrEmployee;
	}

	@Override
	public void save(EmployeeExperience[] employees) {
		
		ObjectOutputStream oos= null;
		
		try {
			FileOutputStream fos = new FileOutputStream("data/EmployeeExperience.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(employees);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(oos != null) {
					oos.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}

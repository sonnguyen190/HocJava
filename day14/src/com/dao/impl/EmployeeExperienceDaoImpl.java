package com.dao.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dao.EmployeeExperienceDao;
import com.model.EmployeeExperience;


public class EmployeeExperienceDaoImpl implements EmployeeExperienceDao {
	@Override
	public EmployeeExperience[] findAll() {
		EmployeeExperience[] arrEmployees = null;
		ObjectInputStream ois = null;
		try {
			FileInputStream fileIn = new FileInputStream("data/EmployeesExperience.txt");
			ois = new ObjectInputStream(fileIn);
			arrEmployees  =(EmployeeExperience[])ois.readObject();
			System.out.println(arrEmployees.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				
			}
		}
		return arrEmployees;
	}
	
	@Override
	public void save(EmployeeExperience[] employees) {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fileout=new FileOutputStream("data/EmployeesExperience.txt");
			oos = new ObjectOutputStream(fileout);
			oos.writeObject(employees);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				
			}
		}
	}
	
}

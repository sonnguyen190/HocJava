package com.service.impl;

import java.util.Scanner;

import com.model.Employee;
import com.model.EmployeeExperience;

public abstract class EmployeeServiceImpl {
	public void inputInfor(Employee employee) {
		Scanner scanner = new Scanner(System.in);
		
		int id = inputId();
		employee.setId(id);
		
		String name = inputFullName();
		employee.setFullName(name);
		
		System.out.println("moi nhap ngay sinh: ");
		String dob = scanner.next();
		employee.setDob(dob);
		
		System.out.println("moi nhap gio lam viec: ");
		int giolamviec = scanner.nextInt();
		employee.setPaymentPerHour(giolamviec);
	}
	
	public void displayInfo(Employee employee) {
		System.out.println("Id:"+employee.getId());
		System.out.println("Full Name:"+employee.getFullName());
		System.out.println("dob:"+employee.getDob());
		System.out.println("gio lam viec:"+employee.getPaymentPerHour());
		
	}
	
	public abstract double calculateSalary(Employee employee);
	
	public int inputId() {
		boolean isValid=false;
		int id =0;
		while (!isValid) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("moi nhap id: ");
				id = scanner.nextInt();
				
			} catch (Exception e) {
				System.out.println("nen nhap interger.");
			}
			if(id>=1&&id<=10 ) {
				isValid =true;
			}
			else {
				System.out.println("nhap id tu 1 den 10.");
			}
			
		}
		return id;
	}
	
	public String inputFullName() {
		boolean isValid=false;
		String fullName ="";
		while (!isValid) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("moi nhap full name: ");
				fullName = scanner.next();
				
			} catch (Exception e) {
				System.out.println("nen nhap String.");
			}
			if(fullName.length()>=1&&fullName.length()<=20 ) {
				isValid =true;
			}
			else {
				System.out.println("nhap toi da 20 ky tu");
			}
			
		}
		return fullName;
	}

	
}

package com.model;

import java.util.Scanner;

public class Employee {
	public String name;
	public int age;
	public double salary;
	public int workingHours;

	public Employee() {
		
	}
	
	public Employee(String name,int age,double salary,int workingHours) {
		
	}
	
	public void inputInfo() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi nhap ten: ");
		this.name=scanner.next();
		System.out.println("moi nhap tuoi: ");
		this.age=scanner.nextInt();
		System.out.println("moi nhap Luong: ");
		this.salary=scanner.nextDouble();
		System.out.println("moi nhap so gio lam: ");
		this.workingHours=scanner.nextInt();
		
	}
	public String  displayInfo() {
		String xuat = "Tên:"+this.name+"||Tuổi:"+this.age+"||Lương:"+this.salary+"||Số giờ làm:"+this.workingHours;
			return xuat;	
	}
	
	public double calculateBonus() {
		double thuong=0;
		if(this.workingHours>=200) {
			 thuong =(this.salary*20)/100; 
		}
		else if(this.workingHours<200&&this.workingHours>=100) {
			 thuong =(this.salary*10)/100; 
		}
		else {
			System.out.println("khong có thưởng");
		}
		return thuong;
	}

}

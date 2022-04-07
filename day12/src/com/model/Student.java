package com.model;

import java.util.Scanner;

public class Student extends Person {
public String code;
public double average;
public String email;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student( String code, double average,String email) {
		code = this.code;
		average = this.average;
		email=this.email;
	}
	
	@Override 
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi nhap code: ");
		this.code = scanner.next();
		System.out.println("moi nhap average: ");
		this.average = scanner.nextDouble();
		System.out.println("moi nhap email: ");
		this.email = scanner.next();
	
	}
	
	@Override 
	public String displayInfo() {
		String diem = "code:" +this.code +"||Average:"+this.average+"||email:"+this.email;
		return  diem;
	}
	
	public void checkScholarship() {
		if(average>=8) {
			System.out.println("duoc hoc bong");
		}
		else System.out.println("khonng duoc hoc bong");
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

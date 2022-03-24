package com.model;

public class SoHoc {
public int number1;
public int number2;
	public SoHoc() {
		
	}
	
	public SoHoc(int num1,int num2) {
		int Tong = 0;
		Tong=num1+num2;
		System.out.println("tong la: "+Tong);
		int Hieu =0;
		Hieu=num1-num2;
		System.out.println("Hieu la: "+Hieu);
		int Tich=0;
		Tich=num1*num2;
		System.out.println("Tich la: "+Tich);
		float Thuong = 0f;
		Thuong = num1/num2;
		System.out.println("Thuong la: "+Thuong);
	}

}

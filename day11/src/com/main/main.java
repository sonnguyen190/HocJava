package com.main;

import java.util.Scanner;

import com.model.*;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập số lượng student: ");
		int n = scanner.nextInt();
		
		Student[] arrstudent=new Student[n];
		for(int i=0;i<arrstudent.length;i++) {
			arrstudent[i]=scanner.nextInt();
		}
		
		
	Student student = new Student();
	student.inputInfo();
	String displayin4 = student.displayInfo();
	float diemTrungBinh = student.calculateAverage();
	System.out.println(displayin4);
	System.out.println("Điểm TB là: "+diemTrungBinh);
	}

}

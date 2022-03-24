package com.main;

import java.util.Arrays;

import com.model.*;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		SoHoc sohoc = new SoHoc(10,10);
		PhanSo phanso1 = new PhanSo(1,2);
		PhanSo phanso2 = new PhanSo(3,4);
		PhanSo psKetQua = phanso1.tongPS(phanso2);
		System.out.println("tu la: "+psKetQua.tu);
		System.out.println("mau la: "+psKetQua.mau);
		Book book1 = new Book('a',"Bí Kiếp Cua Gái",20000,"SơnKute");
		Book book2 = new Book('b',"Cách Lái Máy Bay U60",50000,"SơnKute");
		Book book3 = new Book('c',"Cách Làm Phi Công Trẻ",100000,"SơnKute");
		
		Book[] arrBook = new Book[3];
		arrBook[0]=book1;
		arrBook[1]=book2;
		arrBook[2]=book3;
		int max=arrBook[0].price;
		int index=0;
		for(int i = 0 ; i < arrBook.length;i++) {
			String in4Book=arrBook[i].displayInfo();
			System.out.println(in4Book);
			if(arrBook[i].price>max) {
				max = arrBook[i].price;
				index = i;
			}
		}
		String in4book = arrBook[index].displayInfo();
				System.out.println("book co price lon nhất là: "+in4book);
		
//		String in4=book1.displayInfo();
//		String in5=book2.displayInfo();
//		String in6=book3.displayInfo();
//		System.out.println(in4);
//		System.out.println(in5);
//		System.out.println(in6);
		
		
		
//		
//		String nameTeacher =teacher.name="Tuyen";
//		int ageTeacher =teacher.age= 24;
//		
//		
//		String name = student.name = "SOn";
//		int id = student.id = 001;
//		
//		System.out.println(name);
//		System.out.println(id);
//		Student.learning();
//
//		
//		String name2 = student.name = "Sonkuté90";
//		int id2 = student.id = 002;
//		System.out.println(name2);
//		System.out.println(id2);
				
				Person person = new Person();
				person.getAge();
				System.out.println(person.getAge());
}

}

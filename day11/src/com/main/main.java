package com.main;

import java.util.Arrays;
import java.util.Scanner;

import com.model.*;
import com.service.StudentService;

public class main {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.inputInfo();
//		String displayin4 = student.displayInfo();
//		float diemTrungBinh = student.calculateAverage();
//		System.out.println(displayin4);
//		System.out.println("Điểm TB là: " + diemTrungBinh);

		Student s1 = new Student(1, "s1", "01/01/2001", 8, 5);
		Student s2 = new Student(2, "s2", "13/04/2001", 4, 6);
		Student s3 = new Student(3, "s3", "21/10/2001", 1, 7);
		Student s4 = new Student(4, "s4", "25/12/2001", 8, 8);
		Student[] arrStudents = new Student[4];
		arrStudents[0] = s1;
		arrStudents[1] = s2;
		arrStudents[2] = s3;
		arrStudents[3] = s4;
		boolean isExit = true;
		while (isExit) {
			System.out.println("-----STUDENT MANAGEMENT SYSTEM-----");
			System.out.println("1. Find Student Max Average\r\n" + "2. Display All Students\r\n" + "3. Sort Student\r\n"
					+ "4. Find Student\r\n" + "5. Add New Student\r\n" + "6. Remove Student\r\n"
					+ "7. Update Student\r\n" + "8. Exit -->Thoát ra khỏi chương trình");

			StudentService studentService = new StudentService();
			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				Student studentMax = studentService.findMax(arrStudents);
				System.out.println(studentMax.displayInfo());
				break;
			case 2:
				studentService.displayAllStudent(arrStudents);
				break;
			case 3:
				arrStudents = studentService.sortStudent(arrStudents);
				break;
			case 4:
				System.out.println("moi nhap id cua student can tim: ");
				int id = scanner.nextInt();
				Student student = studentService.findStudentById(arrStudents, id);
				if(student!=null) {
					System.out.println(student.displayInfo());
				}
				else {
					System.out.println("khong co id nay");
				}
				break;
			case 5:
				Student s5 = new Student(5, "s5", "29/12/2001", 6, 6);
				System.out.println("moi nhap cho can add: ");
				int indexAdd = scanner.nextInt();
				Student[] newArr = studentService.addStudent(arrStudents,s5, indexAdd);
				arrStudents = new Student[newArr.length];
				for(int i = 0;i<newArr.length;i++) {
					arrStudents[i]=newArr[i];
				}
				break;
				
		
			}
		}

	}

}

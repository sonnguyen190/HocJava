package com.main;

import com.model.*;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		String nameTeacher =teacher.name="Tuyen";
		int ageTeacher =teacher.age= 24;
		
		
		String name = student.name = "SOn";
		int id = student.id = 001;
		
		System.out.println(name);
		System.out.println(id);
		Student.learning();

		
		String name2 = student.name = "Sonkuté90";
		int id2 = student.id = 002;
		System.out.println(name2);
		System.out.println(id2);
	}

}

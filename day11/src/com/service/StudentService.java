package com.service;

import com.model.Student;

public class StudentService {
	public Student findMax(Student[] arrStudents) {
		Student studentMax = arrStudents[0];
		for(int i = 1;i<arrStudents.length;i++) {
			if(arrStudents[i].calculateAverage()>studentMax.calculateAverage()) {
				studentMax=arrStudents[i];
			}
		}
		return studentMax;
	}
	public void displayAllStudent(Student[] arrStudents) {
		for(int i=0;i<arrStudents.length;i++) {
			System.out.println(arrStudents[i].displayInfo());
		}
	}
	
	public Student[] sortStudent(Student[] arrStudents) {
		for(int i=0;i<arrStudents.length-1;i++) {
			for(int j=i+1;j<arrStudents.length;j++) {
				if(arrStudents[i].calculateAverage()>arrStudents[j].calculateAverage()) {
					Student hoanvi = arrStudents[i];
					arrStudents[i]=arrStudents[j];
					arrStudents[j]=hoanvi;
				}
			}
		}
		return arrStudents;
	}
	
	public Student findStudentById(Student[] arrStudents,int id) {
		for(int i=0;i<arrStudents.length;i++) {
			if(arrStudents[i].getId()==id) {
				return arrStudents[i];
			}
		}
		return null;
	}
	
	public Student[] addStudent(Student[] arrStudents,Student student, int indexAdd) {
		Student[] newArr = new Student[arrStudents.length+1];
		for(int i = 0;i<indexAdd;i++) {
			newArr[i]=arrStudents[i];
		}
		newArr[indexAdd]=student;
		for(int i=indexAdd;i<newArr.length;i++) {
			newArr[i]=arrStudents[i-1];
		}
		return newArr;
		
	}

}

	

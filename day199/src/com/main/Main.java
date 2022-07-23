package com.main;

import java.util.Scanner;

import com.service.impl.EmployeeExperienceServiceImpl;
import com.service.impl.EmployeeFresherServiceImpl;
import com.service.impl.EmployeeInternServiceImpl;

public class Main {

	public static void main(String[] args) {
		boolean isExit = true;
		while (isExit) {
			System.out.println("-----EMPLOYEE MANAGEMENT SYSTEM-----");
			System.out.println("1. Employee Experience\n" + "2. EmployeeFresher\n" + "3. EmployeeIntern\n" + "4. Exit");
			EmployeeExperienceServiceImpl employeeexperienceServiceImpl = new EmployeeExperienceServiceImpl();
			EmployeeInternServiceImpl employeeinternServiceImpl = new EmployeeInternServiceImpl();
			EmployeeFresherServiceImpl employeefresherServiceImpl = new EmployeeFresherServiceImpl();
			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1: 
				employeeexperienceServiceImpl.displayMenu();
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}

	}

}

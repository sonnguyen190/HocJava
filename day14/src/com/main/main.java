package com.main;

import java.util.Scanner;

import com.service.impl.EmployeeExperienceServiceImpl;


 class Main {

	public static void main(String[] args) {
		boolean isExit = true;
		while (isExit) {
			System.out.println("-----EMPLOYEE MANAGEMENT SYSTEM-----");
			System.out.println("1. Employee Experience\n" + "2. EmployeeFresher\n" + "3. EmployeeIntern\n" + "4. Exit");

			EmployeeExperienceServiceImpl employeeExperienceServiceImpl = new EmployeeExperienceServiceImpl();
		

			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				employeeExperienceServiceImpl.displayMenu();
				break;

			case 4:
				isExit = false;
				break;

			default:
				System.out.println("Your choose is invalid.");
				break;
			}
		}
	}

}

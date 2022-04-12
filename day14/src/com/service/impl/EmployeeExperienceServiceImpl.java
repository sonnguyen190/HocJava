package com.service.impl;

import java.util.Scanner;

import com.dao.impl.EmployeeExperienceDaoImpl;
import com.model.Employee;
import com.model.EmployeeExperience;
import com.service.EmployeeExperienceService;

public class EmployeeExperienceServiceImpl extends EmployeeServiceImpl implements EmployeeExperienceService {

	public EmployeeExperienceDaoImpl employeeExperienceDaoImpl = new EmployeeExperienceDaoImpl();
	public EmployeeExperience[] arrEmployees;

	public EmployeeExperienceServiceImpl() {
		super();
		this.arrEmployees = employeeExperienceDaoImpl.findAll();
	}

	@Override
	public void displayAll() {
		for (int i = 0; i < arrEmployees.length; i++) {
			displayInfoExperience(arrEmployees[i]);
		}
	}

	@Override
	public EmployeeExperience findById(int id) {
		for (int i = 0; i < arrEmployees.length; i++) {
			if (arrEmployees[i].getId() == id) {
				return arrEmployees[i];
			}
		}

		return null;
	}

	@Override
	public EmployeeExperience[] add(int indexAdd) {
		EmployeeExperience employee = new EmployeeExperience();
		inputInfoExperience(employee);

		EmployeeExperience[] newArr = arrEmployees == null ? new EmployeeExperience[1]
				: new EmployeeExperience[arrEmployees.length + 1];

		for (int i = 0; i < indexAdd; i++) {
			newArr[i] = arrEmployees[i];
		}
		newArr[indexAdd] = employee;
		for (int i = indexAdd + 1; i < newArr.length; i++) {
			newArr[i] = arrEmployees[i - 1];
		}

		employeeExperienceDaoImpl.save(newArr);

		return newArr;
	}

	@Override
	public EmployeeExperience[] remove(int indexRemove) {
		EmployeeExperience[] removedArr = new EmployeeExperience[arrEmployees.length - 1];
		int indexRemovedArr = 0;

		for (int i = 0; i < arrEmployees.length; i++) {
			if (i == indexRemove) {
				continue;
			}
			removedArr[indexRemovedArr] = arrEmployees[i];
			indexRemovedArr++;
		}

		employeeExperienceDaoImpl.save(removedArr);

		return removedArr;
	}

	@Override
	public EmployeeExperience[] update(int id) {
		for (int i = 0; i < arrEmployees.length; i++) {
			if (arrEmployees[i].getId() == id) {
				arrEmployees[i].setFullName("Join");
				arrEmployees[i].setDob("02/02/1902");
				arrEmployees[i].setPaymentPerHour(20);
				arrEmployees[i].setExpInYear(2);
				break;
			}
		}

		employeeExperienceDaoImpl.save(arrEmployees);

		return arrEmployees;
	}

	@Override
	public EmployeeExperience[] sort() {
		for (int i = 0; i < arrEmployees.length - 1; i++) {
			for (int j = i + 1; j < arrEmployees.length; j++) {
				if (calculateSalary(arrEmployees[i]) > calculateSalary(arrEmployees[j])) {
					EmployeeExperience employeeTmp = arrEmployees[i];
					arrEmployees[i] = arrEmployees[j];
					arrEmployees[j] = employeeTmp;
				}
			}
		}

		employeeExperienceDaoImpl.save(arrEmployees);

		return arrEmployees;
	}

	@Override
	public EmployeeExperience findEmployeeMaxSalary() {
		EmployeeExperience employeeMaxSalary = arrEmployees[0];

		for (int i = 0; i < arrEmployees.length; i++) {
			if (calculateSalary(arrEmployees[i]) > calculateSalary(employeeMaxSalary)) {
				employeeMaxSalary = arrEmployees[i];
			}
		}

		return employeeMaxSalary;
	}

	@Override
	public EmployeeExperience findEmployeeMaxExpInYear() {
		EmployeeExperience employeeMaxExpInYear = arrEmployees[0];

		for (int i = 0; i < arrEmployees.length; i++) {
			if (arrEmployees[i].getExpInYear() > (employeeMaxExpInYear.getExpInYear())) {
				employeeMaxExpInYear = arrEmployees[i];
			}
		}

		return employeeMaxExpInYear;
	}

	@Override
	public double calculateSalary(Employee employee) {
		return 8 * employee.getPaymentPerHour() * 3;
	}

	public void inputInfoExperience(EmployeeExperience employee) {
		super.inputInfo(employee);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Exp In Year: ");
		int expInYear = scanner.nextInt();
		employee.setExpInYear(expInYear);
	}

	public void displayInfoExperience(EmployeeExperience employee) {
		super.displayInfo(employee);

		System.out.println("Exp In Year: " + employee.getExpInYear());
	}

	public void displayMenu() {
		int length = arrEmployees == null ? 0 : arrEmployees.length;
		if (arrEmployees == null) {
			System.out.println("There is no records. Please enter option 3 to add new Employee.\n");
		}

		boolean isExit = true;
		while (isExit) {
			System.out.println("-----EMPLOYEE EXPERIENCE MANAGEMENT SYSTEM-----");
			System.out.println("1. Display All Employees\n" + "2. Find Employee By Id\n" + "3. Add New Employee\n"
					+ "3. Remove Employee\n" + "5. Update Employee\n" + "6. Sort Employee\n"
					+ "7. Find Employee Max Salary\n" + "8. Find Employee Max Experience In Year\n" + "9. Exit");

			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				displayAll();
				break;

			case 2:
				System.out.println("Please enter your id to find: ");
				int id = scanner.nextInt();
				EmployeeExperience employee = findById(id);
				if (employee != null) {
					displayInfoExperience(employee);
				} else {
					System.out.println("Not found.");
				}
				break;

			case 3:
				System.out.println("Please enter your index to add from 0 to " + length);
				int indexAdd = scanner.nextInt();
				EmployeeExperience[] newArr = add(indexAdd);
				arrEmployees = newArr;
				break;

			case 4:
				System.out.println("Please enter your index to remove from 0 to " + length);
				int indexRemove = scanner.nextInt();
				EmployeeExperience[] removedArr = remove(indexRemove);
				arrEmployees = removedArr;
				break;

			case 5:
				System.out.println("Please enter your id to update: ");
				int idUpdate = scanner.nextInt();
				arrEmployees = update(idUpdate);
				break;

			case 6:
				arrEmployees = sort();
				displayAll();
				break;

			case 7:
				EmployeeExperience employeeMaxSalary = findEmployeeMaxSalary();
				displayInfoExperience(employeeMaxSalary);
				break;

			case 8:
				EmployeeExperience employeeMaxExpInYearSalary = findEmployeeMaxExpInYear();
				displayInfoExperience(employeeMaxExpInYearSalary);
				break;

			case 9:
				isExit = false;
				break;

			default:
				System.out.println("Your choose is invalid.");
				break;
			}
		}
	}

}

package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.EmployeeDAO;
import com.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private DataSource dataSource;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Connection connection = dataSource.getConnection();
			if (connection != null) {
				System.out
						.println(String.format("Connected to database %s " + "successfully.", connection.getCatalog()));

				String sql = "SELECT * FROM Employees";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Employee employee = new Employee();
					employee.setSsn(resultSet.getInt("SSN"));
					employee.setName(resultSet.getString("Name"));
					employee.setSalary(resultSet.getInt("Salary"));
					employee.setDepartment(resultSet.getInt("Department"));
					employees.add(employee);
				}
				System.out.println("Number of employee: " + employees.size());
				connection.close();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employees;
	}

	public Employee findEmployeeBySSN(int ssn) {
		Employee employee = new Employee();
		try {
			Connection connection = dataSource.getConnection();
			if (connection != null) {
				System.out
						.println(String.format("Connected to database %s " + "successfully.", connection.getCatalog()));

				String sql = "SELECT * FROM Employees WHERE SSN = ?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, ssn);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					employee.setSsn(resultSet.getInt("SSN"));
					employee.setName(resultSet.getString("Name"));
					employee.setSalary(resultSet.getInt("Salary"));
					employee.setDepartment(resultSet.getInt("Department"));
				}
				connection.close();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employee;
	}

	public boolean addNewEmployee(Employee employee) {
		boolean isInserted  = false;
		try {
			Connection connection = dataSource.getConnection();
			if (connection != null) {
				System.out
						.println(String.format("Connected to database %s " + "successfully.", connection.getCatalog()));

				String sql = "INSERT INTO Employees(SSN,Name,Salary,Department) VALUES(?,?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, employee.getSsn());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setDouble(3, employee.getSalary());
				preparedStatement.setInt(4, employee.getDepartment());

				int rowAffected = preparedStatement.executeUpdate();
				System.out.println("Rows inserted: " + rowAffected);
				connection.close();
				isInserted  = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isInserted;
	}

	public boolean updateEmployee(Employee employee) {
		boolean isUpdated  = false;
		try {
			Connection connection = dataSource.getConnection();
			if (connection != null) {
				System.out
						.println(String.format("Connected to database %s " + "successfully.", connection.getCatalog()));
				String sql = "UPDATE Employees SET Name = ?, Salary = ?, Department = ? WHERE SSN = ?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, employee.getName());
				preparedStatement.setDouble(2, employee.getSalary());
				preparedStatement.setInt(3, employee.getDepartment());
				preparedStatement.setInt(4, employee.getSsn());
				
				int rowAffected = preparedStatement.executeUpdate();
				System.out.println("Rows updated: " + rowAffected);
				connection.close();
				isUpdated  = true;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isUpdated;
	}

	public boolean deleteEmployee(int ssn) {
		boolean isDeleted  = false;
		try {
			Connection connection = dataSource.getConnection();
			if(connection != null) {
				System.out.println(String.format("Connected to database %s " + "successfully.", connection.getCatalog()));
				
				String sql = "DELETE FROM Employees WHERE SSN = ?";
				PreparedStatement preparedStatement  = connection.prepareStatement(sql);
				preparedStatement.setInt(1, ssn);
				
				int rowAffected = preparedStatement.executeUpdate();
				System.out.println("Rows deleted: " + rowAffected);
				connection.close();
				isDeleted = true;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isDeleted;
	}

}
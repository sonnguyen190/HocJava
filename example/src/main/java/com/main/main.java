package com.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

import com.config.MySQLJDBCUtil;


public class main {

	public static void main(String[] args) {
		getMaxsalary(11);

	}

//	public static void select() {
//		try {
//			Connection connection = MySQLJDBCUtil.getConnection();
//			if(connection!= null) {
//				System.out.println(String.format("Connected to db succesfully"));
//				String sql = "select * from employees";
//				PreparedStatement preparedStatement = connection.prepareStatement(sql);
//				ResultSet resultset = preparedStatement.executeQuery();
//				
//				while(resultset.next()) {
//					System.out.println("SSN:"+resultset.getInt("SSN"));
//					System.out.println("Name_Employee:"+resultset.getString("Name_Employee"));
//					System.out.println("Salary:"+resultset.getDouble("Salary"));
//					System.out.println("Department:"+resultset.getInt("Department"));
//				}
//				connection.close();
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}

//	public static void update() {
//		try {
//			Connection connection = MySQLJDBCUtil.getConnection();
//			if(connection!= null) {
//				System.out.println(String.format("Connected to db succesfully"));
//				
//				String sql = "update employees set SSN = ?,Name_Employee=?,Salary = ?,Department=? where SSN=?";
//				PreparedStatement preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setInt(1, 11);
//				preparedStatement.setString(2, "Muhahahahaha");
//				preparedStatement.setDouble(3, 1212);
//				preparedStatement.setInt(4, 2121);
//				preparedStatement.setInt(5, 1);
//				int row = preparedStatement.executeUpdate();
//				
//				System.out.println("row:"+row);
//				connection.close();
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}

//	public static void insertTransaction(int code, int deparment) {
//		try {
//			Connection connection = MySQLJDBCUtil.getConnection();
//			if (connection != null) {
//				System.out.println(String.format("Connected to db succesfully"));
//				connection.setAutoCommit(false);
//				String sql = "insert into Departments(Code,Name_Department,Budget) VALUES(?,?,?);";
//				PreparedStatement preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setInt(1, code);
//				preparedStatement.setString(2, "Muhahahahaha");
//				preparedStatement.setDouble(3, 1212);
//				int row = preparedStatement.executeUpdate();
//				System.out.println("row" + row);
//				if (row == 1) {
//					if (code == deparment) {
//						sql = "insert into Employees(SSN,Name_Employee,Salary,Department) VALUES(?,?,?,?);";
//						preparedStatement = connection.prepareStatement(sql);
//						preparedStatement.setInt(1, 21);
//						preparedStatement.setString(2, "join joij");
//						preparedStatement.setDouble(3, 1212);
//						preparedStatement.setInt(4, deparment);
//						row = preparedStatement.executeUpdate();
//						System.out.println("row" + row);
//						connection.commit();
//					} else {
//						connection.rollback();
//					}
//
//				}
//				connection.close();
//
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//	public static void callProceduce(int ssn) {
//		try {
//			Connection connection = MySQLJDBCUtil.getConnection();
//			if(connection!=null) {
//				System.out.println(String.format("Connected to db succesfully"));
//				String sql = "{ call getEmployeebyssn(?)}";
//				CallableStatement callableStatement = connection.prepareCall(sql);
//				callableStatement.setInt(1,ssn);
//				ResultSet resultSet = callableStatement.executeQuery();
//				while(resultSet.next()) {
//					System.out.println("SSN"+resultSet.getInt("SSN"));
//					System.out.println("Name_Employee"+resultSet.getString("Name_Employee"));
//					System.out.println("Salary"+resultSet.getDouble("Salary"));
//					System.out.println("Department"+resultSet.getInt("Department"));
//				}
//				connection.close();
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	public static void getMaxsalary(int ssn) {
		try {
			Connection connection = MySQLJDBCUtil.getConnection();
			if(connection!= null) {
				System.out.println(String.format("Connected to db succesfully"));
				String sql = "{ call getMaxsalary(?,?)}";
				CallableStatement callableStatement = connection.prepareCall(sql);
				callableStatement.setInt(1, ssn);
				callableStatement.registerOutParameter(2, Types.DOUBLE);
				int row = callableStatement.executeUpdate();
				if(row==1) {
					System.out.println("salarymax:"+callableStatement.getDouble("salaryMax"));
				}
				connection.close();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

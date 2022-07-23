package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.config.MySQLJDBCUtil;
import com.mysql.cj.xdevapi.PreparableStatement;

public class main {

	public static void main(String[] args) {
		update();

	}
	
	public static void select() {
		try {
			Connection connection = MySQLJDBCUtil.getConnection();
			if(connection!= null) {
				System.out.println(String.format("Connected to db succesfully"));
				String sql = "select * from employees";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultset = preparedStatement.executeQuery();
				
				while(resultset.next()) {
					System.out.println("SSN:"+resultset.getInt("SSN"));
					System.out.println("Name_Employee:"+resultset.getString("Name_Employee"));
					System.out.println("Salary:"+resultset.getDouble("Salary"));
					System.out.println("Department:"+resultset.getInt("Department"));
				}
				connection.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void update() {
		try {
			Connection connection = MySQLJDBCUtil.getConnection();
			if(connection!= null) {
				System.out.println(String.format("Connected to db succesfully"));
				
				String sql = "update employees set SSN = ?,Name_Employee=?,Salary = ?,Department=? where SSN=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, 11);
				preparedStatement.setString(2, "Muhahahahaha");
				preparedStatement.setDouble(3, 1212);
				preparedStatement.setInt(4, 2121);
				preparedStatement.setInt(5, 1);
				int row = preparedStatement.executeUpdate();
				
				System.out.println("row:"+row);
				connection.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}

package com.config;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySQLJDBCUtil {
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		try {
			FileInputStream fis = new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fis);
			
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			connection = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
}

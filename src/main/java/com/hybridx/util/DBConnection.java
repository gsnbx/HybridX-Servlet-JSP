package com.hybridx.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/hybridx";
	private static final String jdbcUsername = "root";
	private static final String jdbcPassword = "king";
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		return connection;
	}
}

package com.ers.v2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static Connection connection;
	private static boolean isConnected;
	
	public static Connection getConnection() throws SQLException {
			if(isConnected == true) {
				return connection;
			} else {
				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

				String url = "jdbc:postgresql://ec2-54-205-26-79.compute-1.amazonaws.com:5432/de5nca472dllg";
				String username = "viessrjskkiybp";
				String password = "3fb85ffec1693c6b2ef95f0e80f9bb9c636f074af010b0d1d1b0029ed1dc8628";

				if(connection == null || connection.isClosed()) {
					connection = DriverManager.getConnection(url, username, password);
				}

				return getH2Connection();
			}
	}
	
	public static Connection getH2Connection() {
		try {
			if(connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection("jdbc:h2:~/test");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}



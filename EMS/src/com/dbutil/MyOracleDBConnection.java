package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOracleDBConnection {

private static Connection connection;
	
	public static Connection openConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="EMS";
		String password="6686";
		connection=DriverManager.getConnection(url, username, password);
		return connection;
		
	}

}

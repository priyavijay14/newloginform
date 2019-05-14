package com.priya.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//System.out.println("CONNECTED");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver not loaded");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public Connection OpenConnection() throws SQLException {
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@Oracle02:1521:Xe",
						"training","training123");
		System.out.println(con);
		return con;
	}

	
	public void closeConnection(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		if(con!=null) {
			con.close();
		}
		
	}

}
           


     



 












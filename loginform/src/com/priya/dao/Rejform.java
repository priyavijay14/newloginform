package com.priya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.priya.model.Registerbean;

  
public class Rejform extends DBConnection{
	
	

	public int insert(Registerbean values) throws SQLException {	
		Connection con =null;
		con=OpenConnection();
		String a=values.getUsername();
		String b=values.getPassword();
		String c=values.getCpassword();
		int d=values.getNumber();
		System.out.println("dao username is "+ a);
		System.out.println("dao pass is "+ b);
		System.out.println("dao confirm pass is "+ c);
		System.out.println("dao numbers is "+ d);
		PreparedStatement insert=con.prepareStatement("insert into structure_123 values(?,?,?,?)");
		  
		insert.setString(1, values.getUsername());
		insert.setString(2, values.getPassword());
		insert.setString(3,values.getCpassword());
		insert.setInt(4, values.getNumber());	
		
		int i = insert.executeUpdate(); // 1-pass 0-fail
		      
		if(i==1) {
			System.out.println("record inserted succesfully");
		    return 1;
		}else {
			System.out.println("record  not inserted ")	;
		    return 0;	
		}
		// TODO Auto-generated method stub
		
		
	}
	

}

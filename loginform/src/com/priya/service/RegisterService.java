package com.priya.service;

import java.sql.SQLException;

import com.priya.model.Registerbean;

public interface RegisterService {
	public int insert(Registerbean values) throws SQLException ;
 
}

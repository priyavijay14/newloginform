package com.priya.serviceimpl;

import java.sql.SQLException;

import com.priya.dao.Rejform;
import com.priya.model.Registerbean;

public class RegisterServiceImpl {
	
	  Rejform dao=new Rejform();
	  
	  public int insertservice(Registerbean data) {
		  try {
			
			  
			int status = dao.insert(data); //dao call panurathu 
				if(status==1) {
					return 1;
				}else {
					return 0;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return 0;
		  
	  }
	

}

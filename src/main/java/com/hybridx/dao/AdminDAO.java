package com.hybridx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hybridx.model.Admin;

import com.hybridx.util.DBConnection;

public class AdminDAO {
	

	DBConnection dbc = new DBConnection();
	Connection connection = dbc.getConnection();
	
	public Admin Login(String email, String password) {
		Admin admin=null;
		try {
			PreparedStatement ps = connection.prepareStatement("select * from admin where email=? and Password=?");
			ps.setString(1, email);
			ps.setString(2, password);			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String mail = rs.getString("email");				
				admin = new Admin(id, name, mail);
			}
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}		
		return admin;
	}
}

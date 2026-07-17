package com.hybridx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hybridx.model.Athlete;
import com.hybridx.util.DBConnection;

public class AthleteDAO{
	
	DBConnection dbc = new DBConnection();
	Connection connection = dbc.getConnection();
	
	public Athlete Login(String email, String password) {
		Athlete athlete = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from athlete where email=? and Password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String mail = rs.getString("email");
				
				athlete = new Athlete(id, name, mail);
			}
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		
		
		return athlete;
	}
}

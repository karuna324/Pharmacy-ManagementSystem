package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import model.RemoveMedicine;

public class RemoveMedicineDAO {
	DbConnection db = new DbConnection();
	public int registerUserPrepaedStatement (RemoveMedicine removemedicine) { 
		try {String query = "delete from medicine where name =?;";
		PreparedStatement st = db.con.prepareStatement (query);
		st.setString(1, removemedicine.getName()); 
		
		
		return db.manipulate(st);
		} 
		catch (SQLException e) { e.printStackTrace(); return 0;
		}
	}
	
	
	public List<RemoveMedicine> getAllUser() {
		String query;
		query = "select * from admin"; 
		
		db = new DbConnection();
		ResultSet rs = db.retrieve (query);
		List<RemoveMedicine> lstMedicines = new ArrayList<RemoveMedicine>();
		try {
		while (rs.next()) {
			RemoveMedicine removemedicine = new RemoveMedicine();
			removemedicine.setMedicineid(rs.getInt("medicineid"));
			removemedicine.setName (rs.getString("name"));
			removemedicine.setCost(rs.getString("cost"));
			
			lstMedicines.add(removemedicine);
		}
		} catch (Exception ex) {
		System.out.println("Error" + ex);
		}
		return lstMedicines;
	}

}

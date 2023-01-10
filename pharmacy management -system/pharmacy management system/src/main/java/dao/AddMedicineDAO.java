package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import database.DbConnection;
import model.AddMedicine;

public class AddMedicineDAO {
	DbConnection db = new DbConnection();
	public int registerMedicinePrepaedStatement (AddMedicine addmedicine) { 
		try {String query = "insert into medicine (name, cost) values (?,?)";
		PreparedStatement st = db.con.prepareStatement (query);
		st.setString(1, addmedicine.getName()); 
		st.setString(2, addmedicine.getCost());
		
		return db.manipulate(st);
		} 
		catch (SQLException e) { e.printStackTrace(); return 0;
		}
	}
	
	
	public List<AddMedicine> getAllMedicine() {
		String query;
		query = "select * from medicine"; 
		
		db = new DbConnection();
		ResultSet rs = db.retrieve (query);
		List<AddMedicine> lstMedicines = new ArrayList<AddMedicine>();
		try {
		while (rs.next()) {
			AddMedicine addmedicine = new AddMedicine();
			addmedicine.setMedicineid(rs.getInt("medicineid"));
			addmedicine.setName (rs.getString("name"));
			addmedicine.setCost(rs.getString("cost"));
			
			lstMedicines.add(addmedicine);
		}
		} catch (Exception ex) {
		System.out.println("Error" + ex);
		}
		return lstMedicines;
	}

}

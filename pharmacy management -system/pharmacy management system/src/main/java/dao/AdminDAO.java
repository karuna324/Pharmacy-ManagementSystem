package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import database.DbConnection;
import model.Admin;

public class AdminDAO {
	DbConnection db = new DbConnection();
	public int registerUserPrepaedStatement (Admin admin) { 
		try {String query = "insert into admin (name, mobile, email, address, username, password) values (?,?,?, ?, ?, ?)";
		PreparedStatement st = db.con.prepareStatement (query);
		st.setString(1, admin.getName()); 
		st.setString(2, admin.getMobile());
		st.setString(3, admin.getEmail());
		st.setString(4, admin.getAddress());
		st.setString(5, admin.getUsername());
		st.setString(6, admin.getPassword());
		return db.manipulate(st);
		} 
		catch (SQLException e) { e.printStackTrace(); return 0;
		}
	}
	
	// Login customer 
	public Admin loginCustomer(String username, String password) {
	String query;
	query = "select * from admin where username'" + username +
	"' and password = '" + password + "';";
	ResultSet rs =db.retrieve(query); 
	Admin admin = null;
	try {
	while (rs.next()) {
		admin = new Admin();
		admin.setAdminid(rs.getInt("adminid"));
		admin.setName(rs.getString("name"));
		admin.setMobile(rs.getString("mobile"));
		admin.setEmail(rs.getString("email"));
		admin.setAddress(rs.getString("address"));
		admin.setUsername(rs.getString("username"));
		admin.setPassword(rs.getString("password"));
	}
	} catch (Exception ex) { System.out.println("Error" + ex);
	}
	return admin;
	}
	
	public List<Admin> getAllUser() {
		String query;
		query = "select * from admin"; 
		
		db = new DbConnection();
		ResultSet rs = db.retrieve (query);
		List<Admin> lstCustomers = new ArrayList<Admin>();
		try {
		while (rs.next()) {
			Admin admin = new Admin();
			admin.setAdminid(rs.getInt("adminid"));
			admin.setName (rs.getString("name"));
			admin.setMobile(rs.getString("mobile"));
			admin.setEmail (rs.getString("email")); 
			admin.setAddress(rs.getString("address"));
			admin.setUsername(rs.getString("username"));
		lstCustomers.add(admin);
		}
		} catch (Exception ex) {
		System.out.println("Error" + ex);
		}
		return lstCustomers;
	}
	
}
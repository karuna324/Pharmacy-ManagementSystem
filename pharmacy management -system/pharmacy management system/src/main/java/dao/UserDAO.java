package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import database.DbConnection;
import model.User;

public class UserDAO {
	DbConnection db = new DbConnection();
	public int registerUserPrepaedStatement (User user) { 
		try {String query = "insert into user (name, mobile, email, address, username, password) values (?,?,?, ?, ?, ?)";
		PreparedStatement st = db.con.prepareStatement (query);
		st.setString(1, user.getName()); 
		st.setString(2, user.getMobile());
		st.setString(3, user.getEmail());
		st.setString(4, user.getAddress());
		st.setString(5, user.getUsername());
		st.setString(6, user.getPassword());
		return db.manipulate(st);
		} 
		catch (SQLException e) { e.printStackTrace(); return 0;
		}
	}
	
	// Login customer 
	public User loginCustomer(String username, String password) {
	String query;
	query = "select * from user where username'" + username +
	"' and password = '" + password + "';";
	ResultSet rs =db.retrieve(query); 
	User user = null;
	try {
	while (rs.next()) {
	user = new User();
	user.setUserid(rs.getInt("userid"));
	user.setName(rs.getString("name"));
	user.setMobile(rs.getString("mobile"));
	user.setEmail(rs.getString("email"));
	user.setAddress(rs.getString("address"));
	user.setUsername(rs.getString("username"));
	user.setPassword(rs.getString("password"));
	}
	} catch (Exception ex) { System.out.println("Error" + ex);
	}
	return user;
	}
	
	public List<User> getAllUser() {
		String query;
		query = "select * from user"; 
		
		db = new DbConnection();
		ResultSet rs = db.retrieve (query);
		List<User> lstCustomers = new ArrayList<User>();
		try {
		while (rs.next()) {
		User user = new User();
		user.setUserid(rs.getInt("userid"));
		user.setName (rs.getString("name"));
		user.setMobile(rs.getString("mobile"));
		user.setEmail (rs.getString("email")); 
		user.setAddress(rs.getString("address"));
		user.setUsername(rs.getString("username"));
		lstCustomers.add(user);
		}
		} catch (Exception ex) {
		System.out.println("Error" + ex);
		}
		return lstCustomers;
	}
	
}
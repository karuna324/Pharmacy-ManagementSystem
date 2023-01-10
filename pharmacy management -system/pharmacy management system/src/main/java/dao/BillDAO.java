package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import database.DbConnection;
import model.Bill;

public class BillDAO {
	DbConnection db = new DbConnection();
	public int BillPrepaedStatement (Bill bill) { 
		try {String query = "insert into bill (customer,date,totalprice, qty,medicine) values (?,?,?,?,?)";
		PreparedStatement st = db.con.prepareStatement (query);
		st.setString(1, bill.getCustomer()); 
		st.setString(2, bill.getDate());
		st.setDouble(3, (double) bill.getTotalPrice());
		st.setInt(4, (int) bill.getQty());
		st.setString(5, bill.getMedicine());
		
		
		return db.manipulate(st);
		} 
		catch (SQLException e) { e.printStackTrace(); return 0;
		}
	}
	
	
	public List<Bill> getBill() {
		String query;
		query = "select * from bill"; 
		
		db = new DbConnection();
		ResultSet rs = db.retrieve (query);
		List<Bill> lstBill = new ArrayList<Bill>();
		try {
		while (rs.next()) {
			Bill bill = new Bill();
			bill.setBillid(rs.getInt("billid"));
			bill.setCustomer (rs.getString("name"));
			bill.setDate(rs.getString("date"));
			bill.setTotalPrice(rs.getDouble("totalprice"));
			bill.setQty(rs.getDouble("qty"));
			bill.setMedicine(rs.getString("medicine"));
			
			lstBill.add(bill);
		}
		} catch (Exception ex) {
		System.out.println("Error" + ex);
		}
		return lstBill;
	}

}

package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import dao.UserDAO;
import database.DbConnection;

/**
 * Servlet implementation class LoginController
 */
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		User isLogin=login(username,password);
		HttpSession session=request.getSession();
		
		if(isLogin!=null) {
			session.setAttribute("username", username);
			List<User> lstCustomer=getAllUser();
			
			if(lstCustomer.size()>0) {
				request.setAttribute("lstCustomer", lstCustomer);
			} else {
				request.setAttribute("lstCustomers", null);
			}
			
			RequestDispatcher rd= request.getRequestDispatcher("/view/AdminDashboard.jsp");
			rd.forward(request,response);
		} else {
			request.setAttribute("status", "failed");
			RequestDispatcher rd= request.getRequestDispatcher("/view/AdminLogin.jsp");
			rd.forward(request, response);
		}

	}
	public User login(String username, String password) {
		DbConnection db = new DbConnection();

		String query;
		query = "select * from admin where username ='" + username +
		"' and password = '" + password + "';";
		ResultSet rs =db.retrieve (query); 
		User customer = null;
		try {
		while (rs.next()) {
		customer = new User();
		customer.setUserid(rs.getInt("adminid"));
		customer.setName(rs.getString("name"));
		customer.setMobile(rs.getString("mobile"));
		customer.setEmail(rs.getString("email"));
		customer.setAddress(rs.getString("address"));
		customer.setUsername(rs.getString("username"));
		}
		} catch (Exception ex) { System.out.println("Error" + ex);
		}
		return customer;
		}

	private List<User> getAllUser(){
		UserDAO userDao=new UserDAO();
		List<User> lstCustomer = userDao.getAllUser();
		return lstCustomer;
	}

}
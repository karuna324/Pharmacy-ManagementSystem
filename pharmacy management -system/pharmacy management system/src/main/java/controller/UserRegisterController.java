package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDAO;


/**
 * Servlet implementation class RegisterController
 */
public class UserRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterController() {
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
		
		userDao = new UserDAO();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("txtName");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String username=request.getParameter("username");
		String password=request.getParameter("password");

		User user= new User(name,mobile, email, address, username, password);
		try {
			int insert=userDao.registerUserPrepaedStatement(user);
			if(insert==1) {
				RequestDispatcher rd= request.getRequestDispatcher("/view/UserLogin.jsp");
				rd.forward(request, response);
				
			} else {
				out.print("ERROR registering customer");
				RequestDispatcher rd= request.getRequestDispatcher("/view/UserRegister.jsp");
				rd.forward(request, response);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
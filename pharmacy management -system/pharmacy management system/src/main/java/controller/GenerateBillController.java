package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Bill;
import model.User;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDAO;
import dao.BillDAO;

/**
 * Servlet implementation class AddMedicineController
 */
public class GenerateBillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BillDAO billDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateBillController() {
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

		billDao = new BillDAO();
		PrintWriter out=response.getWriter();
		String customer=request.getParameter("Customer");
		String date=request.getParameter("date");
		double totalprice = Double.parseDouble(request.getParameter("totalprice"));
		int qty=Integer.parseInt(request.getParameter("qty"));
		String medicine=request.getParameter("medicine");
		
		

		Bill bill= new Bill(customer,date,totalprice,qty,medicine);
		try {
			int insert=billDao.BillPrepaedStatement(bill);
			if(insert==1) {
				RequestDispatcher rd= request.getRequestDispatcher("/view/Bill.jsp");
				rd.forward(request, response);
				
			} else {
				out.print("ERROR registering customer");
				RequestDispatcher rd= request.getRequestDispatcher("/view/UserDashboard.jsp");
				rd.forward(request, response);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

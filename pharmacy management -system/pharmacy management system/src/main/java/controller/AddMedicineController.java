package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddMedicine;
import model.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import dao.AddMedicineDAO;
import dao.AdminDAO;

/**
 * Servlet implementation class AddMedicineController
 */
public class AddMedicineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AddMedicineDAO addmedicineDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMedicineController() {
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

		addmedicineDao = new AddMedicineDAO();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("MName");
		String cost=request.getParameter("cost");
		

		AddMedicine addmedicine= new AddMedicine(name,cost);
		try {
			int insert=addmedicineDao.registerMedicinePrepaedStatement(addmedicine);
			if(insert==1) {
				RequestDispatcher rd= request.getRequestDispatcher("/view/AddMedicine.jsp");
				rd.forward(request, response);
				
			} else {
				out.print("ERROR registering customer");
				RequestDispatcher rd= request.getRequestDispatcher("/view/AdminDashboard.jsp");
				rd.forward(request, response);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

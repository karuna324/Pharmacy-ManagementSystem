package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddMedicine;
import model.RemoveMedicine;

import java.io.IOException;
import java.io.PrintWriter;

import dao.AddMedicineDAO;
import dao.RemoveMedicineDAO;

/**
 * Servlet implementation class RemoveMedicineController
 */
public class RemoveMedicineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RemoveMedicineDAO removemedicineDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveMedicineController() {
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
		removemedicineDao = new RemoveMedicineDAO();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("MName");
		

		RemoveMedicine removemedicine= new RemoveMedicine(name);
		try {
			int delete=removemedicineDao.registerUserPrepaedStatement(removemedicine);
			if(delete==1) {
				RequestDispatcher rd= request.getRequestDispatcher("/view/AdminDashboard.jsp");
				rd.forward(request, response);
				
			} else {
				out.print("ERROR registering customer");
				RequestDispatcher rd= request.getRequestDispatcher("/view/RemoveMedicine.jsp");
				rd.forward(request, response);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

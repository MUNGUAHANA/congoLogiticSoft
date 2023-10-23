package com.uniquedeveloper.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class index
 */
@WebServlet("/Journal")
public class journal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("date");
		String num_compte=request.getParameter("numCompt");
		String libelle =request.getParameter("libelle");
		String debit =request.getParameter("debit");
		String credit =request.getParameter("credit");
		
		
		RequestDispatcher dispatcher =null;
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LOGISTICOSOFT?useSSL=false", "root","");
			PreparedStatement PS=conn.prepareStatement("insert into Journal_stock(date,num_compte,libelle,debit,"
					+ "credit) values(?,?,?,?,?)");
			PS.setString(1, date);
			PS.setString(2, num_compte);
			PS.setString(3, libelle);
			PS.setString(4, debit);
			PS.setString(5, credit);
		
			int rowcount1=PS.executeUpdate();
			dispatcher=request.getRequestDispatcher("index.jsp");
			if(rowcount1>0) {
				request.setAttribute("status", "Sucess");
				dispatcher= request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "Failed");
				dispatcher=request.getRequestDispatcher("journal.java");
			}
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

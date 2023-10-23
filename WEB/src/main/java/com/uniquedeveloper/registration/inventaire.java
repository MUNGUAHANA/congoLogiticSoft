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
@WebServlet("/INV")
public class inventaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("date");
		String nom_article=request.getParameter("name");
		String reference =request.getParameter("reference");
		String modele =request.getParameter("model");
		String description =request.getParameter("description");
		String quantite_stock_invetaire =request.getParameter("quantite");
		String prix_piece =request.getParameter("prix");
		
		RequestDispatcher dispatcher =null;
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LOGISTICOSOFT?useSSL=false", "root","");
			PreparedStatement PS=conn.prepareStatement("insert into Invetaire(date,nom_article,reference,modele,"
					+ "description,quantite_stock_invetaire,prix_piece) values(?,?,?,?,?,?,?)");
			PS.setString(1, date);
			PS.setString(2, nom_article);
			PS.setString(3, reference);
			PS.setString(4, modele);
			PS.setString(5, description);
			PS.setString(6, quantite_stock_invetaire);
			PS.setString(7, prix_piece);
			
			int rowcount1=PS.executeUpdate();
			dispatcher=request.getRequestDispatcher("index.jsp");
			if(rowcount1>0) {
				request.setAttribute("status", "Sucess");
				dispatcher= request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "Failed");
				dispatcher=request.getRequestDispatcher("inventaire.java");
			}
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

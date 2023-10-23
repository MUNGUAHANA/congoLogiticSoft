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
@WebServlet("/Output")
public class output extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("date");
		String designation_sortie=request.getParameter("designation");
		String quantite_bon_sortie =request.getParameter("quantite");
		String prix_unitaire_bon_sortie =request.getParameter("prixUnit");
		String prix_total_bon_sortie =request.getParameter("totPrice");
		String commentaire_sorrtie=request.getParameter("commentaire");
		
		
		RequestDispatcher dispatcher =null;
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LOGISTICOSOFT?useSSL=false", "root","");
			PreparedStatement PS=conn.prepareStatement("insert into Bon_sortie(date,designation_sortie,quantite_bon_sortie,prix_unitaire_bon_sortie,"
					+ "prix_total_bon_sortie,commentaire_sorrtie) values(?,?,?,?,?,?)");
			PS.setString(1, date);
			PS.setString(2, designation_sortie);
			PS.setString(3, quantite_bon_sortie);
			PS.setString(4, prix_unitaire_bon_sortie);
			PS.setString(5, prix_total_bon_sortie);
			PS.setString(6, commentaire_sorrtie);
		
			int rowcount1=PS.executeUpdate();
			dispatcher=request.getRequestDispatcher("index.jsp");
			if(rowcount1>0) {
				request.setAttribute("status", "Sucess");
				dispatcher= request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "Failed");
				dispatcher=request.getRequestDispatcher("output.java");
			}
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

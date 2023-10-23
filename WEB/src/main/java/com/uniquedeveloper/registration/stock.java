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
@WebServlet("/Stock")
public class stock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("date");
		String name=request.getParameter("name");
		String valeur_entree =request.getParameter("entreeVal");
		String quantite_entree =request.getParameter("entreeQuant");
		String prix_unitaire_entree =request.getParameter("prixEntree");
		String valeur_sortie =request.getParameter("sortieVal");
		String quatntite_sortie =request.getParameter("sortieQuant");
		String prix_unitaire_sortie =request.getParameter("prixSortie");
		String valeur_stock =request.getParameter("stockVal");
		String qunatité_stock=request.getParameter("stockQuant");
		String prix_unitaire_stock=request.getParameter("prixStock");
		String commentaire=request.getParameter("comment");
		
		
		RequestDispatcher dispatcher =null;
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LOGISTICOSOFT?useSSL=false", "root","");
			PreparedStatement PS=conn.prepareStatement("insert into Fiche_de_stock(date,name,valeur_entree,quantite_entree,"
					+ "prix_unitaire_entree,valeur_sortie,quatntite_sortie,prix_unitaire_sortie,valeur_stock,qunatité_stock,prix_unitaire_stock"
					+ ",commentaire) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			PS.setString(1, date);
			PS.setString(2, name);
			PS.setString(3, valeur_entree);
			PS.setString(4, quantite_entree);
			PS.setString(5, prix_unitaire_entree);
			PS.setString(6, valeur_sortie);
			PS.setString(7, quatntite_sortie);
			PS.setString(8, prix_unitaire_sortie);
			PS.setString(9, valeur_stock);
			PS.setString(10, qunatité_stock);
			PS.setString(11, prix_unitaire_stock);
			PS.setString(12, commentaire);
		
			int rowcount1=PS.executeUpdate();
			dispatcher=request.getRequestDispatcher("index.jsp");
			if(rowcount1>0) {
				request.setAttribute("status", "Sucess");
				dispatcher= request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "Failed");
				dispatcher=request.getRequestDispatcher("Stock.java");
			}
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

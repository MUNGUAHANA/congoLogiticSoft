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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Uname=request.getParameter("name");
		String Umail=request.getParameter("email");
		String pass_word=request.getParameter("pass");
		String Umobile=request.getParameter("contact");
		RequestDispatcher dispatcher =null;
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LOGISTICOSOFT?useSSL=false", "root","");
			PreparedStatement PS=conn.prepareStatement("insert into users(Uname,pass_word,Umail,Umobile) values(?,?,?,?)");
			PS.setString(1, Uname);
			PS.setString(2, pass_word);
			PS.setString(3, Umail);
			PS.setString(4, Umobile);
			
			int rowcount=PS.executeUpdate();
			dispatcher=request.getRequestDispatcher("registration.jsp");
			if(rowcount>0) {
				request.setAttribute("status", "Sucess");
			}else {
				request.setAttribute("status", "Failed");
			}
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}

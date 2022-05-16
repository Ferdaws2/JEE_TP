package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shared.AbonnementOperations;

@WebServlet("/DesabonnementController")
public class DesabonnementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AbonnementOperations abonneoperation ;
	
	 @Override
	    public void init() throws ServletException {
	    	abonneoperation = new AbonnementOperations();
	    }   

       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int clubid = Integer.parseInt(request.getParameter("idClub"));
		abonneoperation.desabonnement(clubid);
		response.sendRedirect(request.getContextPath()+"/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

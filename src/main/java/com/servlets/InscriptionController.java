package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projet.Abonnement;
import com.shared.AbonnementOperations;

@WebServlet("/inscription")
public class InscriptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int clubid;
	private AbonnementOperations abonneoperation ;
	
    @Override
    public void init() throws ServletException {
    	abonneoperation = new AbonnementOperations();
    }   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        clubid = Integer.parseInt(request.getParameter("idClub"));
		request.setAttribute("clubId", clubid);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/inscription.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("lastname");
		String prenom = request.getParameter("firstname");
		Abonnement abn = new Abonnement(nom, prenom, new Date());
		int i = abonneoperation.nouvelabonnement(clubid, abn );
		if (i == 1) {
			
			response.sendRedirect(request.getContextPath()+"/");
			
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/inscription.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}

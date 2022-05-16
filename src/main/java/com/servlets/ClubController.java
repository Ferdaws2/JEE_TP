package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projet.Club;
import com.projet.ClubDataShow;
import com.shared.ClubOperations;

@WebServlet("")
public class ClubController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private ClubOperations cluboperations;
    
    
    @Override
    public void init() throws ServletException {
    	cluboperations = new ClubOperations();
    }
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ClubDataShow> clubs = cluboperations.getAllClubs();
		request.setAttribute("clubList", clubs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/index.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

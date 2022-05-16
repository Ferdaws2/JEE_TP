package com.shared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionObject {
	
	private static String URL ="jdbc:mysql://localhost:3306/clubsesi";
	private static String USERNAME ="root";
	private static String PASSWORD ="";
	
	
	
    public static Connection getConnexion() {
    	Connection connexion = null;
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return connexion;
    }

}

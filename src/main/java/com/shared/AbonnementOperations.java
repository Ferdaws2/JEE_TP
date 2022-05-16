package com.shared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.projet.Abonnement;
import com.projet.Club;
import com.projet.ClubDataShow;

public class AbonnementOperations {
	
	public int nouvelabonnement(int idclub,Abonnement abonnement) {
        try  {
        	Connection connexion = ConnexionObject.getConnexion();
			PreparedStatement statment = connexion.prepareStatement("insert into Abonnement values(?,?,?,?)");
			statment.setInt(1, idclub);
			statment.setString(2, abonnement.getNomAbonne());
			statment.setString(3, abonnement.getPrenomAbonne());
			statment.setDate(4, convertjavadatetosql(abonnement.getDateAbonnement()));
			
			return statment.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return -1;
		
	}
	public void desabonnement(int idclub) {
		try  {
        	Connection connexion = ConnexionObject.getConnexion();
			PreparedStatement statment = connexion.prepareStatement("delete from  Abonnement where idclub = ?");
			statment.setInt(1, idclub);
			statment.execute();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//une méthode qui nous permet de convertir la date de java à sql
	private java.sql.Date convertjavadatetosql(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate ;
		
	}
}

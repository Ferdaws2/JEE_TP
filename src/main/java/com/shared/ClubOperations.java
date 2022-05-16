package com.shared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.projet.Club;
import com.projet.ClubDataShow;

public class ClubOperations {
	public List<ClubDataShow> getAllClubs() {
		
		List<ClubDataShow> clubs = new ArrayList<>();
		
		try (Connection connexion = ConnexionObject.getConnexion()) {
			
			PreparedStatement statment = connexion.prepareStatement("select * from club");
			ResultSet result = statment.executeQuery();
			
			while(result.next()) {
				int idClub = result.getInt("idClub");
				String nomClub = result.getString("nomClub");
				String nomPresident = result.getString("nomPresident");
				Date dateCreation = result.getDate("dateCreation");
			clubs.add(new ClubDataShow (new Club(idClub, nomClub, nomPresident, dateCreation),checkinscription(idClub)));	
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clubs;
		
		
	}

	private boolean checkinscription(int idClub) {
		// TODO Auto-generated method stub
try (Connection connexion = ConnexionObject.getConnexion()) {
			
			PreparedStatement statment = connexion.prepareStatement("select * from Abonnement where idclub = ?");
			statment.setInt(1, idClub);
			ResultSet result = statment.executeQuery();
			if (result.next())
				return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

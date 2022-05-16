package com.projet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClubDataShow {
	private int idClub;
	private String nomClub;
	private String nomPresident;
	private String dateCreation;
	private boolean status;
	
	public ClubDataShow() {	}
	
	public ClubDataShow(Club club, boolean status) {
		this.idClub = club.getIdclub();
		this.nomClub = club.getNomClub();
		this.nomPresident = club.getNomPresident();
		this.setDateCreation(club.getDateCreation());
		this.status = status;
	}
	
	

	public ClubDataShow(int idClub, String nomClub, String nomPresident, Date dateCreation) {
		this.idClub = idClub;
		this.nomClub = nomClub;
		this.nomPresident = nomPresident;
		this.setDateCreation(dateCreation);
	}



	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}

	public String getNomClub() {
		return nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}

	public String getNomPresident() {
		return nomPresident;
	}

	public void setNomPresident(String nomPresident) {
		this.nomPresident = nomPresident;
	}

	public String getDateCreation() {
		return dateCreation;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setDateCreation(Date localDate) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new	SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(localDate);
		this.dateCreation = date;
	}

}

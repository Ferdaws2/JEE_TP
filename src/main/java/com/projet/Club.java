package com.projet;

import java.util.Date;

public class Club {
	private int idclub;
	private String nomClub;
	private String nomPresident;
	private Date dateCreation;
	
	
	public Club() {	}


	public Club(int idclub, String nomClub, String nomPresident, Date dateCreation) {
		this.idclub = idclub;
		this.nomClub = nomClub;
		this.nomPresident = nomPresident;
		this.dateCreation = dateCreation;
	}


	public int getIdclub() {
		return idclub;
	}


	public void setIdclub(int idclub) {
		this.idclub = idclub;
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


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
}

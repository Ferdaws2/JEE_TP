package com.projet;

import java.util.Date;

public class Abonnement {
	private String nomAbonne;
	private String prenomAbonne;
	private Date dateAbonnement;
	
	public Abonnement() {}

	public Abonnement(String nomAbonne, String prenomAbonne, Date dateAbonnement) {
		this.nomAbonne = nomAbonne;
		this.prenomAbonne = prenomAbonne;
		this.dateAbonnement = dateAbonnement;
	}

	public String getNomAbonne() {
		return nomAbonne;
	}

	public void setNomAbonne(String nomAbonne) {
		this.nomAbonne = nomAbonne;
	}

	public String getPrenomAbonne() {
		return prenomAbonne;
	}

	public void setPrenomAbonne(String prenomAbonne) {
		this.prenomAbonne = prenomAbonne;
	}

	public Date getDateAbonnement() {
		return dateAbonnement;
	}

	public void setDateAbonnement(Date dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}

	
}

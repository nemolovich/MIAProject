package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;

import com.mia.banque.model.IClient;
import com.mia.banque.model.ICompte;


public class Client implements IClient {

	private String nom;
	private String prenom;
	private String adresse;

	private List<ICompte> listComptes;


	@Override
	public String getNom() {
		return this.nom;
	}
	
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String getPrenom() {
		return this.prenom;
	}
	
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String getAdresse() {
		return this.adresse;
	}
	
	@Override
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	@Override
	public List<ICompte> getComptes() {
		if (this.listComptes == null) {
			this.listComptes = new ArrayList<ICompte>();
		}
		return this.listComptes;
	}
	
	@Override
	public void setComptes(List<ICompte> listComptes) {
		this.listComptes = listComptes;
	}


}
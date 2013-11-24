package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.IClient;
import com.mia.banque.model.ICompte;

public class Client implements IClient {

/**
 * /[PropertyDeclaration]]
 */
	private List<ICompte> listCompte;

/**
 * /[PropertyAccess]]
 */
	public List<ICompte> getComptes() {
		if (this.listCompte == null) {
			this.listCompte = new ArrayList<ICompte>();
		}
		return this.listCompte;
	}
	
	public void setComptes(List<ICompte> newValue) {
		this.listCompte = newValue;
	}
 
}
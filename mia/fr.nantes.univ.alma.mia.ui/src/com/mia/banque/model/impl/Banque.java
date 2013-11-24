package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.IBanque;
import com.mia.banque.model.IClient;

public class Banque implements IBanque {

/**
 * /[PropertyDeclaration]]
 */
	private List<IClient> listClient;

/**
 * /[PropertyAccess]]
 */
	public List<IClient> getClients() {
		if (this.listClient == null) {
			this.listClient = new ArrayList<IClient>();
		}
		return this.listClient;
	}
	
	public void setClients(List<IClient> newValue) {
		this.listClient = newValue;
	}
 
}
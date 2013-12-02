package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;

import com.mia.banque.model.IBanque;
import com.mia.banque.model.IClient;


public class Banque implements IBanque {


	private List<IClient> listClients;



	@Override
	public List<IClient> getClients() {
		if (this.listClients == null) {
			this.listClients = new ArrayList<IClient>();
		}
		return this.listClients;
	}
	
	@Override
	public void setClients(List<IClient> listClients) {
		this.listClients = listClients;
	}


}
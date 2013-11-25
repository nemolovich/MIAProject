package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.ICompte;
import com.mia.banque.model.IOperation;


public class Compte implements ICompte {

	private String numero;

	private List<IOperation> listOperations;


	@Override
	public String getNumero() {
		return this.numero;
	}
	
	@Override
	public void setNumero(String numero) {
		this.numero = numero;
	}


	@Override
	public List<IOperation> getOperations() {
		if (this.listOperations == null) {
			this.listOperations = new ArrayList<IOperation>();
		}
		return this.listOperations;
	}
	
	@Override
	public void setOperations(List<IOperation> listOperations) {
		this.listOperations = listOperations;
	}


}
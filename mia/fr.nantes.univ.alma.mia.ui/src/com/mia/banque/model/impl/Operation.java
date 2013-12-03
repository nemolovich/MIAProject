package com.mia.banque.model.impl;


import com.mia.banque.model.IOperation;


public class Operation implements IOperation {

	private String numero;
	private String montant;



	@Override
	public String getNumero() {
		return this.numero;
	}
	
	@Override
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String getMontant() {
		return this.montant;
	}
	
	@Override
	public void setMontant(String montant) {
		this.montant = montant;
	}



	@Override
	public String toString() {
		return "[" + "Numero = " + this.numero + ", Montant = " + this.montant+ "]";
	}

}
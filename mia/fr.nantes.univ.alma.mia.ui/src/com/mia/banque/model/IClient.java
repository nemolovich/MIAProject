package com.mia.banque.model;

import java.util.List;

public interface IClient {

	public List<ICompte> getComptes();
	
	public void setComptes(List<ICompte> newValue);

}
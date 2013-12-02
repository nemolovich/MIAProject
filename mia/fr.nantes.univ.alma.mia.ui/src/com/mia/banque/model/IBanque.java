package com.mia.banque.model;

import java.util.List;


public interface IBanque {


	/**
	 * Returns the list of Clients of this model
	 * @return {@link List}<{@link IClient}> - The Clients
	 */ 
	public List<IClient> getClients();
	/**
	 * Set the list of Clients of this model
	 * @param listClients {@link List}<{@link IClient}> - The new Clients
	 */
	public void setClients(List<IClient> listClients);

}
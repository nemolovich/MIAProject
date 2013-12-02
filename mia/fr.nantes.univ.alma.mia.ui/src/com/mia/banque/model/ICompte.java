package com.mia.banque.model;

import java.util.List;


public interface ICompte {

	/**
	 * Returns the Numero property value
	 * @return {@link String} - The Numero property value
	 */
	public String getNumero();
	/**
	 * Set the Numero property value
	 * @param numero {@link String} - The new Numero value
	 */
	public void setNumero(String numero);

	/**
	 * Returns the list of Operations of this model
	 * @return {@link List}<{@link IOperation}> - The Operations
	 */ 
	public List<IOperation> getOperations();
	/**
	 * Set the list of Operations of this model
	 * @param listOperations {@link List}<{@link IOperation}> - The new Operations
	 */
	public void setOperations(List<IOperation> listOperations);

}
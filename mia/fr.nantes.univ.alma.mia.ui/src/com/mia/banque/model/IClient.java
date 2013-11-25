package com.mia.banque.model;

import java.util.List;

public interface IClient {

	/**
	 * Returns the Nom property value
	 * @return {@link String} - The Nom property value
	 */
	public String getNom();
	/**
	 * Set the Nom property value
	 * @param nom {@link String} - The new Nom value
	 */
	public void setNom(String nom);
	/**
	 * Returns the Prenom property value
	 * @return {@link String} - The Prenom property value
	 */
	public String getPrenom();
	/**
	 * Set the Prenom property value
	 * @param prenom {@link String} - The new Prenom value
	 */
	public void setPrenom(String prenom);
	/**
	 * Returns the Adresse property value
	 * @return {@link String} - The Adresse property value
	 */
	public String getAdresse();
	/**
	 * Set the Adresse property value
	 * @param adresse {@link String} - The new Adresse value
	 */
	public void setAdresse(String adresse);

	/**
	 * Returns the list of Comptes of this model
	 * @return {@link List}<{@link ICompte}> - The Comptes
	 */ 
	public List<ICompte> getComptes();
	/**
	 * Set the list of Comptes of this model
	 * @param listComptes {@link List}<{@link ICompte}> - The new Comptes
	 */
	public void setComptes(List<ICompte> listComptes);


}
package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.ICompte;
import com.mia.banque.model.IOperation;

public class Compte implements ICompte {

	private List<IOperation> listOperation;
	
	public List<IOperation> getOperations() {
		if (this.listOperation == null) {
			this.listOperation = new ArrayList<IOperation>();
		}
		return this.listOperation;
	}
	
	public void setOperations(List<IOperation> newValue) {
		this.listOperation = newValue;
	}

}
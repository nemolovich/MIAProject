package com.mia.banque.ui.controler.swt;

import org.eclipse.swt.widgets.Display;

import com.mia.banque.ui.controler.ICompteControler;
import com.mia.banque.ui.view.swt.CompteView;
import com.mia.banque.model.ICompte;
import com.mia.banque.model.IOperation;
;

public class CompteControler implements ICompteControler {

	private CompteView view;
	private ICompte model;

	public CompteControler(ICompte model) {
		this.model = model;
	}
	
	@Override
	public void initView() {
		Display display = Display.getDefault();
		
		this.view = new CompteView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}


	public void afficherOperation() {
		// Start of user code for afficherOperation
		if (this.view.operationsList.getSelection().length >0) {
			String operationSelection = this.view.operationsList.getSelection()[0];
			for (final IOperation aOperation : this.model.getOperations()) {
				if (aOperation.toString().equals(operationSelection)) { // TODO gerer un champ id plutot que utiliser toString()
					OperationControler operationControler = new OperationControler(aOperation);
					operationControler.initView();
				}
			}
		}
		// End of user code for afficherOperation
	}

	public void quitter() {
		// Start of user code for quitter
		//On veut fermer toutes les fenetres ouvertes
		Display.getCurrent().dispose();
		// End of user code for quitter
	}


}
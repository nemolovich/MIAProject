package com.mia.banque.ui.controler.swt;

import org.eclipse.swt.widgets.Display;

import com.mia.banque.ui.controler.IClientControler;
import com.mia.banque.ui.view.swt.ClientView;
import com.mia.banque.model.IClient;
import com.mia.banque.model.ICompte;
;

public class ClientControler implements IClientControler {

	private ClientView view;
	private IClient model;

	public ClientControler(IClient model) {
		this.model = model;
	}
	
	@Override
	public void initView() {
		Display display = Display.getDefault();
		
		this.view = new ClientView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}


	public void afficherCompte() {
		// Start of user code for afficherCompte
		if (this.view.comptesList.getSelection().length >0) {
			String compteSelection = this.view.comptesList.getSelection()[0];
			for (final ICompte aCompte : this.model.getComptes()) {
				if (aCompte.toString().equals(compteSelection)) { // TODO gerer un champ id plutot que utiliser toString()
					CompteControler compteControler = new CompteControler(aCompte);
					compteControler.initView();
				}
			}
		}
		// End of user code for afficherCompte
	}

	public void quitter() {
		// Start of user code for quitter
		//On veut fermer toutes les fenetres ouvertes
		Display.getCurrent().dispose();
		// End of user code for quitter
	}


}
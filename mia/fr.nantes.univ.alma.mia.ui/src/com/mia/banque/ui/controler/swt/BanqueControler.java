package com.mia.banque.ui.controler.swt;

import org.eclipse.swt.widgets.Display;

import com.mia.banque.ui.controler.IBanqueControler;
import com.mia.banque.ui.view.swt.BanqueView;
import com.mia.banque.model.IBanque;
import com.mia.banque.model.IClient;
;

public class BanqueControler implements IBanqueControler {

	private BanqueView view;
	private IBanque model;

	public BanqueControler(IBanque model) {
		this.model = model;
	}
	
	@Override
	public void initView() {
		Display display = Display.getDefault();
		
		this.view = new BanqueView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}


	public void afficherClient() {
		// Start of user code for afficherClient
		if (this.view.clientsList.getSelection().length >0) {
			String clientSelection = this.view.clientsList.getSelection()[0];
			for (final IClient aClient : this.model.getClients()) {
				if (aClient.toString().equals(clientSelection)) { // TODO gerer un champ id plutot que utiliser toString()
					ClientControler clientControler = new ClientControler(aClient);
					clientControler.initView();
				}
			}
		}
		// End of user code for afficherClient
	}

	public void quitter() {
		// Start of user code for quitter
		//On veut fermer toutes les fenetres ouvertes
		Display.getCurrent().dispose();
		// End of user code for quitter
	}


}
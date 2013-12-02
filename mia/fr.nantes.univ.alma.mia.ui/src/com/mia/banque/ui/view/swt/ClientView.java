package com.mia.banque.ui.view.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Group;

import com.mia.banque.ui.controler.IClientControler;
import com.mia.banque.ui.view.IClientView;
import com.mia.banque.model.IClient;
import com.mia.banque.model.ICompte;


public class ClientView extends Shell implements IClientView {

	private IClientControler controler;
	private IClient model;

	private Button btnAfficherCompte;
	private Button btnQuitter;

	public List comptesList;



	/**
	 * Create the shell.
	 * @param display
	 */
	public ClientView(Display display, IClient model, IClientControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		createContents();
	}
	
	@Override
	public void afficherCompte() {
		this.controler.afficherCompte();
	}
	@Override
	public void quitter() {
		this.controler.quitter();
	}


	private void createContents() {
		setText("Vue Client");
		setSize(458, 308);
		setLayout(new GridLayout(2, false));

		// Liste

		Group grpCompte = new Group(this, SWT.NONE);
		grpCompte.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		grpCompte.setText("Liste des Compte");
		grpCompte.setLayout(new GridLayout());

		this.comptesList = new List(grpCompte, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		this.comptesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		for (final ICompte elt : this.model.getComptes()) {
			this.comptesList.add(elt.toString());
		}

		
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));


		this.btnAfficherCompte = new Button(grpButtons, SWT.NONE);
		this.btnAfficherCompte.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.btnAfficherCompte.setText("afficherCompte");
		this.btnAfficherCompte.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				afficherCompte();
			}
		});

		this.btnQuitter = new Button(grpButtons, SWT.NONE);
		this.btnQuitter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.btnQuitter.setText("quitter");
		this.btnQuitter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				quitter();
			}
		});


	}
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
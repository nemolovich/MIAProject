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

import com.mia.banque.ui.controler.ICompteControler;
import com.mia.banque.ui.view.ICompteView;
import com.mia.banque.model.ICompte;
import com.mia.banque.model.IOperation;


public class CompteView extends Shell implements ICompteView {

	private ICompteControler controler;
	private ICompte model;

	private Button btnAfficherOperation;
	private Button btnQuitter;

	public List operationsList;



	/**
	 * Create the shell.
	 * @param display
	 */
	public CompteView(Display display, ICompte model, ICompteControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		createContents();
	}
	
	@Override
	public void afficherOperation() {
		this.controler.afficherOperation();
	}
	@Override
	public void quitter() {
		this.controler.quitter();
	}


	private void createContents() {
		setText("Vue Compte");
		setSize(458, 308);
		setLayout(new GridLayout(2, false));

		// Liste

		Group grpOperation = new Group(this, SWT.NONE);
		grpOperation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		grpOperation.setText("Liste des Operation");
		grpOperation.setLayout(new GridLayout());

		this.operationsList = new List(grpOperation, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		this.operationsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		for (final IOperation elt : this.model.getOperations()) {
			this.operationsList.add(elt.toString());
		}

		
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));


		this.btnAfficherOperation = new Button(grpButtons, SWT.NONE);
		this.btnAfficherOperation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.btnAfficherOperation.setText("afficherOperation");
		this.btnAfficherOperation.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				afficherOperation();
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
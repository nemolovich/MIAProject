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

import com.mia.banque.ui.controler.IBanqueControler;
import com.mia.banque.ui.view.IBanqueView;
import com.mia.banque.model.IBanque;
import com.mia.banque.model.IClient;


public class BanqueView extends Shell implements IBanqueView {

	private IBanqueControler controler;
	private IBanque model;

	private Button btnAfficherClient;
	private Button btnQuitter;

	public List clientsList;



	/**
	 * Create the shell.
	 * @param display
	 */
	public BanqueView(Display display, IBanque model, IBanqueControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		createContents();
	}
	
	@Override
	public void afficherClient() {
		this.controler.afficherClient();
	}
	@Override
	public void quitter() {
		this.controler.quitter();
	}


	private void createContents() {
		setText("Vue Banque");
		setSize(458, 308);
		setLayout(new GridLayout(2, false));



		// Liste

		Group grpClient = new Group(this, SWT.NONE);
		grpClient.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		grpClient.setText("Liste des Client");
		grpClient.setLayout(new GridLayout());

		this.clientsList = new List(grpClient, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		this.clientsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		for (final IClient elt : this.model.getClients()) {
			this.clientsList.add(elt.toString());
		}

		
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));


		this.btnAfficherClient = new Button(grpButtons, SWT.NONE);
		this.btnAfficherClient.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		this.btnAfficherClient.setText("afficherClient");
		this.btnAfficherClient.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				afficherClient();
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
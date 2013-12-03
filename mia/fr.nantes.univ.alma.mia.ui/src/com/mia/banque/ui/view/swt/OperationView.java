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

import com.mia.banque.ui.controler.IOperationControler;
import com.mia.banque.ui.view.IOperationView;
import com.mia.banque.model.IOperation;


public class OperationView extends Shell implements IOperationView {

	private IOperationControler controler;
	private IOperation model;

	private Button btnQuitter;




	/**
	 * Create the shell.
	 * @param display
	 */
	public OperationView(Display display, IOperation model, IOperationControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		createContents();
	}
	
	@Override
	public void quitter() {
		this.controler.quitter();
	}


	private void createContents() {
		setText("Vue Operation");
		setSize(458, 308);
		setLayout(new GridLayout(2, false));


		Label lblNumero = new Label(this, SWT.NONE);
		lblNumero.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblNumero.setText("Numero");

		Text numeroField = new Text(this, SWT.BORDER);
		numeroField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		numeroField.setText(this.model.getNumero());
	
		Label lblMontant = new Label(this, SWT.NONE);
		lblMontant.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblMontant.setText("Montant");

		Text montantField = new Text(this, SWT.BORDER);
		montantField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		montantField.setText(this.model.getMontant());
	

		// Liste

		
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));


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
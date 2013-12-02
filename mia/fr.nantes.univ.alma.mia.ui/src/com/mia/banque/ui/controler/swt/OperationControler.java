package com.mia.banque.ui.controler.swt;

import org.eclipse.swt.widgets.Display;

import com.mia.banque.ui.controler.IOperationControler;
import com.mia.banque.ui.view.swt.OperationView;
import com.mia.banque.model.IOperation;
;

public class OperationControler implements IOperationControler {

	private OperationView view;
	private IOperation model;

	public OperationControler(IOperation model) {
		this.model = model;
	}
	
	@Override
	public void initView() {
		Display display = Display.getDefault();
		
		this.view = new OperationView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}


	public void quitter() {

		//On veut fermer toutes les fenetres ouvertes
		Display.getCurrent().dispose();

	}


}
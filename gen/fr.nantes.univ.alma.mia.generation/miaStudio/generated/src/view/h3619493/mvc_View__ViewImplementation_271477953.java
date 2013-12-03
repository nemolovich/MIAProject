package view.h3619493;

import com.mia.formation.mvc.*;
import com.mia.metamodel.*;
import com.mia.openapi.*;
import com.mia.openapi.refactoring.model.*;
import com.mia.openapi.reflect.*;
import com.mia.resource.*;
import java.io.*;
import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.*;

@SuppressWarnings({"unused","unchecked","rawtypes","nls","serial",})
public class mvc_View__ViewImplementation_271477953 implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_View__ViewImplementation_271477953() {
		//Do nothing
	}

	//For internal use only
	mvc_View__ViewImplementation_271477953(int anyInt, List anyList) {
		List<java.lang.Integer> otherList = anyList;
		throw new java.lang.UnsupportedOperationException();
	}

	private static <T> T __check_arg__(java.lang.Class<T> expectedClass, Object argument) {
		T result = null;
		if (java.lang.Integer.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Integer(((Double) argument).intValue());
		} else if (java.lang.Float.class.equals(expectedClass) && argument instanceof Double) {
			result = (T) new java.lang.Float(((Double) argument).floatValue());
		} else {
			try {			
				result = expectedClass.cast(argument);
			} catch(Throwable ex) {
				throw new IllegalArgumentException(
						String.format(
								"Bad parameter type in call to %s. Found '%s' when expected '%s'.",
								"ViewImplementation", argument.getClass().getName(),
								expectedClass.getName()));
			}
		}
		return result;
	}


	public java.lang.Object evaluate(java.lang.Object[] _action_parameters) {
		return runAction(_action_parameters);
	}

	public String runAction(java.lang.Object[] _action_parameters) {
		if (_action_parameters.length != 3)
			throw new IllegalArgumentException("Wrong number of parameters in call to ''ViewImplementation''");

		final com.mia.formation.mvc.View current = __check_arg__(com.mia.formation.mvc.View.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.View current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuffer _template_buffer = new java.lang.StringBuffer();
_template_buffer.append("package com.mia.banque.ui.view.swt;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.SWT;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.events.SelectionAdapter;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.events.SelectionEvent;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.layout.GridData;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.layout.GridLayout;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Button;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Display;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Label;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Shell;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Text;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.List;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Group;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("import com.mia.banque.ui.controler.I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("Controler;");
_template_buffer.append('\n');
_template_buffer.append("import com.mia.banque.ui.view.I");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(";");
_template_buffer.append('\n');
_template_buffer.append("import com.mia.banque.model.I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append(";");
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ViewModelListImport"));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("public class ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" extends Shell implements I");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" {");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	private I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("Controler controler;");
_template_buffer.append('\n');
_template_buffer.append("	private I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append(" model;");
_template_buffer.append('\n');
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ButtonDeclaration"));_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ViewModelListDeclaration"));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	/**");
_template_buffer.append('\n');
_template_buffer.append("	 * Create the shell.");
_template_buffer.append('\n');
_template_buffer.append("	 * @param display");
_template_buffer.append('\n');
_template_buffer.append("	 */");
_template_buffer.append('\n');
_template_buffer.append("	public ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("(Display display, I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append(" model, I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("Controler controler) {");
_template_buffer.append('\n');
_template_buffer.append("		super(display, SWT.SHELL_TRIM);");
_template_buffer.append('\n');
_template_buffer.append("		this.model = model;");
_template_buffer.append('\n');
_template_buffer.append("		this.controler = controler;");
_template_buffer.append('\n');
_template_buffer.append("		");
_template_buffer.append('\n');
_template_buffer.append("		createContents();");
_template_buffer.append('\n');
_template_buffer.append("	}");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "MethodImplementation"));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	private void createContents() {");
_template_buffer.append('\n');
_template_buffer.append("		setText(\"Vue ");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("\");");
_template_buffer.append('\n');
_template_buffer.append("		setSize(458, 308);");
_template_buffer.append('\n');
_template_buffer.append("		setLayout(new GridLayout(2, false));");
_template_buffer.append('\n');
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ViewModelLabel"));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("		// Liste");
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ViewModelList"));_template_buffer.append('\n');
_template_buffer.append("		");
_template_buffer.append('\n');
_template_buffer.append("		Group grpButtons = new Group(this, SWT.NONE);");
_template_buffer.append('\n');
_template_buffer.append("		grpButtons.setLayout(new GridLayout(2, false));");
_template_buffer.append('\n');
_template_buffer.append("		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));");
_template_buffer.append('\n');
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ButtonImplementation"));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	}");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("	@Override");
_template_buffer.append('\n');
_template_buffer.append("	protected void checkSubclass() {");
_template_buffer.append('\n');
_template_buffer.append("		// Disable the check that prevents subclassing of SWT components");
_template_buffer.append('\n');
_template_buffer.append("	}");
_template_buffer.append('\n');
_template_buffer.append("}");
return _template_buffer.toString();

}
}

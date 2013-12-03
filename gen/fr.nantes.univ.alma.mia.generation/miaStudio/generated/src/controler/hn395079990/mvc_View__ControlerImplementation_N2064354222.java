package controler.hn395079990;

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
public class mvc_View__ControlerImplementation_N2064354222 implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_View__ControlerImplementation_N2064354222() {
		//Do nothing
	}

	//For internal use only
	mvc_View__ControlerImplementation_N2064354222(int anyInt, List anyList) {
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
								"ControlerImplementation", argument.getClass().getName(),
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
			throw new IllegalArgumentException("Wrong number of parameters in call to ''ControlerImplementation''");

		final com.mia.formation.mvc.View current = __check_arg__(com.mia.formation.mvc.View.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.View current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuffer _template_buffer = new java.lang.StringBuffer();
_template_buffer.append("package com.mia.banque.ui.controler.swt;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Display;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("import com.mia.banque.ui.controler.I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("Controler;");
_template_buffer.append('\n');
_template_buffer.append("import com.mia.banque.ui.view.swt.");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(";");
_template_buffer.append('\n');
_template_buffer.append("import com.mia.banque.model.I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append(";");
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ActionNextPageModelImport"));_template_buffer.append(";");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("public class ");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("Controler implements I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("Controler {");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	private ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" view;");
_template_buffer.append('\n');
_template_buffer.append("	private I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append(" model;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	public ");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append("Controler(I");
_template_buffer.append(manager.action(current, "ModelName"));_template_buffer.append(" model) {");
_template_buffer.append('\n');
_template_buffer.append("		this.model = model;");
_template_buffer.append('\n');
_template_buffer.append("	}");
_template_buffer.append('\n');
_template_buffer.append("	");
_template_buffer.append('\n');
_template_buffer.append("	@Override");
_template_buffer.append('\n');
_template_buffer.append("	public void initView() {");
_template_buffer.append('\n');
_template_buffer.append("		Display display = Display.getDefault();");
_template_buffer.append('\n');
_template_buffer.append("		");
_template_buffer.append('\n');
_template_buffer.append("		this.view = new ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("(display, this.model, this);");
_template_buffer.append('\n');
_template_buffer.append("		this.view.open();");
_template_buffer.append('\n');
_template_buffer.append("		this.view.layout();");
_template_buffer.append('\n');
_template_buffer.append("		");
_template_buffer.append('\n');
_template_buffer.append("		while (!this.view.isDisposed()) {");
_template_buffer.append('\n');
_template_buffer.append("			if (!display.readAndDispatch()) {");
_template_buffer.append('\n');
_template_buffer.append("				display.sleep();");
_template_buffer.append('\n');
_template_buffer.append("			}");
_template_buffer.append('\n');
_template_buffer.append("		}");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	}");
_template_buffer.append('\n');
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "ActionImplementation"));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("}");
return _template_buffer.toString();

}
}

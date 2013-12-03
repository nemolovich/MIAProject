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
public class mvc_Model__ModelViewList_1871658056 implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_Model__ModelViewList_1871658056() {
		//Do nothing
	}

	//For internal use only
	mvc_Model__ModelViewList_1871658056(int anyInt, List anyList) {
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
								"ModelViewList", argument.getClass().getName(),
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
			throw new IllegalArgumentException("Wrong number of parameters in call to ''ModelViewList''");

		final com.mia.formation.mvc.Model current = __check_arg__(com.mia.formation.mvc.Model.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.Model current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuffer _template_buffer = new java.lang.StringBuffer();
_template_buffer.append('\n');
_template_buffer.append("		Group grp");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" = new Group(this, SWT.NONE);");
_template_buffer.append('\n');
_template_buffer.append("		grp");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(".setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));");
_template_buffer.append('\n');
_template_buffer.append("		grp");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(".setText(\"Liste des ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("\");");
_template_buffer.append('\n');
_template_buffer.append("		grp");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(".setLayout(new GridLayout());");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("		this.");
_template_buffer.append(manager.action(current, "lowerName"));_template_buffer.append("sList = new List(grp");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(", SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);");
_template_buffer.append('\n');
_template_buffer.append("		this.");
_template_buffer.append(manager.action(current, "lowerName"));_template_buffer.append("sList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));");
_template_buffer.append('\n');
_template_buffer.append("		");
_template_buffer.append('\n');
_template_buffer.append("		for (final I");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" elt : this.model.get");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("s()) {");
_template_buffer.append('\n');
_template_buffer.append("			this.");
_template_buffer.append(manager.action(current, "lowerName"));_template_buffer.append("sList.add(elt.toString());");
_template_buffer.append('\n');
_template_buffer.append("		}");
_template_buffer.append('\n');

return _template_buffer.toString();

}
}

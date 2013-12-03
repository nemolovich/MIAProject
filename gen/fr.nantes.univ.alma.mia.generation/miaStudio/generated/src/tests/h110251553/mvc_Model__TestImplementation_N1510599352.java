package tests.h110251553;

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
public class mvc_Model__TestImplementation_N1510599352 implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_Model__TestImplementation_N1510599352() {
		//Do nothing
	}

	//For internal use only
	mvc_Model__TestImplementation_N1510599352(int anyInt, List anyList) {
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
								"TestImplementation", argument.getClass().getName(),
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
			throw new IllegalArgumentException("Wrong number of parameters in call to ''TestImplementation''");

		final com.mia.formation.mvc.Model current = __check_arg__(com.mia.formation.mvc.Model.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.Model current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuffer _template_buffer = new java.lang.StringBuffer();
_template_buffer.append("public static ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" createTest");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("() {");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	    ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" banque = new ");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append("();");
_template_buffer.append('\n');
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, new com.mia.openapi.CallN("CreateTestClient", new java.lang.Object[] {"client1", "Dupont", "Jean", "Paris", "banque"})));_template_buffer.append('\n');

_template_buffer.append(manager.action(current, new com.mia.openapi.CallN("CreateTestClient", new java.lang.Object[] {"client2", "Durant", "Pierre", "Lyon", "banque"})));_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	    // Client 1");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	    Compte compte1 = new Compte();");
_template_buffer.append('\n');
_template_buffer.append("	    compte1.setNumero(\"123456\");");
_template_buffer.append('\n');
_template_buffer.append("	    ");
_template_buffer.append('\n');
_template_buffer.append("	    client1.getComptes().add(compte1);");
_template_buffer.append('\n');
_template_buffer.append("	    ");
_template_buffer.append('\n');
_template_buffer.append("    	Operation credit = new Operation();");
_template_buffer.append('\n');
_template_buffer.append("    	credit.setMontant(\"1000\");");
_template_buffer.append('\n');
_template_buffer.append("    	credit.setNumero(\"Salaire\");");
_template_buffer.append('\n');
_template_buffer.append("    	");
_template_buffer.append('\n');
_template_buffer.append("    	Operation debit1 = new Operation();");
_template_buffer.append('\n');
_template_buffer.append("    	debit1.setMontant(\"-100\");");
_template_buffer.append('\n');
_template_buffer.append("    	debit1.setNumero(\"Telephone\");");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("    	Operation debit2 = new Operation();");
_template_buffer.append('\n');
_template_buffer.append("    	debit2.setMontant(\"-400\");");
_template_buffer.append('\n');
_template_buffer.append("    	debit2.setNumero(\"Loyer\");");
_template_buffer.append('\n');
_template_buffer.append("    	");
_template_buffer.append('\n');
_template_buffer.append("    	compte1.getOperations().add(credit);");
_template_buffer.append('\n');
_template_buffer.append("    	compte1.getOperations().add(debit1);");
_template_buffer.append('\n');
_template_buffer.append("    	compte1.getOperations().add(debit2);");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	    // Client 2");
_template_buffer.append('\n');
_template_buffer.append("	    ");
_template_buffer.append('\n');
_template_buffer.append("	    Compte compte2 = new Compte();");
_template_buffer.append('\n');
_template_buffer.append("	    compte2.setNumero(\"789123\");");
_template_buffer.append('\n');
_template_buffer.append("	    ");
_template_buffer.append('\n');
_template_buffer.append("	    client2.getComptes().add(compte2);");
_template_buffer.append('\n');
_template_buffer.append("	    ");
_template_buffer.append('\n');
_template_buffer.append("    	credit = new Operation();");
_template_buffer.append('\n');
_template_buffer.append("    	credit.setMontant(\"400\");");
_template_buffer.append('\n');
_template_buffer.append("    	credit.setNumero(\"Loto\");");
_template_buffer.append('\n');
_template_buffer.append("    	");
_template_buffer.append('\n');
_template_buffer.append("    	debit1 = new Operation();");
_template_buffer.append('\n');
_template_buffer.append("    	debit1.setMontant(\"-300\");");
_template_buffer.append('\n');
_template_buffer.append("    	debit1.setNumero(\"Electricite\");");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("    	compte2.getOperations().add(credit);");
_template_buffer.append('\n');
_template_buffer.append("    	compte2.getOperations().add(debit1);");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("	    return banque;");
_template_buffer.append('\n');
_template_buffer.append("	}");
return _template_buffer.toString();

}
}

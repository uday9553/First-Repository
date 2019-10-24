package com.uday.practise;

import javax.script.*;

public class JavaScriptUsingJava {
	public static void main(String args[]) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		
		engine.eval("var x = 10;");
		engine.eval("var y = 20;");
		engine.eval("var z = x + y;");
		engine.eval("print (z);");
		//creating a function in javascript and pass arguments using invokeFunction()
		//invokeFunction takes one or more arguments
		//first should be javascript function name and others are parameters
		
		engine.eval("function composeGreeting(name) {" + "return 'Hello ' + name" + "}");
		Invocable invocable = (Invocable) engine;

		try {
			Object funcResult = invocable.invokeFunction("composeGreeting", "baeldung");
			System.out.println(funcResult);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
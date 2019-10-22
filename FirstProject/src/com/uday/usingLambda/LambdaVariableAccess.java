package com.uday.usingLambda;

public class LambdaVariableAccess {
	public String wildAnimal = "Lion";

	public static void main(String[] arg) {
		new LambdaVariableAccess().lambdaExpression();
	}

	public void lambdaExpression(){
        String domesticAnimal = "Dog";
        
        new Thread (() -> {
            System.out.println("Class Level animal: " + wildAnimal);
        	System.out.println("Method Level animal : " + domesticAnimal);
       }).start();        
    }
}
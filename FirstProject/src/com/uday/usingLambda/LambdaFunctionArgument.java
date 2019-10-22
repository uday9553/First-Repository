package com.uday.usingLambda;

public class LambdaFunctionArgument {
	
//	interface having only one abstract method is called as functional interface 
	
	@FunctionalInterface
	interface Circle {
		double get(double radius);

		
	}

	public double circleOperation(double radius, Circle c) {
		return c.get(radius);
		
	}

	public static void main(String args[]){
		LambdaFunctionArgument reference = new LambdaFunctionArgument();
		
		Circle circleArea = (r) -> Math.PI * r * r;
		Circle circleCircumference = (r) -> 2 * Math.PI * r;
		//System.out.println("Area is "+circleArea.get(10));
		
		double area = reference.circleOperation(10, circleArea);
		double circumference = reference.circleOperation(10, circleCircumference);
	
		System.out.println("Area: "+area+" . Circumference: "+circumference);
	}
}
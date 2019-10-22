package com.uday.usingLambda;
public class LambdaHelloWorld {
	interface HelloWorld {
		String hello(String name);
	}
	public static void main(String[] args) {
		HelloWorld helloWorld = (String name) -> {
			System.out.println("returnung from interface");
			return "Hello " + name;
			};
		System.out.println(helloWorld.hello("uday sagar"));
	}
}

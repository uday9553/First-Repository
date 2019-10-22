package com.uday.usingLambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class LambdaExpressionSorting {
	public static void main(String[] ar) {
		Animal[] animalArr = { new Animal("Lion"), new Animal("Crocodile"), new Animal("Tiger"),
				new Animal("Elephant") };
		Stream<Animal> animalStream = Stream.of(animalArr);
		animalStream.forEach((animal) -> System.out.println("animal name is " + animal.name));

		// Here if you try to print stream again using forEach loop you will get
		// Some Exception saying stream is either already opened or closed
		// animalStream.forEach((animal)->System.out.println("animal name is
		// "+animal.name));
		System.out.println("Before Sort: " + Arrays.toString(animalArr));

		// :: double colon is a comparator operator which takes two objects as inputs
		// and returns integer
		Arrays.sort(animalArr, Animal::animalCompare);

		// System.out.println("After Sort: "+Arrays.toString(animalArr));
		animalStream = Stream.of(animalArr);
		animalStream.forEach((animal) -> System.out.println("animal name is " + animal.name));
	}
}

class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	static int animalCompare(Animal a1, Animal a2) {
		return a1.name.compareTo(a2.name);
	}
}
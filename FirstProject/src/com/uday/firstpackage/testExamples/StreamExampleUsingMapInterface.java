package com.uday.firstpackage.testExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleUsingMapInterface {
	public static void main(String[] args) {
		System.out.println("map With Integers");
		mapWithIntegers();
		System.out.println("map With String");
		mapWithStrings();

	}

	private static void mapWithIntegers() {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			myList.add(i);
		myList = myList.stream().map(p -> p + 10).collect(Collectors.toList());

		myList.forEach(p -> System.out.println(p));
	}

	private static void mapWithStrings() {
		List<String> alphabets = Arrays.asList("a", "b", "c", "d");
		alphabets = alphabets.stream().map(String::toUpperCase).collect(Collectors.toList());
		alphabets.forEach(p -> System.out.println(p));
	}

}

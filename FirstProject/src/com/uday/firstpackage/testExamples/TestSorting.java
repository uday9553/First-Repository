package com.uday.firstpackage.testExamples;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();		
		System.out.println("Before Sort");
		listDevs.forEach((developer)->System.out.println("name  " + developer.name + "age   " + developer.age));
		System.out.println();
				
		
		//sort by age in ascending oreder
		//if you want to get in descending order  you can write like this 
		//listDevs.sort((o1, o2) -> o2.getAge() - o1.getAge());
		listDevs.sort((o1, o2) -> o1.getAge() - o2.getAge());
		System.out.println("sorting  by age");
		listDevs.forEach((developer)->System.out.println("name  " + developer.name + "age   " + developer.age));
		System.out.println();
		
		//sort by name
		//same logic applies here if you want to sort in descending order
		System.out.println("sorting  by name");
		listDevs.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		listDevs.forEach((developer)->System.out.println("name  " + developer.name + "age   " + developer.age));
		System.out.println();

		Collections.reverse(listDevs);
		System.out.println("reversed list");
		listDevs.forEach((developer)->System.out.println("name  " + developer.name + "age   " + developer.age));
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}
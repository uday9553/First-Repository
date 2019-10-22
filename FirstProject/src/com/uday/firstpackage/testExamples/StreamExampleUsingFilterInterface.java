package com.uday.firstpackage.testExamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExampleUsingFilterInterface {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		sequentialStream(myList);
		parallelStream(myList);
		StringStreamUsingFilter();		

	}
	private static void sequentialStream(List<Integer> myList) {
		//here output will be in order 
		//this is synchronized because we used .stream() method
		myList= myList.stream().filter(p -> p > 80).collect(Collectors.toList());
		System.out.println("Nums with sequentialStream");
		myList.forEach(p -> System.out.println(+p));
	}
	private static void parallelStream(List<Integer> myList) {
		//here output will be in unorder 
		//this is not synchronized because we used .parallelStream() method
		myList= myList.parallelStream().filter(p -> p > 90).collect(Collectors.toList());
		System.out.println("Nums with parallelStream");
		myList.forEach(p -> System.out.println(+p));
		
	}
	private static void StringStreamUsingFilter() {
		List<String> strings1 = Arrays.asList("aaa", "", "bbb", "c", "ddd");
		strings1.stream().filter(string -> ! string.isEmpty()).forEach(System.out::println);
		
	}
	

}
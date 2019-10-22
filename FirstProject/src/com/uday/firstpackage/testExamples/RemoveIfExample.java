package com.uday.firstpackage.testExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeNumbers();
		removeString();
		replaceAllMethodExample();
	}
	private static void removeNumbers() {
		List<Integer> numbers = new ArrayList<Integer>(); 
		  
        // Add Number to list 
        numbers.add(10); 
        numbers.add(32); 
        numbers.add(25); 
        numbers.add(64);
        System.out.println("Before removing");
        numbers.forEach(n->System.out.println(n));
        numbers.removeIf(n->n%10==0);
         System.out.println("After removing");
        numbers.forEach(n->System.out.println(n));
	}
	private static void removeString() {
		 List<String> students = new ArrayList<String>(); 
	        students.add("Ram"); 
	        students.add("Mohan"); 
	        students.add("Sohan"); 
	        students.add("Rabi"); 
	        students.add("Shabbir"); 
	        System.out.println("Before removing");
	       // students.forEach(s->System.out.println(s));
	        students.forEach(System.out::println);
	        students.removeIf(s->(s.charAt(0)=='R'));
	        System.out.println("After removing");
	        students.forEach(s->System.out.println(s));
		
	}
	
	private static void replaceAllMethodExample(){
		String s1 = "aaaaabbbbbccccccddddddddeeeeee";
		String replaceString = s1.replaceAll("a", "e");// replaces all occurrences of "a" to "e"
		System.out.println(replaceString);
	}

}

package com.uday.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutabbleListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		List<String> immutableList=Collections.unmodifiableList(list);
		List<String> ofList=List.of("aaaa","bbbbbbbb","cccccccc","ddddd","eeeee");
		
		try {
			//here you will get UnsupportedOperationException if you try to add value to immutableList
			//in Collections.unmodifiableList() you cannot even pass null value
			//same works for List.of() also
			immutableList.add("four");
			ofList.add("fff");
		}
		catch (UnsupportedOperationException e) {
			// TODO: handle exception
			System.out.println("exception occured");
		}
		

	}

}

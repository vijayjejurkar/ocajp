package com.app.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
	
	public static void main(String[] args) {
		
		List<String> listOfNames = new ArrayList<>();
		
		listOfNames.add("Vijay");
		listOfNames.add("Dinesh");
		listOfNames.add("Amit");
		
		//1:
		System.out.println(listOfNames);
		//2
		for(String s: listOfNames) {
			System.out.println(s);
		}
		//3 Using foreach method to iterate over DS which is iterable.
		//foreach method has accept method in it.
		listOfNames.forEach((i)->System.out.println(i));
		
		//4
		listOfNames.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		
		
	
	}

}

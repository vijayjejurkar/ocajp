package com.app.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("vijay","jejurkar");
		Student s2 = new Student("vijay","jejurkar");
		Student s3 = new Student("vijay","jejurkar");
		Student s4 = new Student("vijay","jejurkar");
		
/*		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);*/
		
		
	Set<Student> setOfStudent = new HashSet<>();
	setOfStudent.add(s1);
	setOfStudent.add(s2);
	setOfStudent.add(s3);
	setOfStudent.add(s4);
	
	System.out.println(setOfStudent);
	}

}

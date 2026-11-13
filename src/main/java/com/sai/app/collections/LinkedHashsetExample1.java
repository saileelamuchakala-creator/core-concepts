package com.sai.app.collections;

import java.util.LinkedHashSet;

public class LinkedHashsetExample1 {
public static void main(String[] args) {
	LinkedHashSet<String> students = new LinkedHashSet<>();

	
	students.add("anjali");
	students.add("bhavya");
	students.add("harini");
	students.add("sushma");
	students.add("bhavya");
	students.add("null");
	students.add("null");
	System.out.println(students);
	students.remove("sushma");
	System.out.println(students);
	System.out.println(students.size());
	System.out.println(students.contains("akhila"));
	

	
}
}

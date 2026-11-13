package com.sai.app.collections;

import java.util.LinkedHashSet;

public class LinkedHashsetExample {
public static void main(String[] args) {
	LinkedHashSet<String> names = new LinkedHashSet<>();
	
	names.add("varshini");
	names.add("mukesh");
	names.add("naresh");
	names.add("mukesh");
	
	System.out.println(names);
	System.out.println(names.size());
	
}
}

package com.sai.app.collections;

import java.util.HashSet;

public class SetExample {
public static void main(String[] args) {
	HashSet<String> names = new HashSet<>();
	
	names.add("harshitha");
	names.add("sushmitha");
	names.add("varshitha");
	names.add("harshitha");
	names.add("barshitha");
	names.add("varshitha");
	
	System.out.println(names);

    System.out.println(names.size());

    System.out.println(names.contains("varshitha"));

    names.remove("sushmitha");

    System.out.println(names);

    System.out.println(names.isEmpty());
    
	System.out.println(names);

	
}
}

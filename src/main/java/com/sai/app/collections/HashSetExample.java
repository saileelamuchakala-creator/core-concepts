package com.sai.app.collections;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {

		HashSet<String> names = new HashSet<>();

		names.add("Java");
		names.add(null);
		names.add("Python");
		names.add(null);

		System.out.println(names.size());
		System.out.println(names.contains(null));

	}
}
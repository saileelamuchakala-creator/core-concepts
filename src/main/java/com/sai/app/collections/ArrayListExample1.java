package com.sai.app.collections;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("akhila");
		names.add("pooja");
		names.add("sharmila");
		
		System.out.println(names);
		System.out.println(names.get(2));
		names.set(1,"pravalika");
		System.out.println(names);
        names.remove(0);
        System.out.println(names);
	}
}

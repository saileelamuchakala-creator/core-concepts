package com.sai.app.collections;

import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList <>();
		
        names.add("Akhila");
        names.add("Pooja");
        names.add("Supriya");
        names.add("Sharmila");

       
        System.out.println(names);
        System.out.println(names.get(1));
        names.set(2, "Pravalika");
        names.remove("Pooja");  
        names.addFirst("sujatha");
        names.addLast("varshitha");
        names.getFirst();
        System.out.println(names);
    }

	}



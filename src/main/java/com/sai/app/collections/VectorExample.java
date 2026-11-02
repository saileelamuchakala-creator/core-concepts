package com.sai.app.collections;

import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	Vector<String> names =new Vector<>();
	
	names.add("Akhila");
    names.add("Pooja");
    names.add("Supriya");
    names.add("Sharmila");

    System.out.println(names);

    System.out.println(names.get(1));

    names.set(2, "Pravalika");

    names.remove("Pooja");

    System.out.println(names);

}
}

package com.sai.app.collections;

import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		System.out.println(numbers.capacity());

		numbers.add(10);
		numbers.add(20);
		numbers.add(20);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);
        numbers.add(70);
        numbers.add(40);
        numbers.add(60);
        numbers.add(40);
        numbers.add(40);
        numbers.add(20);

        System.out.println(numbers.size());
        System.out.println(numbers.capacity());

	}

}

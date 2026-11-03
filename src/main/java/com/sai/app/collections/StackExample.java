package com.sai.app.collections;

import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	Stack<String> students = new Stack<>();
	
	// Add elements
    students.push("Akhila");
    students.push("Pooja");
    students.push("Supriya");
    students.push("Ramya");
    students.push("Kavya");

    // Print Stack
    System.out.println("Students: " + students);

    // Print size
    System.out.println("Size: " + students.size());

    // Print top element
    System.out.println("Top element: " + students.peek());

    // Search element
    System.out.println("Search Pooja: " + students.search("Pooja"));

    // Remove top element
    System.out.println("Removed: " + students.pop());

    // Print updated Stack
    System.out.println("After pop: " + students);

    // Check empty
    System.out.println("Is Stack empty?: " + students.empty());
}
}





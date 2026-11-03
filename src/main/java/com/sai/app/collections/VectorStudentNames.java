//1. Create a Vector to store student names.
//2. Add five student names.
//3. Print all names using a for loop.
//4. print the first element.
//5. Print the last element.
//6. Print the size of the Vector.
// Find the size of the Vector.
// Check whether "Pooja" is present using contains().
// Check whether the Vector is empty using isEmpty().
// Print the student name at index 2.
// Find the index of "Ramya" using indexOf().
// Intermediate-level questions
// Update "Pooja" to "Priya" using set().
// Remove "Akhila" using remove().
// Remove the student at index 2.
// Add a new student at the beginning using add(0, "Sravya").
// Add a student at the end.
// Remove the first element using remove(0).
// Remove all elements using clear().
// Print the Vector in reverse order.


package com.sai.app.collections;

import java.util.Vector;

public class VectorStudentNames {
public static void main(String[] args) {
	
	Vector<String> students = new Vector<>();
	
	students.add("navya");
	students.add("kavya");
	students.add("bhavya");
	students.add("sravya");
	students.add("divya");
	students.add("chinny");
	students.add("minny");
	students.add("sunny");
	students.add("bunny");
	students.add("honey");
	
	System.out.println("All Student Names:");

    for (int i = 0; i < students.size(); i++) {
        System.out.println(students.get(i));
    }

    System.out.println("First Student: " + students.firstElement());
    System.out.println("Last Student: " + students.lastElement());
    System.out.println("Vector Size: " + students.size());
    System.out.println(students.contains("minny"));
    System.out.println(students.isEmpty());
    System.out.println(students.get(2));
    System.out.println(students.indexOf("chinny"));
    
    students.set(0, "Priya");
    System.out.println(students);
    
    for (int i = students.size() - 1; i >= 0; i--) {
        System.out.println(students.get(i));
    }
    
	
}
}

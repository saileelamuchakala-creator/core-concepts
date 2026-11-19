package com.sai.app.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
public static void main(String[] args) {
	HashMap<Integer, String> students = new HashMap<> ();
	
	students.put(101, "Akhila");
    students.put(102, "Pooja");
    students.put(103, "Supriya");

    for (Map.Entry<Integer, String> entry : students.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }

}
}

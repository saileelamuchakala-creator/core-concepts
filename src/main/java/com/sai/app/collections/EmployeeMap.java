package com.sai.app.collections;

import java.util.HashMap;

public class EmployeeMap {
public static void main(String[] args) {
	HashMap<Integer, String> employees = new HashMap<>();

	employees.put(403, "Akhilaaaaaaaa");
	employees.put(426, "Pravallikaaaa");
	employees.put(417, "Komalaaaaaaaa");
	employees.put(433, "Saileelaaaaaa");
	employees.put(456, "Sharmilaaaaaa");
	
	
	for(Integer id : employees.keySet()) {
		
		System.out.println(id + "  " + employees.get(id));
		
		
	}
}
}

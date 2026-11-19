package com.sai.app.collections;

import java.util.HashMap;

public class HahmapExample3 {
public static void main(String[] args) {
	
	HashMap<Integer,String> map = new HashMap<>();
	
	map.put(403, "Akhilaaaaaaaa");
	map.put(456, "Pravallikaaaa");
	map.put(417, "Komalaaaaaaaa");
	map.put(433, "Saileelaaaaaa");
	map.put(456, "Sharmilaaaaaa");
	
	System.out.println("Complete Map: " + map);
	System.out.println("Map Size: " + map.size());
	System.out.println("Value of key 433: " + map.get(433));
}

}

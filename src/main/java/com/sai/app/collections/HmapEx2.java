// duplicate keys
package com.sai.app.collections;


import java.util.HashMap;

public class HmapEx2 {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<>();

    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Mango");
    map.put(4, "Guava");
    map.put(1, "Grapes");
    map.put(3, "Starfruit");

    System.out.println(map);
    System.out.println(map.size());

}
}

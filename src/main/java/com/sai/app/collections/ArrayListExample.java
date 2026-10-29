package com.sai.app.collections;

import java.util.ArrayList;

public class ArrayListExample { 
	public static void main(String[] args) {
		
	 	ArrayList<String> names = new java.util.ArrayList<>();
	 	 
	 	names.add("venky");
	 	names.add("sai");
	 	names.add("leela");
	 	names.add("sai");
	 	
	  System.out.println(names);
	  System.out.println(names.get(1));
	  System.out.println(names.size());
	  
	  names.remove("sai");
	  for (String name : names)	{
		  System.out.println(name);
		 
	  }
	}
		
		
	}



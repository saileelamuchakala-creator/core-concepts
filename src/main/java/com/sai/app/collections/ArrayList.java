package com.sai.app.collections;

public class ArrayList { 
	public static void main(String[] args) {
		
	 	java.util.ArrayList<String> names = new java.util.ArrayList<>();
	 	 
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



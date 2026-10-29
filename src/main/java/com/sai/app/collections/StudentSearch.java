package com.sai.app.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentSearch {

	public static void main(String[] args) {
		
		        List<String> studentNames = new ArrayList<>();
		        studentNames.add("Prabhas");
		        studentNames.add("Vamsi");
		        studentNames.add("Venky");
		        studentNames.add("Soundarya");

		       
		        if (studentNames.contains("sai")) {
		            System.out.println("Found");
		        } else {
		            System.out.println("Not Found");
		        }
		    }
		
	}
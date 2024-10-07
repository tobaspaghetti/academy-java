package com.bptn.course._java_collection_list._01_arraylist._arraylist_coding_exercises;

class Student {
		
	
		// instance variables
	
	   private String name;
	   private String email;
	   private int id;

	   // constructor
	   public Student(String initName, String initEmail, int initId) {
	      name = initName;
	      email = initEmail;
	      id = initId;
	   }

	   // toString() method
	   public String toString() {
	     return id + ": " + name + ", " + email;
	   }

	}
package com.bptn.course._java_collection_list._01_arraylist._coding_33;

import java.util.List;
import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {

		String [] cars = {"Volvo", "Honda", "Ford"};
		
				
		List<String> newList = new ArrayList<>(Array.asList(cars));
		
		System.out.println("The converted arrayList is: " + newList);
		

	}

}

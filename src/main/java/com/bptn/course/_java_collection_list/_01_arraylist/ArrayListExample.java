package com.bptn.course._java_collection_list._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// 1st way of declaring ArrayList
		
		// ArrayList<Integer> arrayList = new ArrayList<>();
	
		// 2nd way of implementing an ArrayList
		
		List<Integer> arrayList = new ArrayList<>();
		
		// Add values into arrayList
		
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(300);  // ArrayList allows duplicates
		arrayList.add(400);  
		arrayList.add(null); // ArrayList allows null values
		arrayList.add(null); // ArrayList allows duplicate null values
		
		System.out.println("arrayList");
		
		// The size of the arrayList
		System.out.println("The size of arrayList: " + arrayList.size());
		
		// Access the first element
		System.out.println("The first element is: " + arrayList.get(0));
		
		// Update the element at index 2
		
		arrayList.set(2, 250);
		
		System.out.println("Updated ArrayList: " + arrayList);
		arrayList.set(5, 450);
		
		System.out.println("Updated ArrayList: " + arrayList);
		
		arrayList.add(7, 500);
		
		System.out.println("Updated ArrayList: " + arrayList);
		
		// Remove an element from index 4
	
		System.out.println("The element removed is: " + arrayList.remove(4));
		
		// The size of the arrayList
		System.out.println("The size of arrayList: " + arrayList.size());
		
		// Accessing the elements using a traditional loop
		
		for(int i = 0; i < arrayList.size(); i++){
			System.out.println(arrayList.get(0));
		}
		
		// Access the elements using a for-each loop
		
		for(Integer element: arrayList) {
			System.out.println(element);
		}
	}

}


// 1. SOLID principles
// D- > Dependency inversion principle

// We need to rely on Abstraction rather than concrete implementation
// 1. The 1st way of declaring is relying on concrete implementation which does not follow Dependency Inversion Principle 

// 2. The 2nd way of declaring is relying on Abstraction which follows DIP

// 3. ArrayList<Integer> arrayList = new ArrayList<>();
// The arrayList object has access to both List methods and any methods specific to the ArrayList class
// (like trimToSize()) and ensureCapacity())

// 4. List<Integer> arrayList = new ArrayList<>();
// The arrayList object can only call methods defined in the List interface. You won't have access to ArrayList-specific methods'

// 5. array[0] --> access the first element in an array


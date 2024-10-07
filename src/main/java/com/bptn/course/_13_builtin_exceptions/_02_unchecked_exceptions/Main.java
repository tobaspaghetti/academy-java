package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class Main {

//Coding 2.9-Part 1
    // Method to demonstrate exception propagation
	public void method1() {
		int[] arr = {1, 2, 3, 4};
		System.out.println(arr[4]); // critical statement
	}
    
    // Method to handle exception and demonstrate propagation
    public void method2() {
    	try {
    	method1();
    	}
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
    	}
    }
    
    // main() method to run the program

	public static void main(String[] args) {

		 Main exceptionSolutionObject = new Main();
	        exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation

	}

}

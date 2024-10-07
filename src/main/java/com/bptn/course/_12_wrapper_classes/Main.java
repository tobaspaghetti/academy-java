package com.bptn.course._12_wrapper_classes;

public class Main {

	public static void main(String[] args) {

		// Autoboxing - converting a primitive type into a Wrapper class . int --> Integer
		Integer intObject = Integer.valueOf(100);
		
		// Alternatively, we can also convert primitive type to Wrapper calss using belo syntax
		Integer intObject1 = 20;
		
		// Unboxing - converting a wrapper class into a primitive type
		int intPrimitive = intObject;
		
		// Alternatively, we can convert wrapper class back to primitive type using below syntax
		int intPrimitive1 = intObject.intValue();

	}

}


//1. Autoboxing - converting a primitive type into a wrapper class example: int --> Integer
//2. Unboxing - converting a wrapper class back to a primitive type example
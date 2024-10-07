package com.bptn.course._08_abstraction;

// Abstraction using interface (AfterJava8)
// From Java 8 - Interfaces can support abstract methods, default methods and static methods

interface Operations {
	void draw(); // abstraction method - it has no implementation
	
	// default method - has some implementation
	default int add(int a, int b) {
		return a+b;
	}
	
	// static method
	static double getRandomNumber() {
		return Math.random();
	}
	
}
	
		// sub-class - create a sub class that implements the Operations interface
		class Calculator implements Operations{
		
			@Override
			public void draw() {
			
				System.out.println("Draw method implemented by Calculator class;");		
			}

	
		}


public class Abstraction3 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2,3);
		
		System.out.println("The result is: " + result);
		System.out.println("The random number is: " + Operations.getRandomNumber());

	}

}


// Major takeaways

//1. Interface cannot be instantiated
//2. Abstract methods in the interface is implemented using a subclass
//3. Interfaces support multiple inheritance - a sub class can implement multiple interfaces
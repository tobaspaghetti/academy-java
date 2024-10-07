package com.bptn.course._07_polymorphism;

// Parent class
class Animal {
	
	void makeSound () {
		System.out.println("Animal makes a sound");
	}
}

// Sub class
class Dog extends Animal {

	// has its own methods
	@Override
	void makeSound() {
		System.out.println("Dog cooks");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		// instantiate the main class and call the makeSound method
		// create an object of Animal class
		Animal a1 = new Animal();
		a1.makeSound();
		
		// create an object from the Dog class
		Dog d1 = new Dog();
		d1.makeSound();
	}

}

// Major takeaways
// Method overriding
// 1. Scenario-when the subclass decides to override an existing method in the parent class
// 2. Name of the method, return type of the method and number of parameters in the overriden method should still be te same.
// 3. By convention, the overriden method has @override annotation above its method signature
// 4. Static methods in the parent class cannot be overriden
// 5. Run-time polymorphism
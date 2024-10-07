package com.bptn.course._07_polymorphism;

// parent class
class Shape {
	void drawAngle() {
		System.out.println("Drawing a shape angle");
	}
}

// sub-class Rectangle
class Rectangle extends Shape {
	void drawAngle() {
		System.out.println("Drawing a rectangle");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		 
	Rectangle r1 = new Rectangle();
	r1.drawAngle();

	}

}

// 1. create a parent class called shape
// 2. create one sub-class called Rectangle
// 3. create method called drawAngle() in the Shape clas and override it in the rectangle class
// 4. 

// we can only have one public class in a file
package com.bptn.course._06_oop;

public class Phone {

	// declare instance variavles - properties or attributes
	// weight, height, width, color
	
	private int weight;
	private int height;
	private int width;
	private String color;
	
	// Constructor
	// Has the same name as the class
	// Does not have any return type
	// Default constructor – does not have any parameters passed

	public Phone() {
		// default values
		weight = 150;
		height = 140;
		width = 79;
		color = "black";
	}
	
	// 1st parameterized constructor - which has 4 parameters passed
	public Phone(int w, int h, int wi, String c) { 
		weight = w;
		height = h;
		width = wi
		color = c;
	}
	
	// 2nd parameterized constructor - which has 3 parameters passed
		public Phone(int w, int h, int wi, String c) { 
		weight = w;
		height = h;
		widht = wi
			
		
	}
	// declare instance methods - behavior/functionality
	public void makePhoneCall() {
		System.out.println("Make a phone call");
	}
	public void sendTextMessage() {
		System.out.println("Send a text message");
	}
	
	public static void main(String[] args) {
	
	// create an object of the Phone class using default constructor
		Phone myObj1 = new Phone();
		System.out.println("Default Phone: " + " Weight: " + myObj1.weight + " Height: " + myObj1.height + " Width: " + myObj1.width + " Color:" + color);
			
		Phone myObj2 = new Phone(200, 100, 90, "Purple");
		System.out.println("Custom Phone: " + " Weight: " + myObj2.weight + " Height: " + myObj2.height + " Width: " + myObj2.width + " Color: " + color);
		
		Phone myObj3 = new Phone(200,100,90);
		System.out.println("Custom Phone without color: " + " Weight: " + myObj3.weight + " Height: " + myObj3.height + " Width: " + myObj3.width + " Color: " + color);
		
		myObj1.makePhoneCall(); // accessing the instance method using the object - objectName.instanceMethodName()
		myObj1.sendTextMessage(); // accessing the instance method using the object - objectName.instanceMethodName()
	}

}


// Instance variables are always declared as private bc we want to encapsulate this from being accessed from another class
// Instance methods are always declared as public bc we want it to be accessible
// we can have many parameterized constructors which can have the same name but different number of parameters
// we can only have one default constructor within a class
// if we don't have any constructors in the class, java automatically creates a default constructor by setting default values
 package com.bptn.course._06_oop;

public class Employee {
		
		// instance variables
		// name, employeeId and age
		
		private String name;
		private int employeeId;
		private int age; 
		
		// constructors
		
		// default constructor
		
		public Employee(String name, int employeeId) {
			this.name = "Toba";
			this.employeeId = 101;
			this.age = 29;
		}
		
		// Parameterized constructor - with 2 parameters
		public Employee(String name, int employeeId) {
		
		this.name = name;
		this.employeeId = employee.Id;
		}
		

		// Parameterized constructor - with 3 parameters
		public Employee(String name, int employeeId, int age) {
		
		this(name, employeeId); // this is trying to call the constructor Employee (String name, int employeeID) - with 2 parameters
		this.age = age;
		}
		
		//methods
		public void printInfo() {
			System.out.println("Employee name: " + this.name + " EmployeeID: " + this.employeeId + " age: " + this.age);
		}
		
		public static void main(String[] args) {
			
			// create objects from this class
			Employee e1 = new Employee();
			e1.printInfo();		
			
			Employee e2 = new Employee("John Doe", 1234);
			e2.printInfo();	
			
			Employee e3 = new Employee("Jane Smith", 5678);
			e3.printInfo();
		
	}

}

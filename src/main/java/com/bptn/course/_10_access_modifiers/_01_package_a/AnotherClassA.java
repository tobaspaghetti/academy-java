package com.bptn.course._10_access_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {
		
		//create an object if ClassA
		ClassA myObj = new ClassA();
		
		// No we cannot access the private method outside of Class A
		// myObj.privateMethod();
		
		// No we cannot access the private method outside of Class A
		// myObj.privateMethod();
		// System.out.println("Accessing private variable: " + myObj.privateVar);
				
		
		// Yes we can access the default method from class A as long as they are both in the same package
		myObj.defaultMethod();
		
		// Yes we can access the public variable from Class A whether its in the same package or not
		myObj.publicMethod();						
		System.out.println("Accessing public variable: " + myObj.publicVar);
		
		public void protectedMethod() {
		System.out.println("This is a protected method");
		}
		

		

	}

}

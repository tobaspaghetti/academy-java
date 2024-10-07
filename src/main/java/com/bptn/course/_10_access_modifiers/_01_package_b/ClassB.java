package com.bptn.course._10_access_modifiers._01_package_b;

import com.bptn.course._10_access_modifiers._01_package_a.ClassA;

public class ClassB extends ClassA{

	public static void main(String[] args) {
	
	ClassA myObj = new ClassA();
	
	// No we cannot access the private method outside the class in a different package
	// myObj.privateMethod();
	
	// No we cannot access the private variable outside the class in a different package
	// System.out.println("Accessing private variable: " + myObj.privateVar);
	
	// No we cannot access the default method outside the class and in a different package
	// myObj.defaultMethod();
	
	// No we cannot access the default variable outside the class in a different package
	// System.out.println("Accessing private variable: " + myObj.privateVar);
	
	// Yes we can access the public method outside the class in a different package
	myObj.publicMethod();
	
	// Yes we can access the public variable outside the class in a different package
	System.out.println("Accessing public variable: " + myObj.publicVar);
	
	// No we cannot access the protected method outside the class in a different package
	//myObj.protectedMethod();
	
	// No cannot access the protected variable outside the class in a different package
	// System.out.println("Accessing protected variable: " + myObj.protectedVar);
	
	ClassB myObj1 = new ClassB();
	myObj1.protectedMethod();
	
	System.out.println("Accessing protected variable: " + myObj1.protectedVar);
	
	
	
	
	}

}


//Major takeaways
// 1. We cannot access the private var and method outside the class and from a different package
// 2. We cannot access the default var and method outside the class and from a different package
// 3. default --> package private
// 4. We can access the public var and method outside the class and from a different package
// 5. We can access the protected var and method outside the class and from a different package
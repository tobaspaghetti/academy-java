package com.bptn.course._05_strings;

public class StringGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String greeting = null;
		System.out.println(greeting);

		String s1 = "xy";
		String s2 = s1;
		
		s1 = s1 + s2 + "z";
		
		String message = "12" + 4 + 3;
		System.out.println(message);
		
		String message1 = "This is a test";
		message1.substring(5);
	}

}

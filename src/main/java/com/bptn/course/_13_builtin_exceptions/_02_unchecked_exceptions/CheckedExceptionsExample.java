package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsExample {

	public static void main(String[] args) {
		
		try {
			readFile("Result.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
	}

	//create a method which reads a file
	
	public static void readFile(String fileName) throws FileNotFoundException {
		
		// create an object of FileReader (pre-built class in Java)
	
		FileReader fileReader = new FileReader(fileName);
		
		
	}
	
}

// FileNotFoundException is a checked exception where the Java compiler wants you to deal with it

// When we call a method which has checked exception in the method signature
// Java compiler gives you two options
// 1st option- to surround it with a try/catch
// 2nd option- add it again in the throws of the method signature

// try {
// readFile("Result.txt");
// } catch (FileNotFoundException e) {
//
//System.out.println("An error occurred: " + e.getMessage());
}
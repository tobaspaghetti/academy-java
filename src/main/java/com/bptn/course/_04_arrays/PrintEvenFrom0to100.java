package com.bptn.course._04_arrays;

public class PrintEvenFrom0to100 {

	public static void main(String[] args) {

	// Approach 2
		for (int i= 2; i<=100; i+=2) {
			System.out.println("The even numbered indexes are: " + i);
		}
		
	// Approach 2		
		for (int i= 1; i<=100; i+=2) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}

}

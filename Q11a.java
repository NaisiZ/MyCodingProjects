package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * For loop version of factorial
 * Enter a number to find the factorial: 5
 * Factorial = 120
 */
public class Q11a {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial: ");
		int number = in.nextInt();		
		int fact = 1;
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial = " + fact);
	}
}
package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * for loop version of reversing
 * Enter your number: 123456
 * Reverse of input number is: 654321
 * 
 * Enter your number: 654321
 * Reverse of input number is: 123456
 */
public class Q5 {
	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int numberOfDigits = String.valueOf(number).length();
		System.out.print("Reverse of input number is: ");
		for(int i = 0; i < numberOfDigits; i++) {
			System.out.print(number % 10);
			number /= 10;
		}
	}
}
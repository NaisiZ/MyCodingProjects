package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * while loop version of reversing
 * Enter your number: 123456
 * Reverse of input number is: 654321
 * 
 * Enter your number: 654321
 * Reverse of input number is: 123456
 */
public class Q4 {
	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.print("Reverse of input number is: ");
		while(number > 0) {
			System.out.print(number % 10);
			number /= 10;
		}
	}
}
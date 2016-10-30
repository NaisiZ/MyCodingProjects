package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * Enter any number: 5
 * 5 is a prime
 * 
 * Enter any number: 6
 * 6 is not a prime
 */
public class Q3 {
	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if (number < 2) {
			System.out.println(number + " is not a prime");
			return;
		}

		boolean flag = false;
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(number + " is not a prime");
		else
			System.out.println(number + " is a prime");
	}
}

package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * Enter your number: 898
 * palindrome number
 * 
 * Enter your number: 1234
 * not a palindrome number
 */
public class Q6 {
	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		int length = String.valueOf(number).length();
		int[] digits = new int[length];
		for (int i = 0; i < length; i++) {
			digits[i] = number % 10;
			number /= 10;
		}

		boolean flag = true;
		for (int i = 0; i < length / 2; i++) {
			if (digits[i] != digits[length - i - 1]) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.print("palindrome number");
		else
			System.out.print("not a palindrome number");

	}
}
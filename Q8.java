package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * Enter a number : 153
 * Is an Armstrong Number:
 *
 * Enter a number : 34
 * Is not an Armstrong Number:
 */
public class Q8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = in.nextInt();
		int conditioner = num;
		int result = 0;
		while (conditioner > 0) {		
			int d = conditioner % 10;
			result += d * d * d;
			conditioner /= 10;
		}

		if (result == num)
			System.out.println("Is an Armstrong Number:");
		else
			System.out.println("Is not an Armstrong Number:");

	}
}
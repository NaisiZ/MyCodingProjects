package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * Enter value for a : 4
 * Enter value for b : 2
 * 1. '+' 2. '-' 3. '*' 4. '/' 5. '%'
 * choose any number: 3
 * Multiplying: 8
 */
public class Q9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for a :");
		int a = in.nextInt();
		System.out.println("Enter value for b :");
		int b = in.nextInt();

		System.out.println("1. '+' 2. '-' 3. '*' 4. '/' 5. '%'");

		System.out.println("choose any number:");
		int option = in.nextInt();
		int result = 0;
		String operation = new String();

		switch (option) {
		case 1:
			result = a + b;
			operation = "Addition";
			break;
		case 2:
			result = a - b;
			operation = "Substraction";
			break;
		case 3:
			result = a * b;
			operation = "Multiplying";
			break;
		case 4:
			result = a / b;
			operation = "Division";
			break;
		case 5:
			result = a % b;
			operation = "Remainder";
			break;
		default:
			result = 0;
			operation = "Make sure the value that you entered between 1 - 5";
		}
		System.out.println(operation + ": " + result);
	}
}
package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * Enter a String: hello
 * Reverse String Result: olleh
 */
public class Q10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = in.nextLine();
		System.out.println("Reverse String Result: ");
		for(int i = input.length() - 1; i >= 0 ; i--) {
			System.out.print(input.charAt(i));
		}
	}
}
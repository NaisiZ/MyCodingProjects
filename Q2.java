package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * Enter any number: 5
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */
public class Q2 {
	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print(i);
			}
			System.out.println();			
		}
	}
}
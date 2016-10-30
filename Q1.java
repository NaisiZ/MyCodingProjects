package com.fatihkabakci;
import java.util.Scanner;
/**
 * 
 * @author fkabakci
 * Enter how many tables you need: 5
	
	This is table 1
	1 2 3 4 5 6 7 8 9 10 
	This is table 2
	2 4 6 8 10 12 14 16 18 20 
	This is table 3
	3 6 9 12 15 18 21 24 27 30 
	This is table 4
	4 8 12 16 20 24 28 32 36 40 
	This is table 5
	5 10 15 20 25 30 35 40 45 50 
 */

public class Q1 {
	public static void main(String[] args) {
		System.out.println("Enter how many tables you need:");
		Scanner in = new Scanner(System.in);
		
		int numberOfTable = in.nextInt();
		for(int i = 1; i <= numberOfTable; i++) {
			System.out.println("This is table " + i);
			for(int j = i; j <= 10 * i; j += i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
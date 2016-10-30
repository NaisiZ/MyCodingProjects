package com.fatihkabakci;

import java.util.Scanner;

/**
 * 
 * @author fkabakci
 * Enter value for Num1 : 10
 * Enter value for Num2 : 20
 * Before Swapping
 * Value of Num1 is :10
 * Value of Num2 is :20
 * After Swapping
 * Value of Num1 is :20
 * Value of Num2 is :10
 * 
 * Enter value for Num1 : 33
 * Enter value for Num2 : 22
 * Before Swapping
 * Value of Num1 is :33
 * Value of Num2 is :22
 * After Swapping
 * Value of Num1 is :22
 * Value of Num2 is :33
 */
public class Q7 {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for Num1 :");
		int num1 = in.nextInt();
		System.out.println("Enter value for Num2 :");
		int num2 = in.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Value of Num1 is :" + num1);
		System.out.println("Value of Num2 is :" + num2);
		System.out.println("After Swapping");
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Value of Num1 is :" + num1);
		System.out.println("Value of Num2 is :" + num2);

	}
}
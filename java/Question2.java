package Set2_Exercise;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int int1;
		int int2;
		int int3;
		int sum;
		int average;
		int product;
		int largest;
		int smallest;

		System.out.print("Please enter an integer: ");
		int1 = input.nextInt();

		System.out.print("Enter the second integer: ");
		int2 = input.nextInt();

		System.out.print("Enter the third Integer: ");
		int3 = input.nextInt();

		sum = int1 + int2 + int3;
		average = sum / 3;
		product = int1 * int2 * int3;

		largest = int1;
		if (int2 > largest)
			largest = int2;
		if (int3 > largest)
			largest = int3;
		
		smallest = int1;
		if (int2 < smallest)
			smallest = int2;
		if (int3 < smallest)
			smallest = int3;
	
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		System.out.println("The product is " + product);
		System.out.println("The largest of three is " + largest + " the smallest is " + smallest + ".");
	}
}

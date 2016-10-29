package hw;

public class constructor {
	int a,b,c;
	constructor()
	{
		System.out.println("Default constructor.");
	}
	constructor(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parameterized constructor with Two parameters.");
	}
	constructor(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Parameterized constructor with Three parameters.");
	};
public static void main(String[] args)
	{
		constructor noPara = new constructor();
		constructor twoPara = new constructor(1,2);
		constructor threePara = new constructor(1,2,3);
	}
}

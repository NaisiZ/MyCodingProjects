package hw5;
import java.util.Scanner;
public class question1{
	
public static int average(int[] array) {
	int sum = 0;
	
	for(int a : array) {
		sum += a;
	}
	
	return sum / array.length;
}

public static double average(double[] array) {
	
	double sum = 0;
	
	for(double a : array) {
		sum += a;
	}
	
	return sum / array.length;
}

public static String toString(int avg) {
	String oldStr=String.valueOf(avg);
    String newStr="";

    
    for(int i=0;i<oldStr.length();i++)
    {
        if(oldStr.charAt(i)=='1')
            newStr=newStr+"One";
        else if(oldStr.charAt(i)=='2')
            newStr=newStr+"Two";
        else
            newStr=newStr+oldStr.charAt(i);
    }

    return newStr;
}

public static String toString(double avg) {
	String oldStr=String.valueOf(avg);
    String newStr="";

    
    for(int i=0;i<oldStr.length();i++)
    {
        if(oldStr.charAt(i)=='1')
            newStr=newStr+"One";
        else if(oldStr.charAt(i)=='2')
            newStr=newStr+"Two";
        else
        	newStr=newStr+oldStr.charAt(i);
    }
    return newStr;
}

public static void main(String[] args) {
	System.out.println("Please enter 10 numbers of Double type: ");
	double[] array=new double[10];
	Scanner input= new 	Scanner(System.in);
	int i=0;
	while(i<10){
		array[i]=input.nextDouble();
		i++;
		}
	
	double avg=average(array);
	System.out.println("Average is: " + avg);
	String str = toString(avg);
	System.out.println("Average convert to string:" + str);
}
}
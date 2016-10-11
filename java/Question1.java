package Set2_Exercise;
import java.util.Scanner;

public class Question1 {
	public static double fToC(double f){
		double c=(f-32)/1.8;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the F° that you want to conver to C°: ");	
		Scanner input=new Scanner(System.in);
			double f=input.nextDouble();
			System.out.println("Convert F° to C°, the result is "+fToC(f));	
		}
	}

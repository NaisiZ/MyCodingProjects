package hw;

public class circleArea{
	int i;
	circleArea(int i)
	{
		this.i=i;
		System.out.println("The area of the square is: " + 3.14*i*i);
	}
	public static void main(String[] args){
		circleArea circle= new circleArea(25);
		
	}
}

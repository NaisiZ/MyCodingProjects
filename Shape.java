package hw;
public class Shape {
	int i;
	int l;

	Shape(int i)
	{
		this.i=i;
		System.out.println("The area of the square is: " + i*i);
	}
	Shape(int i, int l)
	{
		this.i=i;
		this.l=l;
		System.out.println("The area of the retangle is: " + i*l);
	};
	void print(){
		System.out.println("The area of the object is: ");
	}
	public static void main(String[] args){
		Shape square= new Shape(25);
		Shape rectangle = new Shape(23,24);
	}
}

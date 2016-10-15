package Exercise2;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		Circle c2=new Circle(2);
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());
		Circle c3=new Circle(3,"yellow");
		System.out.println(c3.getRadius());
		System.out.println(c3.getArea());
		System.out.println(c3.getColor());
		Circle c4=new Circle();
		c4.setRadius(5.0);          
		c4.setColor("green");           
		System.out.println(c4.getRadius());
		System.out.println(c4.getArea());
		System.out.println(c4.getColor());
	
	}

}
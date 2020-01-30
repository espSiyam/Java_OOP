 package abstractexample;
 
 abstract class Figure{
	 
	 double dim1;
	 double dim2;
	 int x=4;
	 
	 public Figure(double a,double b) {
		this.dim1 = a;
		this.dim2 = b;
	}
	 
	 abstract double area();
	 void sum() {
		 
	 }
	 
 }
 
 class Rectangle extends Figure{
	 public Rectangle(double a, double b) {
		super(a, b);

	}
	 
	 double area() {
		 System.out.println("Inside Area for rectangle.");
		 return dim1*dim2;
	 }
 }
 
 class Triangle extends Figure{
	 public Triangle(double a,double b) {
		 super(a, b);
	}
	 double area() {
		 System.out.println("Inside Area for Triangle.");

		 return dim1*dim2/2;
	 }
 }

public class AbstractAreas {

	public static void main(String[] args) {
		
		
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10, 8);
		
		System.out.println(r.area());
		
		System.out.println(t.area());
		

	}

}

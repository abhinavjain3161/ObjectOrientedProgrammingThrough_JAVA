import java.util.Scanner;
class Rectangle{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		double length = scan.nextDouble();
		System.out.print("Enter breadth of rectangle: ");
		double breadth = scan.nextDouble();
		area(length, breadth);
		perimeter( length, breadth);
	}
	static void area(double l, double b){
		double result = l*b;
		System.out.println("area of rectangle: " + result);
		}
	static void perimeter(double l, double b){
		double result = 2*(l + b);		
		System.out.println("Perimeter of rectangle: "+ result);
		}
}


class Rectangle{
	double length;
	double breadth;
	//constructor
	Rectangle(double length, double breadth){
		this.length = length; // this refer to current object
		this. breadth = breadth;
	}
	double calculatePerimeter(){
	 	return 2 * (length + breadth);
	}

	double calculateArea(){
		return (length * breadth);
	}

	public static void main(String[] args){
		Rectangle rect = new Rectangle(10,5);
		System.out.println("Length = " + rect.length);
		System.out.println("Breadth = " + rect.breadth);
		System.out.println("Area = "+ rect.calculateArea());
		System.out.println("Perimeter = " + rect.calculatePerimeter());
	}
}		
		
		
		
		
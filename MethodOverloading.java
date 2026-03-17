// 4.	Write a Java program to calculate the area of different shapes using method overloading:

class CalculateArea {
	
	int area(int side){
		return side*side;
	}
	int area(int length , int breadth){
		return length * breadth;
	}
	double area(double radius){
		return (3.14 * radius * radius);
	}
	
	public static void main(String[] args){
		CalculateArea a = new CalculateArea();
		System.out.println("area of square: " + a.area(4));
		System.out.println("area of rectangle: " + a.area(4,2));
		System.out.println("area of circle = " + a.area(1.0));
	}
}
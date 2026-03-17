interface shape{
	double calculateArea();
	double calculatePerimeter();
}
abstract class abstractShape implements shape{
	protected String color;
	public abstractShape(String color){
		this.color = color;
	}
	public  String getColor(){
		return color;
	}
}
class Circle extends abstractShape{
	private double radius;
	public Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	@Override
	public double calculateArea(){
		return Math.PI * radius * radius;
	}
	@Override
	public double calculatePerimeter(){
		return 2 * Math.PI * radius;
	}
}
class Rectangle extends abstractShape{
	private double length;
	private double width;
	public Rectangle(String color, double length, double width){
		super(color);
		this.length = length;
		this.width = width;
	}
	@Override
	public double calculateArea(){
		return length * width;
	}
	@Override
	public double calculatePerimeter(){
		return 2 * (length + width);
	}
}
class main{
	public static void main(String[] args){
	Circle circle  = new  Circle("Red",5);
	Rectangle rectangle =  new Rectangle("Blue",4,6);
	System.out.println("Circle: ");
	System.out.println("Color: " + circle.getColor());
	System.out.println("Area: " + circle.calculateArea());
	System.out.println("Perimeter: " + circle.calculatePerimeter());
	System.out.println("Rectangle: ");
	System.out.println("Color: " + rectangle.getColor());
	System.out.println("Area: " + rectangle.calculateArea());
	System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	}
}
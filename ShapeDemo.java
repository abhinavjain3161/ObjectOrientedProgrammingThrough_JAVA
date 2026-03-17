abstract class Shape3D{
	abstract void calculateVolume();
	abstract void calculateSurfaceArea();
}
class Sphere extends Shape3D{
	double radius;
	Sphere(double r){
		radius = r;
	}
	void calculateVolume(){
		double volume = (4.0/3) * Math.PI * radius * radius * radius;
		System.out.println("Volume of Sphere = " + volume);
	}
	void calculateSurfaceArea(){
		double area = 4 * Math.PI * radius * radius;
		System.out.println("Surface Area of Sphere = " + area);
	}
}
class Cube extends Shape3D{
	double side;
	Cube(double s){
		side = s;
	}
	void calculateVolume(){
		double volume = side * side * side;
		System.out.println("Volume of Cube = " + volume);
	}
	void calculateSurfaceArea(){
		double area = 6 * side * side;
		System.out.println("Surface Area of Cube = " + area);
	}
}
public class ShapeDemo{
	public static void main(String[] args){
		Shape3D s1 = new Sphere(5);
		Shape3D s2 = new Cube(4);
		s1.calculateVolume();
		s1.calculateSurfaceArea();
		s2.calculateVolume();
		s2.calculateSurfaceArea();
	}
}
	
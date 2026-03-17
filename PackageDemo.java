import mypack.Calculator;
public class PackageDemo{
	public static void main(String[] args){
		Calculator c = new Calculator();
		int s = c.add(5,3);
		int p = c.multiply(5,3);
		System.out.println("Sum = " + s);
		System.out.println("Product = " + p);
	}
}
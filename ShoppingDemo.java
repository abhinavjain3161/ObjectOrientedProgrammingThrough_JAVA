class Product{
	String productName;
	double price;
	Product(String name, double price){
		this.productName = name;
		this.price = price;
	}
	void showProductDetails(){
		System.out.println("Product Name: " + productName);
		System.out.println("Price: Rs. " + price);
	}
}
class Electronics extends Product{
	int warrantyPeriod; // in months
	Electronics(String name, double price , int warranty){
		super(name,price);
		this.warrantyPeriod = warranty;
	}
	void showWarrantyDetails(){
		System.out.println("Warranty Period: " + warrantyPeriod + " months");
	}
}
class Laptop extends Electronics{
	int batteryBackup; int hours;
	Laptop(String name, double price , int warranty, int battery){
		super(name, price , warranty);
		this.batteryBackup = battery;
	}
	void displayLaptopSpecifications(){
		System.out.println("Battery Backup: " + batteryBackup + "hours");
	}
}
public class ShoppingDemo{
	public static void main(String[] args){
		Laptop lap = new Laptop("Dell Inspiration", 65000, 24,8);
		lap.showProductDetails();
		lap.showWarrantyDetails();
		lap.displayLaptopSpecifications();
	}
}
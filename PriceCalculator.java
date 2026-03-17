package ecommerce.util;
public class PriceCalculator{
	public double discount(double price){
		return price * 0.10; // 10% discount
	}
	public double tax(double price){
		return price * 0.05;
	}
	public double finalPrice(double price){
		double d = discount(price);
		double t = tax(price - d);
		return price-d + t;
	}
}
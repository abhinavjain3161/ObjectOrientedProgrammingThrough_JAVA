import ecommerce.util.PriceCalculator;

public class ShoppingCart{
	public static void main(String[] args){
		PriceCalculator pc = new PriceCalculator();
		double price = 1000;
		System.out.println("Original Price: " + price);
		System.out.println("Discount: " + pc.discount(price));
		System.out.println("Tax: " + pc.tax(price));
		System.out.println("Final Price: " + pc.finalPrice(price));
	}
}
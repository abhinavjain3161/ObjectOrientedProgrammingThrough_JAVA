/*6.	An online shopping system needs to calculate the total bill.
The program should:
a.	Initialize product details using constructors
b.	Calculate bill amount using methods
c.	Apply discount using method overloading
*/

class ShoppingBill {


    int productId;
    String productName;
    double price;
    int quantity;

   
    ShoppingBill(int id, String name, double p, int q) {
        productId = id;
        productName = name;
        price = p;
        quantity = q;
    }

 
    double calculateBill() {
        return price * quantity;
    }

   
    double applyDiscount(double billAmount, double discountPercent) {
        return billAmount - (billAmount * discountPercent / 100);
    }

   
    double applyDiscount(double billAmount, int discountAmount) {
        return billAmount - discountAmount;
    }

    // Display product details
    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {

        
        ShoppingBill p1 = new ShoppingBill(101, "Headphones", 1500, 2);

        p1.display();

        double bill = p1.calculateBill();
        System.out.println("Total Bill Amount: " + bill);

 
        double finalAmount1 = p1.applyDiscount(bill, 10.0);
        System.out.println("Bill after 10% discount: " + finalAmount1);

     
        double finalAmount2 = p1.applyDiscount(bill, 200);
        System.out.println("Bill after flat discount: " + finalAmount2);
    }
}

// ✅ Exercise 10 — Shopping Bill Generator
class ShoppingBill{
	public static void main(String[] args){
		StringBuffer bill = new StringBuffer();
		bill.append("ABC Store\n");
		bill.append("------------------------\n");
		bill.append("Pen : 20\n");
		bill.append("Notebook : 50\n");
		bill.append("Bag: 500\n");
		bill.append("-------------------------\n");
		int total = 20 + 50 + 500;
		bill.append("Total = ").append(total);
		System.out.println(bill);
	}
}
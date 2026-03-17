//✅ Exercise 8 — Product Code Interpreter

import java.util.Scanner;
class ProductInterpreter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Product Code (type#brand#price): ");
		String code = scan.nextLine();

		String[] parts = code.split("#");
		if(parts.length == 3){
			System.out.println("Product Type: " + parts[0]);
			System.out.println("Brand: " + parts[1]);
			System.out.println("price: " + parts[2]);
		} else{
			System.out.println("Invalid format!");
		}
	}
}
import java.util.Scanner;
class DivideNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		try{
			System.out.print("Enter first number: ");
			int num1 = scan.nextInt();
			System.out.print("Enter second number: ");
			int num2 = scan.nextInt();
			int result = num1/num2;
			System.out.println("Result: " + result);
		}
		catch(ArithmeticException e){
		
			System.out.println("Cannot divide by zero.");
		}
		scan.close();
	}
}
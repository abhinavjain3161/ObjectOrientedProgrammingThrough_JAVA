import java.util.Scanner;
class ThrowsExample {
	static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		try{
			int result = divide(num1,num2);
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception occurred: Cannot divide by zero.");
		}
	}
}
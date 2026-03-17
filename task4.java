import java.util.Scanner;
class MultipleExceptionExample{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		try{
			System.out.print("Enter a number: ");
			String numInput = scan.nextLine();
			int num = Integer.parseInt(numInput);
			System.out.print("Enter an index (0-4): ");
			int index = scan.nextInt();
			int value = arr[index];
			int result = value/num;
			System.out.println("Array value: "+value);
			System.out.println("Result of division: " + result);
		}
		catch(NumberFormatException e){
			System.out.println("Error: Invalid number. Please enter a valid integer.");
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: Index is out of bounds. Please enter index between 0 and 4.");
		}
		catch(ArithmeticException e){
			System.out.println("Error: Cannot divide by zero.");
		}
		finally{
			System.out.println("Program execution completed.");
		}
	}
}
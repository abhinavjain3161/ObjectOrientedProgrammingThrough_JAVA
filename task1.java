import java.util.Scanner;

class NumberInput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		try{
			System.out.print("Enter a number: ");
			String input = scan.nextLine();
			int num = Integer.parseInt(input); // converts string to integer
			System.out.println("You entered: " + num);
		}
		catch(NumberFormatException e){
			System.out.println("Error: Please enter a valid integer value.");
		}
		finally{
			System.out.println("Input process is complete.");
		}
		scan.close();
	}
}
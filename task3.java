import java.util.Scanner;

class ArrayIndexExample{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		int index;
		Boolean valid = false;
		while(!valid){
			try{
				System.out.print("Enter index (0-4): ");
				index = scan.nextInt();
				System.out.println("Element at index " + index + "is: " + arr[index]);
				valid = true;
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
		}
	}
	}
}
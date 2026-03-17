// 6.Write a Java program to check whether a number is even or odd using operators.
// Abhinav Jain
import java.util.Scanner;
class CheckNum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		if(number % 2 == 0) System.out.println("Entered number: "+number+ " is even number.");
		else{
			System.out.println("Entered number: "+number+" is odd number.");
		}
	}
}
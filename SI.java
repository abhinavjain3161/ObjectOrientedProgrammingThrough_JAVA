// Write a Java program to calculate simple interest using constants.
// Abhinav Jain
import java.util.Scanner;
class SI
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principle amount: ");
		int p = scan.nextInt();
		System.out.println("Enter rate: ");
		int r = scan.nextInt();
		System.out.println("Enter duration: ");
		int t = scan.nextInt();
		int simple_interest = (p * r * t)/100;
		System.out.print("Simple Interest = "+simple_interest);
	}
}
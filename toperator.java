// 5.	Write a Java program to find the largest of two numbers using a ternary operator.

import java.util.Scanner;
class largest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int n2 = scan.nextInt();
		int largest =  (n1 > n2) ? n1 : n2;
		System.out.println("largest number" + largest);
	}
}
		
		
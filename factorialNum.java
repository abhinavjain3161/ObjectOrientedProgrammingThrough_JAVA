// 8.Write a Java program that calculates the factorial of a given number using recursion.
import java.util.Scanner;
class fact
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = factorial(n);
		System.out.println(result);
		
	}
	static int factorial(int n){
		if(n == 0 || n == 1) return 1;
		else return n * factorial(n-1);
	}
}
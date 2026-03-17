//3.Write a Java program that prints the Fibonacci sequence up to the nth term, where n is provided as input.
import java.util.Scanner;
class Fibo
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fibo(int n){
			if (n == 0) return 0;
			else{
				int result = fibo(n-1) + fibo(n-2);
				System.out.println(result);
			}
		}
	}
}
	
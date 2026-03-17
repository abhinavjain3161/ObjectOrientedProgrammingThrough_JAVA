import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		for(int i=0; i<n; i++)
		System.out.println(fibo(i));
	}
	static int fibo(int n)
	{
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibo(n-1) + fibo(n-2);
	}
}
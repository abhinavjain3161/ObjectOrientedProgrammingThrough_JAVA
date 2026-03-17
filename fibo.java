// write a java program to print Fibonacci Series using recursion upto 20 numbers.
import java.util.Scanner;
class Fibo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++){
			System.out.println(fibo(i));
		}

			
	}
	
	public static int fibo(int n){
		if(n <= 1){
			return n;
		}
		else{
			return fibo(n-1) + fibo(n-2);
		}
	}
	
}
		
		
		
		
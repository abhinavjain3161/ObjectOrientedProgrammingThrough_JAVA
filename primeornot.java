// check whether the number entered by user is prime or not.
import java.util.Scanner;
class Num
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n == 1) System.out.println(n + "is neither prime nor composite");
		else if(n == 2) System.out.println(n+"is a prime number.");
		else if(n%2 == 0) System.out.println(n + "is not a prime number.");
		else System.out.println(n + "is a prime number");
	}
}

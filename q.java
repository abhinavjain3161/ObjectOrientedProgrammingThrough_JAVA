// write a java programme to check whether the number entered by user is even or odd
import java.util.Scanner;
class CheckNum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2 == 0) System.out.println("Entered number is EVEN");
		else if(num%2 != 0) System.out.println("Entered number is ODD");
		else System.out.println("Please enter valid input integer!");
	}
}






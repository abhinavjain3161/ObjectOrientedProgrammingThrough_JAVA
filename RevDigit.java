// write a java program to reverse a four digit number
import java.util.Scanner;
class reverseDigit
{
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		int rev = 0
		int digit = num%10;
		int rev = rev*10+digit;
		num /= 10;
	}
	System.out.println(rev);
}
// write a java programme to print the sum of digits of a four digit number entered by the user.
import java.util.Scanner;
class sumOfDigit
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter four digit number: ");
		int num = scan.nextInt();
		

		int sum = 0;
		while (num > 0) {
    			sum += num % 10;
    			num /= 10;
		}
	System.out.println(sum);
	}
}
		
		
		
// 7.Write a Java program to calculate the sum of digits of a number.
import java.util.Scanner;
class sum_of_digits
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int num = scan.nextInt();
		
		int sum = 0;
		while(num > 0){
			int digit = num%10;
			sum += digit;
			num /= 10;
		}
		System.out.println("Sum of digits of a number is: "+sum);
	}
}
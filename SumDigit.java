//2.Write a Java program that calculates the sum of digits of a given integer.
class sum_of_digits
{
	public static void main(String[] args)
	{
		int num = 1234;
		int sum = 0;
		while(num > 0){
			int digit = num % 10;
			num /= 10;
			sum += digit;
		}
	System.out.println("Sum of digits of a given integer is: "+ sum);
	}
}
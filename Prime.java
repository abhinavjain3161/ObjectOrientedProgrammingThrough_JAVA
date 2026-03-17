//5.Write a Java program that checks whether a given number is prime or not.
import java.util.Scanner;

class primeNumber{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		boolean isPrime = true;
		if(num <= 1){
			isPrime = false;
		} else {
			for(int i=2; i<=num/2; i++){
				if(num % i == 0){
				isPrime = false;
				break;
				}
			}
		}
		if(isPrime){
			System.out.println(num + " is a prime number");
		}
		else{
			System.out.println(num +  " is not a prime number");
		}
	}
}
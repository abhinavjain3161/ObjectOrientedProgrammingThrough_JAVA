// Write a Java program that checks whether a given number is a palindrome or not.

import java.util.Scanner;

class PalindromeNumber{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = scan.nextInt();
	int original = num;
	int reverse = 0, remainder;
	while(num != 0){
		remainder = num%10;
		reverse = reverse * 10 + remainder;
		num = num / 10;
	}
	if (original == reverse){
		System.out.println(original + " is a Palindrome number.");
	} else{
		System.out.println(original + " is not a Palindrome number.");
	}
        }
}
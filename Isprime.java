// Write a Java program that accepts a range of numbers between n1 till n2 and prints all the prime numbers in between this range.

import java.util.Scanner;

class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number (n1): ");
        int n1 = sc.nextInt();

        System.out.print("Enter the ending number (n2): ");
        int n2 = sc.nextInt();

        System.out.println("Prime numbers between " + n1 + " and " + n2 + " are:");

        for (int i = n1; i <= n2; i++) {
            if (i > 1) {
                boolean isPrime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }

        
    }
}

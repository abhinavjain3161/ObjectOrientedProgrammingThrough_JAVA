//Write a Java program to convert temperature from Celsius to Fahrenheit.
// Abhinav Jain
import java.util.Scanner;
class TempConvert
{
	public static void main(String[] args)
	{
		double Celsius = 32.5;
		double Fahrenheit = ((Celsius) * 9/5 ) + 32;
		System.out.print("Temperature in Fahrenheit: "+Fahrenheit);
	}
}
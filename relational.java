import java.util.Scanner;
class roperators
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number here: ");
		int num = scan.nextInt();
		if(num > 0) System.out.println("Number entered" + num  + " is positive.");
		else if(num == 0) System.out.println("Number entered" +  num  + " is zero.");
		else{
			System.out.println("Number entered" +  num  + " is negative.");
		}
	}
}
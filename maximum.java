// write a java programme to find the maximum of three numbers
import java.util.Scanner;
class MaxNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.print("Maximum number: "+a);
		}
		else if(b>a && a>c){
			System.out.print("Maximum number: "+b);
		}
		else if(c>a && c>b){
			System.out.print("Maximum number: "+c);
		}
		else System.out.println("Numbers are equal");
	}
}


// Exercise 6 — User Registration Validator (String Methods)

import java.util.Scanner;

class UserValidator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		System.out.print("Enter Email: ");
		String email = scan.nextLine();
		System.out.print("Enter Password: ");
		String password = scan.nextLine();
		if(name.isEmpty() || email.isEmpty() || password.isEmpty()){
			System.out.println("Fields cannot be empty.");
			return;
		}
		if(!email.contains("@") || !email.contains(".")){
			System.out.println("Invalid email format.");
			return;
		}
		if(password.length() < 6){
			System.out.println("Password must be at least 6 characters.");
			return;
		}
		System.out.println("Registration Successful!");
	}
}
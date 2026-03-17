//✅ Exercise 7 — Resume Text Analyzer

import java.util.Scanner;

class ResumeAnalyzer{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Resume Summary: ");
		String text = scan.nextLine();
		int characters = text.length();
		int words = text.split("\\s+").length;
		Boolean hasJava = text.toLowerCase().contains("java");
		System.out.println("Total Characters: " + characters);
		System.out.println("Word Count: " + words);
		System.out.println("Contains 'Java': " + hasJava);

		System.out.println("\nUPPERCASE HEADLINE: ");
		System.out.println(text.toUpperCase());
	}
}
import java.util.Scanner;

class Student{
	String name;
	int rollNo;
	String dob;
	void inputData(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = scan.nextLine();
		System.out.print("Enter Roll Number: ");
		rollNo = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Date of Birth: ");
		dob = scan.nextLine();
	}
}

class Marks extends Student{
	int m1,m2,m3,m4,m5;
	int total;
	double percentage;
	String grade;
	void readData(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects (out of 100): ");
		m1 = scan.nextInt();
		m2 = scan.nextInt();
		m3 = scan.nextInt();
		m4 = scan.nextInt();
		m5 = scan.nextInt();
	}
	void compute(){
		total = m1 + m2 + m3 + m4 + m5;
		percentage = total/5.0;
		if(percentage >= 90)
			grade = "A+";
		else if(percentage >= 75)
			grade = "A";
		else if(percentage >= 60)
			grade = "B";
		else if(percentage >= 50)
			grade = "C";
		else
			grade = "Fail";
	}
	void show(){
		System.out.println("\n------Student Details----");
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Date of Birth: " + dob);
		System.out.println("\nMarks: ");
		System.out.println("Subject 1: " + m1);
		System.out.println("Subject 2: " + m2);
		System.out.println("Subject 3: " + m3);
		System.out.println("Subject 4: " + m4);
		System.out.println("Subject 5: " + m5);
		System.out.println("Total: " + total);
		System.out.println("Percentage: " + percentage + "%");
		System.out.println("Grade: " + grade);
	}
}
class StudentDemo{
	public static void main(String[] args){
		Marks obj = new Marks();
		obj.inputData();
		obj.readData();
		obj.compute();
		obj.show();
	}
}
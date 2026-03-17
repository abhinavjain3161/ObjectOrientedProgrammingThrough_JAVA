/*1.	Write a Java program that declares a class Student containing four data members using private, default, protected, and public access modifiers.
Initialize all variables inside the same class using a constructor and display them using a method.
Demonstrate that all four members are accessible within the same class..*/

class Student{
	private int rollNo;
	String name;
	protected float marks;
	public String college;

	Student(int r, String n, float m, String c){
		rollNo = r;
		name = n;
		marks = m;
		college = c;
	}
	void display(){
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Marks : "+marks);
		System.out.println("College : " + college);
	}
	public static void main(String[] args){
		Student s = new Student(101, "Abhinav", 88.5f, "SVKM'S NMIMS");
		s.display();
	}
}
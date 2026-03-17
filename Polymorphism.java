/*5.	A college wants to store student details. Each student has a roll number and name.
The system should:
a.	Initialize student details using constructors
b.	Display details using methods
c.	Calculate total marks using method overloading
*/
class CollegeDetails{

	// Student details
	int rollNo ;
	String name;

	CollegeDetails(int r, String n){
		rollNo = r;
		name = n;
	}
	void display(){
		System.out.println("Student Roll No. = " + rollNo);
		System.out.println("Student Name = " + name);
	}
	int totalMarks(int m1, int m2, int m3){ // 3 subjects
		return m1 + m2 + m3;
	}

	int totalMarks(int m1, int m2, int m3, int m4, int m5){
		return m1 + m2 + m3 + m4 + m5;
	}
	
	public static void main(String[] args){
		CollegeDetails s1 = new CollegeDetails(38, "Abhinav");
		s1.display();
		int total3 = s1.totalMarks(92,59,93);
		System.out.println("Total Marks (3 subjects): " + total3);

		int total5 = s1.totalMarks(92,59,93,97,74);
		System.out.println("Total marks (5 subjects): " + total5);
	}
}
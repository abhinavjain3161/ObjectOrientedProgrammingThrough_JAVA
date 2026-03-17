public class StudentDemo{
	public static void main(String[] args){
		Student s = new Student(101, "Abhinav", "CSE" , 85, 92.5);
		s.display();
		s.setMarks(90);
		s.setAttendance(95);
		System.out.println("\nAfter Update: ");
		s.display();
	}
}
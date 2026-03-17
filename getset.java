class Student{
	int rollNo; // default access
	String name;
	String department;
	private int marks; // sensitive data
	private double attendance;
	Student(int rollNo, String name, String department, int marks, double attendance){
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.marks = marks;
		this.attendance = attendance;
	}
	// Getter and Setter for marks
	public int getMarks(){
		return marks;
	}
	public void setMarks(int marks){
		if(marks >=0 && marks <= 100)
			this.marks = marks;
	}
	// Getter and Setter for attendance
	public double getAttendance(){
		return attendance;
	}
	public void setAttendance(double attendance){
		if(attendance >= 0 && attendance <= 100)
			this.attendance = attendance;
	}
	public void display(){
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Marks: " + marks);
		System.out.println("Attendance: " + attendance + "%");
	}
}
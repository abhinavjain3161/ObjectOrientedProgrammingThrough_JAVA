package hospital;

public class Doctor {
    String name;
    String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
	public void display(){
		System.out.println("Doctor Name: " + name);
		System.out.println("Specialization: " + specialization);
}
}


import hospital.Patient;
import hospital.Doctor;
import hospital.Appointment;


public class HospitalDemo {
    public static void main(String[] args) {
        Patient p = new Patient("Ravi", 25);
        Doctor d = new Doctor("Dr. Sharma", "Cardiologist");
        Appointment a = new Appointment("10-02-2026","10:30 AM");

        System.out.println("-------Patient Details------");
	p.display();
	System.out.println("\n-------Doctor Details--------");
	d.display();
	System.out.println("\n-------Appointment Details--------");
	a.display();
	
    }
}

import java.util.Scanner;

// Abstract class
abstract class Employee {
    String name;
    int empId;
    double basePay;

    Employee(String name, int empId, double basePay) {
        this.name = name;
        this.empId = empId;
        this.basePay = basePay;
    }

    abstract double calculateSalary();
    abstract String getRole();

    void showDetails() {
        System.out.println("\nEmployee Name : " + name);
        System.out.println("Employee ID   : " + empId);
    }
}

// Developer subclass
class Developer extends Employee {
    int projectBonus;
    double overtimeHours;

    Developer(String name, int empId, double basePay,
              int projectBonus, double overtimeHours) {
        super(name, empId, basePay);
        this.projectBonus = projectBonus;
        this.overtimeHours = overtimeHours;
    }

    @Override
    double calculateSalary() {
        double overtimePay = overtimeHours * 200;
        return basePay + (projectBonus * 1000) + overtimePay;
    }

    @Override
    String getRole() {
        return "Developer";
    }
}

// Manager subclass
class Manager extends Employee {
    double allowance;
    double incentive;

    Manager(String name, int empId, double basePay,
            double allowance, double incentive) {
        super(name, empId, basePay);
        this.allowance = allowance;
        this.incentive = incentive;
    }

    @Override
    double calculateSalary() {
        return basePay + allowance + incentive;
    }

    @Override
    String getRole() {
        return "Manager";
    }
}

// Main class
class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Developer input
        System.out.println("Enter Developer Details:");
        System.out.print("Name: ");
        String dName = sc.nextLine();
        System.out.print("ID: ");
        int dId = sc.nextInt();
        System.out.print("Base Pay: ");
        double dBase = sc.nextDouble();
        System.out.print("Project Bonuses Count: ");
        int bonus = sc.nextInt();
        System.out.print("Overtime Hours: ");
        double hours = sc.nextDouble();
        sc.nextLine();

        Employee emp1 = new Developer(dName, dId, dBase, bonus, hours);

        // Manager input
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("ID: ");
        int mId = sc.nextInt();
        System.out.print("Base Pay: ");
        double mBase = sc.nextDouble();
        System.out.print("Allowance: ");
        double allowance = sc.nextDouble();
        System.out.print("Performance Incentive: ");
        double incentive = sc.nextDouble();

        Employee emp2 = new Manager(mName, mId, mBase, allowance, incentive);

        // Runtime polymorphism demonstration
        Employee[] employees = {emp1, emp2};

        System.out.println("\n===== Employee Salary Details =====");
        for (Employee emp : employees) {
            emp.showDetails();
            System.out.println("Role          : " + emp.getRole());
            System.out.println("Final Salary  : " + emp.calculateSalary());
        }

        sc.close();
    }
}

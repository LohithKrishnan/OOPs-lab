class Employee {
    String employeeName;
    double baseSalary;

    Employee(String employeeName, double baseSalary) {
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }

    void showEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Base Salary: $" + baseSalary);
    }
}

class Manager extends Employee {
    double bonus = 10.0;

    Manager(String employeeName, double baseSalary) {
        super(employeeName, baseSalary);
    }

    void calculateTotalSalary() {
        double totalSalary = baseSalary + (baseSalary * bonus / 100);
        System.out.println("Total Salary with Bonus: $" + totalSalary);
    }
}

public class Singleinheritance2 {
    public static void main(String[] args) {
        Manager m1 = new Manager("Lohith", 6000);
        m1.showEmployeeDetails();
        m1.calculateTotalSalary();
    }
}

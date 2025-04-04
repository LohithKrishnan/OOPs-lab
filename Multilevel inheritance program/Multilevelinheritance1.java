class Company {
    void companyInfo() {
        System.out.println("This is a tech company.");
    }
}

class Department extends Company {
    void departmentInfo() {
        System.out.println("Software Development Department.");
    }
}

class Employee extends Department {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working on a project.");
    }

    void showName() {
        System.out.println("Employee Name: " + name);
    }
}

public class Multilevelinheritance1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anjali");
        e1.companyInfo();
        e1.departmentInfo();
        e1.work();
        e1.showName();
    }
}

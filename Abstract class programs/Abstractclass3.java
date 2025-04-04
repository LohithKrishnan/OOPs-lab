abstract class Report {
    abstract void generate();
    abstract void export();
}

class SalesReport extends Report {
    void generate() {
        System.out.println("Generating Sales Report...");
    }
    void export() {
        System.out.println("Exporting Sales Report as PDF.");
    }
}

class AttendanceReport extends Report {
    void generate() {
        System.out.println("Generating Attendance Report...");
    }
    void export() {
        System.out.println("Exporting Attendance Report as Excel.");
    }
}

public class Abstractclass3 {
    public static void main(String[] args) {
        Report r1 = new SalesReport();
        r1.generate();
        r1.export();

        Report r2 = new AttendanceReport();
        r2.generate();
        r2.export();
    }
}

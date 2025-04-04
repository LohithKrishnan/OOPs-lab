class University {
    void universityInfo() {
        System.out.println("Amrita University");
    }
}

class Course extends University {
    String courseName;

    Course(String course) {
        courseName = course; 
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
    }
}

class Student extends Course {
    String studentName;
    double marks;

    Student(String course, String name, double mark) {
        super(course); 
        studentName = name;
        marks = mark;
    }

    void calculateGrade() {
        String grade = (marks >= 90) ? "A+" : (marks >= 80) ? "A" : (marks >= 70) ? "B" : "C";
        System.out.println(studentName + " secured grade: " + grade);
    }
}

public class Multilevelinheritance2 {
    public static void main(String[] args) {
        Student s1 = new Student("Computer Science", "Lohith", 85);
        s1.universityInfo();
        s1.showCourseDetails();
        s1.calculateGrade();
    }
}


interface CollegeServices {
    void attendLecture(String lectureTopic);
    void submitAssignment(String assignmentName);
    void participateInEvent(String eventName);
    void enrollCourse(String courseName);

}

class CollegeStudent implements CollegeServices {
    private String studentName;

    public CollegeStudent(String studentName) {
        this.studentName = studentName;
    }

    public void enrollCourse(String courseName) {
        System.out.println(studentName + " has enrolled in " + courseName + ".");
    }

    public void attendLecture(String lectureTopic) {
        System.out.println(studentName + " is attending a lecture on " + lectureTopic + ".");
    }

    public void submitAssignment(String assignmentName) {
        System.out.println(studentName + " has submitted the " + assignmentName + " assignment.");
    }

    public void participateInEvent(String eventName) {
        System.out.println(studentName + " is participating in the " + eventName + " event.");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent("Lohith");

        student.enrollCourse("Java Programming");
        student.attendLecture("Object-Oriented Programming");
        student.submitAssignment("Java Basics");
        student.participateInEvent("College Fair");
    }
}

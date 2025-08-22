import java.util.Scanner;

// Student class
class Student {
    private String studentId;
    private String name;
    private String enrolledCourse; 

    public Student(String id, String studentName) {
        studentId = id;
        name = studentName;
        enrolledCourse = null;
    }

    //to drop a course
    public boolean dropCourse(String course) {
        if (enrolledCourse != null && enrolledCourse.equals(course)) {
            enrolledCourse = null;
            return true;
        }
        return false;
    }

    //to enroll a course
    public boolean enrollCourse(String course) {
        enrolledCourse = course;
        return true;
    }

    public String getCourse() {
        return enrolledCourse;
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(id, studentName);

        // Enroll courses
        System.out.print("How many courses do you want to enroll? ");
        int enrollCount = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < enrollCount; i++) {
            System.out.print("Enter course ID to enroll: ");
            String course = scanner.nextLine();
            boolean enrolled = student.enrollCourse(course);
            System.out.println("Enrolled " + course + ": " + enrolled);
            System.out.println("Current course: " + student.getCourse());
        }

        // Drop courses
        System.out.print("How many courses do you want to drop? ");
        int dropCount = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < dropCount; i++) {
            System.out.print("Enter course ID to drop: ");
            String course = scanner.nextLine();
            boolean dropped = student.dropCourse(course);
            System.out.println("Dropped " + course + ": " + dropped);
            System.out.println("Current course: " + student.getCourse());
        }

        scanner.close();
    }
}
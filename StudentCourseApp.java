import java.util.ArrayList;
import java.util.List;

class Course {
    String name;
    int marks;

    public Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

class Student {
    String name;
    String program;
    int semester;
    List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (Course c : courses) {
            System.out.println(" - " + c.getName());
        }
    }

    public void displayLowMarks() {
        System.out.println("\nCourses with marks less than 40:");
        for (Course c : courses) {
            if (c.getMarks() < 40) {
                System.out.println(" - " + c.getName() + ": " + c.getMarks());
            }
        }
    }
}

public class StudentCourseApp {
    public static void main(String[] args) {
        Student student = new Student("Sharat", "B.Tech CSE", 5);

        student.registerCourse(new Course("Mathematics", 85));
        student.registerCourse(new Course("Data Structures", 38));
        student.registerCourse(new Course("Operating Systems", 45));
        student.registerCourse(new Course("Algorithms", 30));

        student.displayStudentInfo();
        student.displayLowMarks();
    }
}

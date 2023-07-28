package Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Matsiko Robson Blessed", 10);
        System.out.println("\nStudent Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());

        //adding courses

        student.addCourse("Data structures");
        student.addCourse("Java");
        student.addCourse("Machine Learning");
        System.out.println("\nAdding Courses");
        System.out.println("Courses: " + student.getCourses());
        //removing courses

        student.removeCourse("Java");
        student.addCourse("JavaScript");
        System.out.println("\nUpdated courses");
        System.out.println("Courses: " + student.getCourses());
    }
}

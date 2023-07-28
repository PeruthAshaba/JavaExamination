package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    //Defining instance variables
    //These variables store the name, grade, and a list of courses for a student.
    private String name;
    private int grade;
    private List<String> courses;

    //Creating a constructor to initialise parameters name, grade, and the courses as an empty list
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Getter and Setter for the name attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for the grade attribute
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Getter and Setter for the courses attribute
    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course
    public void removeCourse(String course) {
        courses.remove(course);
    }

}

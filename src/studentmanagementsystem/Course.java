/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;
import java.util.*;

/**
 *
 * @author Basmala
 */
public class Course {
    private String courseName;
    private String courseCode;
    private List<Student> students;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
     public void editCourseName(String courseName) {
         this.courseName = courseName;
    }

    public void editCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public List<Student> displayEnrolledStudents(){
        return students;
    }
}

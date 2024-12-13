/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class studentsystem {
    private static final List<Student> stud = new ArrayList<>();
    
    public static void addStudent(int id,String name) {
        Student newstud = new Student(id, name);
        stud.add(newstud);
        System.out.println("Student Added\n"+newstud.displayDetails());
    }
    
    public static void editStudent(int id, String newName, Course course, Grade grade) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).setName(newName);
                stud.get(i).addGrade(course,grade);
                System.out.println("Student updated"+stud.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
     public static void setgradetoStudent(int id,Course course, Grade grade) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).addGrade(course,grade);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    
    public static void removeStudent(int id) {
        boolean removed = stud.removeIf(student -> student.getId() == id);
        if (removed) {
            System.out.println("Student with ID " + id + " removed.");
        } 
        else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void allStudentCourses(int id) { 
        boolean found = false;
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id) { 
                List<Course> c=stud.get(i).getCourses();
                for(int j=0;j<c.size();j++){
                    System.out.println(c.get(j).getCourseName());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void allStudents() { 
        for (int i = 0; i < stud.size(); i++) {
            System.out.println("ID: " + stud.get(i).getId() + " ,Name: "+stud.get(i).getName()); 
        }
    }
    public static void viewStudent(int id) { 
        boolean found = false;
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id) { 
                stud.get(i).displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    
}

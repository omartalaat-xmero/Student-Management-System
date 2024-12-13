/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;
// View the total number of instructors

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class instructorsystem {
     private static final List<Instructor> inst = new ArrayList<>();
    
    
    public static void addInstructor(int id,String name,List<Course> courses) {
        Instructor newinst = new Instructor(id, name,courses);
        inst.add(newinst);
        System.out.println("Instructor Added\n"+newinst.displayDetails());
    }
    public static void editInstructorName(int id,String name) {
        boolean found = false;
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                inst.get(i).setName(name);
                System.out.println("Instructor updated\n"+inst.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static void deleteInstructorCourse(int id,Course c) {
        boolean found = false;
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                inst.get(i).removeCourse(c);
                System.out.println("Instructor updated"+inst.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static void removeInstructor(int id) {
        boolean removed = inst.removeIf(instructor -> instructor.getId() == id);
        if (removed) {
            System.out.println("Instructor with ID " + id + " removed.");
        } 
        else {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static void viewInstructorcourses(int id){
     boolean found = false;
        for (int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId() == id) { 
                System.out.println(inst.get(i).displaycourses());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    /***************************************************************************/
    public static void viewInstructor(int id) { 
        boolean found = false;
        for (int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId() == id) { 
                System.out.println(inst.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
     public static void addInstructorCourse(int id,Course c) {
        boolean found = false;
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                //inst.get(i).addCourses(c);
                System.out.println("Instructor updated"+inst.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    /***************************************************************************/
}


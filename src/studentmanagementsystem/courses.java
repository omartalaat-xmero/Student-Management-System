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
public class courses {
    private List<Course>course=new ArrayList<>();
    
    
    void insertCourse(Course c){
        this.course.add(c);
    }
    
    void deleteCourse(Course c){
        course.remove(c);
    }
    
    void printCourses(){
        System.out.print(course);
    }
}

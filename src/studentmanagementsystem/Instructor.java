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
public class Instructor extends person {
  
    private List<Course> c= new ArrayList<>();

    public Instructor(int id, String name, List<Course>  courses) {
        super(name,id);
        for(int i=0;i<courses.size();i++)
            c.add(courses.get(i));
    }

    public void addCourses(Course course) {
        this.c.add(0,course);
        
    }
    
    public void removeCourse(Course course) {
        c.remove(course);
    }
    
    public List<Course>  getCourses() {
        return c;
    }
    
    public List<String>  getNameofcourses() {
        List<String> nameofcourses=new ArrayList<>();
        for (Course course : c) {
         nameofcourses.add(course.getCourseName());
        }
        return nameofcourses;
    }
    @Override
     public String displayDetails(){
         String details=("Instructor: " + getName() + "\nID: " + getId()+"\nCourses : ");
        for (Course course : c) {
           details+=("\n"+ course.getCourseName());
        }
        return details;
    }
     /*********************************************************************/
    public String displaycourses(){
         String details=("Courses : ");
        for (Course course : c) {
           details+=("\n"+ course.getCourseName());
        }
        return details;
    }
    /*********************************************************************/
}

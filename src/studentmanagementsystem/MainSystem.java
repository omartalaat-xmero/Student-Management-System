/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementsystem;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class MainSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*********************************courses***********************************************/
        Course c=new Course("java","CS103"),c1=new Course("mathI","ms203"),c2=new Course("Compiler constraction","CS203"),c3=new Course("Computer vision","CS109");
        courses cs=new courses();
        cs.insertCourse(c);
        cs.insertCourse(c1);
        cs.insertCourse(c2);
        cs.insertCourse(c3);
        Grade g=new Grade();
        
        
       /******************************student**************************************************/
       studentsystem.addStudent(1203, "omar talaat");
       studentsystem.addStudent(1204, "talaat");
       studentsystem.editStudent(1203, "talaat",c,g);
       g.setGradeValue(100);
       studentsystem.editStudent(1203, "talaat",c1,g);
       studentsystem.allStudentCourses(1203);
       studentsystem.allStudents();
       studentsystem.removeStudent(1203);
       studentsystem.allStudents();
       
        
        /********************************Instructor****************************************/
        instructorsystem.addInstructor(1, "talaat",Arrays.asList(c1,c2));
        instructorsystem.addInstructor(2, "talaat",Arrays.asList(c3,c1));
        //instructorsystem.viewInstructor(1);
        //instructorsystem.addInstructorCourse(1,c);
        //Instructor s=new Instructor(3,"Basmala",Arrays.asList(c3,c1));
        //s.addCourses(c);
        //System.out.print(s.displayDetails());
        //instructorsystem.removeInstructor(2);
        
        
        //Inastructor interface
        Scanner in= new Scanner(System.in);
        System.out.print("enter your id : ");
        int y=in.nextInt();
        System.out.println("1) profile 2)courses ");
        int x=in.nextInt();
        switch (x) {
            case 1 -> {
                instructorsystem.viewInstructor(y);
                System.out.println("edit your profile");
                    System.out.println("1) yes  2) no");
                    int z=in.nextInt();
                    switch (z){
                        case 1 ->{
                            System.out.println("enter your new name");
                            String newname=in.nextLine();
                            newname=in.nextLine();
                            in.close();
                            instructorsystem.editInstructorName(y, newname);//delete arrays list
                        }
                        //case 2 will back to line 58
                    }
            }
            case 2 -> {
                instructorsystem.viewInstructorcourses(y);
                int w=in.nextInt();
                if(w==1){
                    //display course 1
                    System.out.println("1)set grade");
                    int z=in.nextInt();
                    if(z==1){
                        System.out.println("enter course name");
                        String l=in.nextLine();
                        l=in.nextLine();
                        System.out.println("student id");
                        int e=in.nextInt();
                        System.out.println("grade");
                        int a=in.nextInt();
                        studentsystem.setgradetoStudent(e,c1,g);//add function to set grade=a to studentid=e in course 1 
                            //case 2 will back to line 58
                    }
                }
            }
        }
    }
}

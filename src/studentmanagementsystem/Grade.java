/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class Grade {
    private double totalGrade;
    
    public double getGradeValue() {
        return totalGrade;
    }

    public void setGradeValue(double totalGrade) {
        if(totalGrade>100||totalGrade<0){
            this.totalGrade =0;
            System.out.println("Edit the grade");
        }else
            this.totalGrade = totalGrade;
    }

   
     public char getGrade() {
         if (totalGrade<50){
            return'F';
        }
        else if(totalGrade<60){
            return'E';
        }
        else if(totalGrade<70){
            return'D';
        }
        else if(totalGrade<80){
             return'C';
        }
        else if(totalGrade<90){
            return 'B';
        }
        else {
            return 'A';
        }
        
    }
     
    
    
    
}

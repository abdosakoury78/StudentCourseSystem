/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author ZBOOK
 */
public class SpecialProgramStudent extends Student{

    public SpecialProgramStudent(String name, String id, int level) {
        super(name, id, level);
    }    
    @Override
    public float calculateExpenses() {
        int sumOfCreditHours = 0;
        for(int i = 0; i < noOfCourses; i++) {
            sumOfCreditHours += courseList[i].CreditHours;
        }
        return sumOfCreditHours * 500;
    }
    
}

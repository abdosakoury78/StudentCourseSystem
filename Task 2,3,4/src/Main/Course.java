/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author ZBOOK
 */
public class Course {
    String name;
    String id;
    int MinStudentLevel;
    int CreditHours;
    public String getCode(){
        return id;
    }
    Course(){

    }
    Course(String n , int l , int ch){
        name = n;
        MinStudentLevel = l;
        CreditHours = ch;

    }
    @Override
    public String toString() {
        return "Course{" + "MinStudentLevel=" + MinStudentLevel + ", name=" + name + ", code=" + id + ", CreditHours=" + CreditHours + '}';
    }
}


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
    private String name;
    private String code;
    private int MinStudentLevel;
    private int CreditHours;
    private char ch;

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinStudentLevel() {
        return MinStudentLevel;
    }

    public void setMinStudentLevel(int MinStudentLevel) {
        this.MinStudentLevel = MinStudentLevel;
    }

    public int getCreditHours() {
        return CreditHours;
    }

    public void setCreditHours(int CreditHours) {
        this.CreditHours = CreditHours;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        return "Course{" + "MinStudentLevel=" + MinStudentLevel + ", name=" + name + ", code=" + code + ", CreditHours=" + CreditHours + '}';
    }
}


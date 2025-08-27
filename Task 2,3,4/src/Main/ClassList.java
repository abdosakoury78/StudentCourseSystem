/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author ZBOOK
 */
public class ClassList {
    public static Course searchCourse(String code) {
        for(Course c : COURSES) {
            if(c.getCode().equals(code)) return c;
        }
        return null;
    }
    public static final Course[] COURSES = {
       new normalcourse("Math", 1, 2),
       new normalcourse("Programming_1", 1, 3),
       new normalcourse("Technical_Writing", 1, 3),
       new normalcourse("Electronics", 2, 4),
       new normalcourse("Data_Structures", 2, 3),
       new normalcourse("OOP", 2, 3),
       new normalcourse("Algorithms", 3, 2),
       new normalcourse("Operating_Systems", 3, 3),
       new normalcourse("Databases", 3, 3),
       new normalcourse("Machine_Learning", 4, 3),
       new normalcourse("Compilers", 4, 4),
       new normalcourse("Programming_Concepts", 4, 4),
       new summercourse("Math", 1, 2),
       new summercourse("Compilers", 4, 4),
       new summercourse("Algorithms", 3, 2),
       new summercourse("OOP", 2, 3)

    };
}

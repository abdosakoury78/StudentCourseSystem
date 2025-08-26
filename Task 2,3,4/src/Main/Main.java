/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ZBOOK
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int n = in.nextInt();
        in.nextLine();

        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Student s;
            System.out.println("\nStudent " + (i+1) + ":");
            System.out.print("Enter student type (0: general, 1: special): ");
            int type = in.nextInt();
            in.nextLine();
            
            System.out.print("Enter Name: ");
            String name = in.nextLine();
            
            System.out.print("Enter ID: ");
            String id = in.nextLine();    
            
            System.out.print("Enter student level: ");
            int level = in.nextInt();
            in.nextLine();
            
            if(type == 0) s = new GeneralProgramStudent(name, id, level);
            else s = new SpecialProgramStudent(name, id, level);
            
            System.out.print("Number of courses to be registered: ");
            int NumOfCourses = in.nextInt();
            in.nextLine();
            
            for(int j = 0; j < NumOfCourses; j++) {
                System.out.println("\nCourse " + (j+1) + ":\nCode: ");
                String code = in.nextLine();
                
                Course c = ClassList.searchCourse(code);
            }
        }
    }
    
}

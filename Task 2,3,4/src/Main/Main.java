
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
    public void normalcourse(int x){

    }
    
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
            int type;
            while(true) {
                System.out.print("Enter student type (0: general, 1: special): ");
                type = in.nextInt();       
                if(type == 0 || type == 1) break;
            }
            in.nextLine();
            
            System.out.print("Enter Name: ");
            String name = in.nextLine();
            
            System.out.print("Enter ID: ");
            String id = in.nextLine();    
            
            int level;
            while(true) {
                System.out.print("Enter student level: ");
                level = in.nextInt();
                if(level > 0 && level < 5) break;
            }
            in.nextLine();
            
            if(type == 0) s = new GeneralProgramStudent(name, id, level);
            else s = new SpecialProgramStudent(name, id, level);
            
            System.out.print("Number of courses to be registered: ");
            int NumOfCourses = in.nextInt();
            in.nextLine();
            
            for(int j = 0; j < NumOfCourses; j++) {
                System.out.println("\nCourse " + (j+1) + ":\nCode: ");
                String code = in.nextLine();
                Course course = ClassList.searchCourse(code);
                
                if(course == null) {
                    System.out.println("Error: Course is Not Found");
                    continue;
                }
                
                boolean regist = s.registerCourse(course);
                if(!regist) {
                    System.out.println("Level too low to register this course.");
                }else {
                    System.out.print("Enter grade: ");
                    double grade = in.nextDouble();
                    in.nextLine();
                    s.setGrades(grade, s.noOfCourses - 1);
                }
            }
            students.add(s);
        }
        for (Student st : students) {
        System.out.println("\n=============================");
        System.out.println("Name: " + st.getName());
        System.out.println("ID: " + st.getId());
        System.out.println("Level: " + st.getLevel());
        st.printRegisteredCourses();
        System.out.println("Expenses: " + st.calculateExpenses());
        System.out.println("Total GPA: " + st.getTotalGPA());
    }
    }
    
}

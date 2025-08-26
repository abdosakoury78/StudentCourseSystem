package Main;

public class GeneralProgramStudent extends Student {

    public GeneralProgramStudent(String name, String id, int level) {
        super(name, id, level);
    }

    @Override
    public boolean registerCourse(Course c, double grade) {
        if (noOfCourses >= 6) {
            System.out.println("Cannot register more than 6 courses.");
            return false;
        }
        if (this.level >= c.MinStudentLevel) {
            courseList[noOfCourses] = c;
            grades[noOfCourses] = grade;
            noOfCourses++;
            return true;
        }
        System.out.println("Level too low to register this course.");
        return false;
    }

    @Override
    public float calculateExpenses() {
        return level * 1000.0f;
    }
}

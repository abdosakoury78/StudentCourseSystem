package Main;

public class GeneralProgramStudent extends Student {
    public GeneralProgramStudent(String name, String id, int level) {
        super(name, id, level);
    }

    @Override
    public boolean registerCourse(Course c) {
        if (noOfCourses >= 6) {
            System.out.println("Cannot register more than 6 courses.");
            return false;
        }
        if (getLevel() >= c.getMinStudentLevel()) {
            courseList[noOfCourses] = c;
            noOfCourses++;
            return true;
        }
//        System.out.println("Level too low to register this course.");
        return false;
    }

    @Override
    public float calculateExpenses() {
        return getLevel() * 1000.0f;
    }
}

package Main;

public abstract class Student {
    String name;
    String id;
    int level;
    double[] grades;
    Course[] courseList;
    int noOfCourses;

    // Parameterized constructor
    public Student(String name, String id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
        this.noOfCourses = 0;
        this.grades = new double[6];
        this.courseList = new Course[6];
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public Student() {
        this.noOfCourses = 0;
        this.courseList = null;
    }

    // Register a course
    public boolean registerCourse(Course c) {
        if (noOfCourses >= 6) {
            System.out.println("Cannot register more than 6 courses.");
            return false;
        }
        courseList[noOfCourses] = c;
        noOfCourses++;
        return true;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double grade, int idx) {
        grades[idx] = grade;
    }

    // Get GPA
    public double getCourseGPA(double grade) {
        if (grade >= 93) return 4.0;
        else if (grade >= 90) return 3.7;
        else if (grade >= 87) return 3.3;
        else if (grade >= 83) return 3.0;
        else if (grade >= 80) return 2.7;
        else if (grade >= 77) return 2.3;
        else if (grade >= 73) return 2.0;
        else if (grade >= 70) return 1.7;
        else if (grade >= 67) return 1.3;
        else if (grade >= 63) return 1.0;
        else if (grade >= 60) return 0.7;
        else return 0.0;
    }

    // Print registered courses
    public void printRegisteredCourses() {
        System.out.println("Registered Courses for " + name + ":");
        for (int i = 0; i < noOfCourses; i++) {
            System.out.println(courseList[i].toString() + " | Grade: " + grades[i]);
        }
    }

    // Calculate total GPA
    public double getTotalGPA() {
        double totalPoints = 0;
        int totalCreditHours = 0;

        for (int i = 0; i < noOfCourses; i++) {
            double gpa = getCourseGPA(grades[i]);
            totalPoints += gpa * courseList[i].CreditHours;
            totalCreditHours += courseList[i].CreditHours;
        }

        if (totalCreditHours == 0) return 0.0;
        return totalPoints / totalCreditHours;
    }
    
    // Abstract method
    public abstract float calculateExpenses();
}

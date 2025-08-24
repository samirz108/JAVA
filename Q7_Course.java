abstract class Course {
    private String courseCode;
    private int credits;

    public Course(String courseCode, int credits) {
        if (credits <= 0) throw new IllegalArgumentException("Invalid credits");
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
    public abstract int calculateWorkload();
}

class TheoryCourse extends Course {
    public TheoryCourse(String code, int credits) { super(code, credits); }
    public int calculateWorkload() { return getCredits() * 15; }
}

class LabCourse extends Course {
    public LabCourse(String code, int credits) { super(code, credits); }
    public int calculateWorkload() { return getCredits() * 20; }
}

public class Q7_Course {
    public static void main(String[] args) {
        try {
            Course c1 = new TheoryCourse("CS101", 3);
            Course c2 = new LabCourse("CS102", 2);
            System.out.println(c1.getCourseCode() + " Workload: " + c1.calculateWorkload() + " hrs");
            System.out.println(c2.getCourseCode() + " Workload: " + c2.calculateWorkload() + " hrs");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods
    public String toString() {
        String output = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            output += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return output;
    }

    // methods

    public String findBestStudent() {
        StudentRecord bestStudent = enrolledStudents[0];
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > bestStudent.getFinalAverage()) {
                bestStudent = enrolledStudents[i];
            }
        }
        return bestStudent.getName();
    }

    public double calculateTestAverage(int testNumber) {
        int sum = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            sum += enrolledStudents[i].getTestScore(testNumber);
        }
        return (double) sum / enrolledStudents.length;
    }
}

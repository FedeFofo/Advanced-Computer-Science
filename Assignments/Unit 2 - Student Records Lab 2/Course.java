public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null && enrolledStudents[i].equals(student)) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int sum = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                sum++;
            }
        }
        return sum;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] newArray = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newArray[i] = enrolledStudents[i];
        }
        enrolledStudents = newArray;
    }
}

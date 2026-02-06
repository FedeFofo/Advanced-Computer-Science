import java.util.ArrayList;

public class TestResults {
    // instance variables
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    // constructors
    TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        Utils.checkNull(key);
        Utils.checkNull(submissions);
        this.answerKey = key;
        this.submissions = submissions;
    }

    // getters
    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    // setters
    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    // methods
    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet student : submissions) {
            student.setTestScore(student.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }
        StudentAnswerSheet highest = submissions.get(0);
        for (StudentAnswerSheet student : submissions) {
            if (student.getTestScore() > highest.getTestScore()) {
                highest = student;
            }
        }
        return highest.getName();
    }
}

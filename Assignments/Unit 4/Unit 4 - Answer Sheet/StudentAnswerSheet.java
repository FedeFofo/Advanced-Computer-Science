import java.util.ArrayList;

public class StudentAnswerSheet {
    // instance variables
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    // constructors
    StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException("Neither name nor answers can be null.");
        }
        this.name = name;
        testScore = 0.0;
        this.answers = answers;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getTestScore() {
        return testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    // methods
    public double getGrade(ArrayList<String> key) {
        Utils.checkNull(key);

        if (key.size() != answers.size()) {
            throw new IllegalArgumentException("The answer key and "
                    + " the student's answers must be the same length.");
        }

        int correct = 0;
        int incorrect = 0;

        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).equals(answers.get(i))) {
                correct++;
            } else if (answers.get(i).equals("?")) {
                continue;
            } else {
                incorrect++;
            }
        }

        return (correct * 1) - (incorrect * 0.25);
    }
}
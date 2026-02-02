public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    public String getName() {
        return name;
    }
    
    public int[] getScores() {
        return scores;
    }

    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber >= scores.length) {
            return -1;
        } else {
            return scores[testNumber];
        }
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    public String toString() {
        return name + "'s scores: " + Utils.printIntegerArray(scores);
    }

    public boolean equals(StudentRecord other) {
        if (scores.length != other.getScores().length) {
            return false;
        }
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != other.getScores()[i]) {
                return false;
            }
        }
        return name.equals(other.getName());
    }

    // methods

    public double getAverage(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return (double) sum / (last - first + 1);
    }

    public boolean hasImproved() {
        int lastScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lastScore) {
                return false;
            }
            lastScore = scores[i];
        }
        return true;
    }

    public double getFinalAverage() {
        if (hasImproved()) {
            return getAverage(scores.length / 2, scores.length - 1);
        }
        return getAverage(0, scores.length - 1);
    }
}
public class CourseTester {
    public static void main(String[] args) {
        // Testing StudentRecord methods
        System.out.println("-----------------------------");
        System.out.println(" Testing StudentRecord class ");
        System.out.println("-----------------------------\n");
        int[] scores = {75, 80, 82, 91, 96};
        StudentRecord james = new StudentRecord("James", scores);

        // Testing toString()
        System.out.println("..:: Testing toString()");
        String expectedJames = "James's scores: [75, 80, 82, 91, 96]";
        System.out.println("Expected value = actual value?\t\t" 
            + james.toString().equals(expectedJames));
        
        // Testing getName()
        System.out.println("\n..:: Testing getName()");
        System.out.println("Expected value = actual value?\t\t" 
            + james.getName().equals("James"));
        
        // Testing getScores()
        System.out.println("\n..:: Testing getScores()");
        int[] jamesScores = james.getScores();
        boolean scoresMatch = jamesScores.length == 5 && jamesScores[0] == 75 
            && jamesScores[4] == 96;
        System.out.println("Expected value = actual value?\t\t" + scoresMatch);
        
        // Testing getTestScore()
        System.out.println("\n..:: Testing getTestScore()");
        System.out.println("Expected value = actual value?\t\t" 
            + (james.getTestScore(0) == 75));
        System.out.println("Expected value = actual value?\t\t" 
            + (james.getTestScore(3) == 91));
        System.out.println("Expected value = actual value?\t\t" 
            + (james.getTestScore(-1) == -1)); // negative index
        System.out.println("Expected value = actual value?\t\t" 
            + (james.getTestScore(10) == -1)); // out of bounds
        
        // Testing setName()
        System.out.println("\n..:: Testing setName()");
        james.setName("Jimmy");
        System.out.println("Expected value = actual value?\t\t" 
            + james.getName().equals("Jimmy"));
        james.setName("James"); // reset
        
        // Testing setScores()
        System.out.println("\n..:: Testing setScores()");
        int[] newScores = {85, 90, 95};
        james.setScores(newScores);
        boolean setScoresTest = james.getScores().length == 3 
            && james.getTestScore(0) == 85;
        System.out.println("Expected value = actual value?\t\t" + setScoresTest);
        james.setScores(scores); // reset
        
        // Testing equals()
        System.out.println("\n..:: Testing equals()");
        int[] scores2 = {75, 80, 82, 91, 96};
        StudentRecord james2 = new StudentRecord("James", scores2);
        System.out.println("Expected value = actual value?\t\t" + james.equals(james2));
        StudentRecord maria = new StudentRecord("Maria", scores2);
        System.out.println("Expected value = actual value?\t\t" + !james.equals(maria));
        int[] scores3 = {75, 80, 82};
        StudentRecord james3 = new StudentRecord("James", scores3);
        System.out.println("Expected value = actual value?\t\t" + !james.equals(james3));
        
        // Testing getAverage()
        System.out.println("\n..:: Testing getAverage()");
        System.out.println("Expected value = actual value?\t\t" 
            + (james.getAverage(0, 4) == 84.8));
        System.out.println("Expected value = actual value?\t\t" 
            + (james.getAverage(2, 4) == 89.66666666666667));
        
        // Testing hasImproved()
        System.out.println("\n..:: Testing hasImproved()");
        System.out.println("Expected value = actual value?\t\t" + james.hasImproved());
        int[] decliningScores = {90, 85, 80};
        StudentRecord declining = new StudentRecord("Declining", decliningScores);
        System.out.println("Expected value = actual value?\t\t" 
            + !declining.hasImproved());
        
        // Testing getFinalAverage()
        System.out.println("\n..:: Testing getFinalAverage()");
        System.out.println("Expected value = actual value?\t\t" 
            + (james.getFinalAverage() == 89.66666666666667)); // improved, last half
        System.out.println("Expected value = actual value?\t\t" 
            + (declining.getFinalAverage() == 85.0)); // not improved, all scores

        // Testing Course methods
        System.out.println("\n\n-----------------------------");
        System.out.println("    Testing Course class     ");
        System.out.println("-----------------------------\n");
        
        int[] scores4 = {88, 92, 87, 90, 93};
        StudentRecord sarah = new StudentRecord("Sarah", scores4);
        int[] scores5 = {70, 75, 78, 80, 85};
        StudentRecord mike = new StudentRecord("Mike", scores5);
        
        StudentRecord[] students = {james, sarah, mike};
        Course mathCourse = new Course("Mathematics 101", students);
        
        // Testing getCourseName()
        System.out.println("..:: Testing getCourseName()");
        System.out.println("Expected value = actual value?\t\t" 
            + mathCourse.getCourseName().equals("Mathematics 101"));
        
        // Testing getEnrolledStudents()
        System.out.println("\n..:: Testing getEnrolledStudents()");
        StudentRecord[] enrolledStudents = mathCourse.getEnrolledStudents();
        boolean enrollmentTest = enrolledStudents.length == 3 
            && enrolledStudents[0].equals(james);
        System.out.println("Expected value = actual value?\t\t" + enrollmentTest);
        
        // Testing setCourseName()
        System.out.println("\n..:: Testing setCourseName()");
        mathCourse.setCourseName("Advanced Mathematics");
        System.out.println("Expected value = actual value?\t\t" 
            + mathCourse.getCourseName().equals("Advanced Mathematics"));
        mathCourse.setCourseName("Mathematics 101"); // reset
        
        // Testing setEnrolledStudents()
        System.out.println("\n..:: Testing setEnrolledStudents()");
        StudentRecord[] newStudents = {sarah, mike};
        mathCourse.setEnrolledStudents(newStudents);
        System.out.println("Expected value = actual value?\t\t" 
            + (mathCourse.getEnrolledStudents().length == 2));
        mathCourse.setEnrolledStudents(students); // reset
        
        // Testing toString()
        System.out.println("\n..:: Testing toString()");
        String expectedToString = "== Mathematics 101 ==\n" 
            + "1.) James's scores: [75, 80, 82, 91, 96]\n" 
            + "2.) Sarah's scores: [88, 92, 87, 90, 93]\n" 
            + "3.) Mike's scores: [70, 75, 78, 80, 85]\n";
        System.out.println("Expected value = actual value?\t\t" 
            + mathCourse.toString().equals(expectedToString));
        
        // Testing findBestStudent()
        System.out.println("\n..:: Testing findBestStudent()");
        System.out.println("Expected value = actual value?\t\t" 
            + mathCourse.findBestStudent().equals("Sarah"));
        
        // Testing calculateTestAverage()
        System.out.println("\n..:: Testing calculateTestAverage()");
        System.out.println("Expected value = actual value?\t\t" 
            + (mathCourse.calculateTestAverage(0) == 77.66666666666667)); // avg of test 0
        System.out.println("Expected value = actual value?\t\t" 
            + (mathCourse.calculateTestAverage(4) == 91.33333333333333)); // avg of test 4
    }
}
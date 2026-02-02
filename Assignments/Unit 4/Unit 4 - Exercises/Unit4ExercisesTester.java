public class Unit4ExercisesTester {
    public static void main(String[] args) {
        testMatchingEndSequences();
    }

    public static void testMatchingEndSequences() {
        System.out.println("------------------------------");
        System.out.println(" Testing matchingEndSequences ");
        System.out.println("------------------------------");

        int[] nums = {5, 6, 45, 99, 13, 5 , 6};

        // Test Case 1
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\tfalse");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.matchingEndSequences(nums, 1));

        // Test Case 2
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\ttrue");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.matchingEndSequences(nums, 2));

        // Test Case 3
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\tfalse");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.matchingEndSequences(nums, 3));
    }
}

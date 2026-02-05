import java.util.ArrayList;
import java.util.Arrays;

public class Unit4ExercisesTester {
    public static void main(String[] args) {
        testMatchingEndSequences();

        testHasThreeConsecutive();

        testGenerateNumberSequence();

        testFizzBuzz();

        testMoveEvenBeforeOdd();

        testNoNegatives();

        testExcludeTeenNumbers();

        testAppendY();

        testSquarePlus10();
    }

    public static void testMatchingEndSequences() {
        System.out.println("------------------------------");
        System.out.println(" Testing matchingEndSequences ");
        System.out.println("------------------------------");

        int[] nums = { 5, 6, 45, 99, 13, 5, 6 };

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

    public static void testHasThreeConsecutive() {
        System.out.println("\n-----------------------------");
        System.out.println(" Testing hasThreeConsecutive ");
        System.out.println("-----------------------------");

        // Test Case 1
        int[] nums1 = { 2, 1, 3, 5 };
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\ttrue");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.hasThreeConsecutive(nums1));

        // Test Case 2
        int[] nums2 = { 2, 1, 2, 5 };
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\tfalse");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.hasThreeConsecutive(nums2));

        // Test Case 3
        int[] nums3 = { 2, 4, 2, 5 };
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\ttrue");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.hasThreeConsecutive(nums3));
    }

    public static void testGenerateNumberSequence() {
        System.out.println("\n--------------------------------");
        System.out.println(" Testing generateNumberSequence ");
        System.out.println("--------------------------------");

        // Test Case 1
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\t[5, 6, 7, 8, 9]");
        System.out.println("Actual output:\t\t\t" 
            + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(5, 10)));

        // Test Case 2
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\t[11, 12, 13, 14, 15, 16, 17]");
        System.out.println("Actual output:\t\t\t" 
            + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(11, 18)));

        // Test Case 3
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\t[1, 2]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(1, 3)));
    }

    public static void testFizzBuzz() {
        System.out.println("\n------------------");
        System.out.println(" Testing fizzBuzz ");
        System.out.println("------------------");

        // Test Case 1
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\t[1, 2, Fizz, 4, Buzz]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 6)));

        // Test Case 2
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\t[1, 2, Fizz, 4, Buzz, Fizz, 7]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 8)));

        // Test Case 3
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\t[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 11)));
    }

    public static void testMoveEvenBeforeOdd() {
        System.out.println("\n---------------------------");
        System.out.println(" Testing moveEvenBeforeOdd ");
        System.out.println("---------------------------");

        // Test Case 1
        int[] nums1 = { 1, 0, 1, 0, 0, 3, 1 };
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\t[0, 0, 0, 1, 1, 3, 1]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printIntegerArray(Unit4Exercises.moveEvenBeforeOdd(nums1)));

        // Test Case 2
        int[] nums2 = { 3, 3, 2 };
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\t[2, 3, 3]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printIntegerArray(Unit4Exercises.moveEvenBeforeOdd(nums2)));

        // Test Case 3
        int[] nums3 = { 2, 2, 2 };
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\t[2, 2, 2]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printIntegerArray(Unit4Exercises.moveEvenBeforeOdd(nums3)));
    }

    public static void testNoNegatives() {
        System.out.println("\n---------------------");
        System.out.println(" Testing noNegatives ");
        System.out.println("---------------------");

        // Test Case 1
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, -2));
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\t[1]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.noNegatives(nums1));

        // Test Case 2
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(-3, -3, 3, 3));
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\t[3, 3]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.noNegatives(nums2));

        // Test Case 3
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(-1, -1, -1));
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\t[]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.noNegatives(nums3));
    }

    public static void testExcludeTeenNumbers() {
        System.out.println("\n----------------------------");
        System.out.println(" Testing excludeTeenNumbers ");
        System.out.println("----------------------------");

        // Test Case 1
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(12, 13, 19, 20));
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\t[12, 20]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.excludeTeenNumbers(nums1));

        // Test Case 2
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 14, 1));
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\t[1, 1]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.excludeTeenNumbers(nums2));

        // Test Case 3
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(15));
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\t[]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.excludeTeenNumbers(nums3));
    }

    public static void testAppendY() {
        System.out.println("\n-----------------");
        System.out.println(" Testing appendY ");
        System.out.println("-----------------");

        // Test Case 1
        ArrayList<String> strs1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\t[ay, by, cy]");
        System.out.println("Actual output;\t\t\t" + Unit4Exercises.appendY(strs1));

        // Test Case 2
        ArrayList<String> strs2 = new ArrayList<String>(Arrays.asList("a", "b", "cy"));
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\t[ay, by]");
        System.out.println("Actual output;\t\t\t" + Unit4Exercises.appendY(strs2));

        // Test Case 3
        ArrayList<String> strs3 = new ArrayList<String>(Arrays.asList("xx", "ya", "zz"));
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\t[xxy, yay, zzy]");
        System.out.println("Actual output;\t\t\t" + Unit4Exercises.appendY(strs3));
    }

    public static void testSquarePlus10() {
        System.out.println("\n----------------------");
        System.out.println(" Testing squarePlus10 ");
        System.out.println("----------------------");

        // Test Case 1
        ArrayList<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(3, 1, 4));
        System.out.println("\n\t// Test Case 1");
        System.out.println("Expected output:\t\t[19, 11]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.squarePlus10(nums1));

        // Test Case 2
        ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(1));
        System.out.println("\n\t// Test Case 2");
        System.out.println("Expected output:\t\t[11]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.squarePlus10(nums2));

        // Test Case 3
        ArrayList<Integer> nums3 = new ArrayList<Integer>(Arrays.asList(2));
        System.out.println("\n\t// Test Case 3");
        System.out.println("Expected output:\t\t[14]");
        System.out.println("Actual output:\t\t\t" + Unit4Exercises.squarePlus10(nums3));
    }
}

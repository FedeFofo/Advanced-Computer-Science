public class Unit3ExercisesTester {
    public static void main(String[] args) {
        testCalculateAverageStringLength();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
    }

    public static void testCalculateAverageStringLength() {
        System.out.println("--------------------------------------");
        System.out.println(" Testing calculateAverageStringLength ");
        System.out.println("--------------------------------------\n");

        // Test Case - Main Case
        System.out.println("\t// Test Case - Main Case");
        String[] letters = new String[] {"abc", "def", "ghi", "jkl"};
        System.out.println("Expected output:\t\t3.0");
        System.out.println(
                "Actual output:\t\t\t" + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null Element in Array
        System.out.println("\n\t// Test Case - Edge Case: Null Element in Array");
        letters = new String[] {"abc", "def", "ghi", null, "jkl"};
        System.out.println("Expected output:\t\t3.0");
        System.out.println(
                "Actual output:\t\t\t" + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null Array
        System.out.println("\n\t// Test Case - Edge Case: Null Array");
        try {
            letters = null;
            Unit3Exercises.calculateAverageStringLength(letters);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method th rew an exception when the array was null, as intended.");
        }
    }

    public static void testReverseString() {
        System.out.println("\n-----------------------");
        System.out.println(" Testing reverseString ");
        System.out.println("-----------------------\n");

        // Test Case - Main Case
        System.out.println("\t// Test Case - Main Case");
        String testString = "abc";
        System.out.println("Expected output:\t\tcba");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: Spaces in String
        System.out.println("\n\t// Test Case - Edge Case: Spaces in String");
        testString = " ab c ";
        System.out.println("Expected output:\t\t c ba ");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String With Special Characters
        System.out.println("\n\t// Test Case - Edge Case: String With Special Characters");
        testString = "a1b!c&";
        System.out.println("Expected output:\t\t&c!b1a");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: Null String
        System.out.println("\n\t// Test Case - Edge Case: Null String");
        try {
            testString = null;
            System.out.println(Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the string was null, as intended.");
        }
    }

    public static void testFindMaxValue() {
        System.out.println("\n----------------------");
        System.out.println(" Testing findMaxValue ");
        System.out.println("----------------------\n");

        // Test Case - Main Case
        System.out.println("\t// Test Case - Main Case");
        int[] values = {6, 7, 3, 1, 4, 67};
        System.out.println("Expected output:\t\t67");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.findMaxValue(values));

        // Test Case - Edge Case: Array With Negatives and Zero
        System.out.println("\n\t// Test Case - Edge Case: Array With Negatives and Zero");
        values = new int[] {-6, -7, -3, -1, -4, -67, 0};
        System.out.println("Expected output:\t\t0");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.findMaxValue(values));

        // Test Case - Edge Case: Array With Negatives
        System.out.println("\n\t// Test Case - Edge Case: Array With Negatives");
        values = new int[] {-6, -7, -3, -1, -4, -67};
        System.out.println("Expected output:\t\t-1");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.findMaxValue(values));

        // Test Case - Edge Case: Null Array
        System.out.println("\n\t// Test Case - Edge Case: Null Array");
        try {
            values = null;
            Unit3Exercises.findMaxValue(values);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended.");
        }
    }

    public static void testIsPalindrome() {
        System.out.println("\n----------------------");
        System.out.println(" Testing isPalindrome ");
        System.out.println("----------------------\n");

        // Test Case - Main Case: Palindrome
        System.out.println("\t// Test Case - Main Case: Palindrome");
        String word = "racecar";
        System.out.println("Expected output:\t\ttrue");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.isPalindrome(word));

        // Test Case - Main Case: Non-Palindrome
        System.out.println("\n\t// Test Case - Main Case: Non-Palindrome");
        word = "food";
        System.out.println("Expected output:\t\tfalse");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.isPalindrome(word));

        // Test Case - Edge Case: Null String
        System.out.println("\n\t// Test Case - Edge Case: Null String");
        try {
            word = null;
            Unit3Exercises.isPalindrome(word);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the string was null, as intended.");
        }

        // Test Case - Edge Case: Empty String
        System.out.println("\n\t// Test Case - Edge Case: Empty String");
        try {
            word = "";
            Unit3Exercises.isPalindrome(word);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the string was empty, as intended.");
        }
    }

    public static void testSumEvenNumbers() {
        System.out.println("\n------------------------");
        System.out.println(" Testing sumEvenNumbers ");
        System.out.println("------------------------\n");

        // Test Case - Main Case
        System.out.println("\t// Test Case - Main Case");
        int[] values = {6, 77, 886, 67, 52, 973};
        System.out.println("Expected output:\t\t944");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.sumEvenNumbers(values));

        // Test Case - Edge Case: Only Negatives
        System.out.println("\n\t// Test Case - Edge Case: Only Negatives");
        values = new int[] {-6, -77, -886, -67, -52, -973};
        System.out.println("Expected output:\t\t-944");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.sumEvenNumbers(values));

        // Test Case - Edge Case: Positives and Negatives
        System.out.println("\n\t// Test Case - Edge Case: Positives and Negatives");
        values = new int[] {6, -77, -886, -67, 52, 973};
        System.out.println("Expected output:\t\t-828");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.sumEvenNumbers(values));

        // Test Case - Edge Case: Null Array
        System.out.println("\n\t// Test Case - Edge Case: Null Array");
        try {
            values = null;
            Unit3Exercises.sumEvenNumbers(values);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended.");
        }

    }
}

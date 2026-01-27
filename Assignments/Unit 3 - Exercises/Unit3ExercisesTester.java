public class Unit3ExercisesTester {
    public static void main(String[] args) {
        testCalculateAverageStringLength();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testCalculateSumOfSquares();
        testGetNthFibonacci();
        testSortArrayDescending();
        testFindLongestWord();
        testCalculateInterest();
        testParsePositiveInteger();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
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
            System.out.println(e);
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
            System.out.println(e);
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
            System.out.println(e);
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
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the string was null, as intended.");
        }

        // Test Case - Edge Case: Empty String
        System.out.println("\n\t// Test Case - Edge Case: Empty String");
        try {
            word = "";
            Unit3Exercises.isPalindrome(word);
        } catch (Exception e) {
            System.out.println(e);
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
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the array was null, as intended.");
        }

    }

    public static void testCalculateSumOfSquares() {
        System.out.println("\n-------------------------------");
        System.out.println(" Testing calculateSumOfSquares ");
        System.out.println("-------------------------------\n");

        // Test Case - Main Case
        System.out.println("\t// Test Case - Main Case");
        int[] values = {6, 2, 3, 5};
        System.out.println("Expected output:\t\t74");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.calculateSumOfSquares(values));

        // Test Case - Edge Case: Null Array
        System.out.println("\n\t// Test Case - Edge Case: Null Array");
        try {
            values = null;
            Unit3Exercises.calculateSumOfSquares(values);
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the array was null, as intended.");
        }
    }

    public static void testGetNthFibonacci() {
        System.out.println("\n-------------------------");
        System.out.println(" Testing getNthFibonacci ");
        System.out.println("-------------------------\n");

        // Test Case - Main Case: Regular #1
        System.out.println("\t// Test Case - Main Case: Regular #1");
        int number = 4;
        System.out.println("Expected output:\t\t3");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.getNthFibonacci(number));

        // Test Case - Main Case: Regular #2
        System.out.println("\n\t// Test Case - Main Case: Regular #2");
        number = 6;
        System.out.println("Expected output:\t\t8");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.getNthFibonacci(number));

        // Test Case - Edge Case: Negative Input
        System.out.println("\n\t// Test Case - Edge Case: Negative Integer");
        try {
            number = -4;
            Unit3Exercises.getNthFibonacci(number);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the integer was negative, as intended.");
        }
    }

    public static void testSortArrayDescending() {
        System.out.println("\n-----------------------------");
        System.out.println(" Testing sortArrayDescending ");
        System.out.println("-----------------------------\n");

        // Test Case - Main Case: Positive Integers
        System.out.println("\t// Test Case - Main Case: Positive Integers");
        int[] values = {67, 100, 50, 21, 16, 3};
        System.out.println("Expected output:\t\t[100, 67, 50, 21, 16, 3]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printIntegerArray(Unit3Exercises.sortArrayDescending(values)));

        // Test Case - Main Case: Negative Integers
        System.out.println("\n\t// Test Case - Main Case: Negative Integers");
        values = new int[] {-67, -100, -50, -21, -16, -3};
        System.out.println("Expected output:\t\t[-3, -16, -21, -50, -67, -100]");
        System.out.println("Actual output:\t\t\t"
                + Utils.printIntegerArray(Unit3Exercises.sortArrayDescending(values)));

        // Test Case - Edge Case: Null Array
        System.out.println("\n\t// Test Case - Edge Case: Null Array");
        try {
            values = null;
            Unit3Exercises.sortArrayDescending(values);
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the array was null, as intended.");
        }
    }

    public static void testFindLongestWord() {
        System.out.println("\n-------------------------");
        System.out.println(" Testing findLongestWord ");
        System.out.println("-------------------------\n");

        // Test Case - Main Case: Regular #1
        System.out.println("\t// Test Case - Main Case: Regular #1");
        String sentence = "My name is James";
        System.out.println("Expected output:\t\tJames");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.findLongestWord(sentence));

        // Test Case - Main Case: Regular #2
        System.out.println("\n\t// Test Case - Main Case: Regular #2");
        sentence = "Today is a warm, sunny, and beautiful day.";
        System.out.println("Expected output:\t\tbeautiful");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.findLongestWord(sentence));

        // Test Case - Main Case: Multiple Longest Words
        System.out.println("\n\t// Test Case - Main Case: Multiple Longest Words");
        sentence = "I was sleepy when I got into bed last night.";
        System.out.println("Expected output:\t\tsleepy");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.findLongestWord(sentence));

        // Test Case - Edge Case: Null String
        System.out.println("\n\t// Test Case - Edge Case: Null String");
        try {
            sentence = null;
            Unit3Exercises.findLongestWord(sentence);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the string was null, as intended.");
        }

        // Test Case - Edge Case: Empty String
        System.out.println("\n\t// Test Case - Edge Case: Empty String");
        try {
            sentence = "";
            Unit3Exercises.findLongestWord(sentence);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the string was empty, as intended.");
        }
    }

    public static void testCalculateInterest() {
        System.out.println("\n---------------------------");
        System.out.println(" Testing calculateInterest ");
        System.out.println("---------------------------\n");

        // Test Case - Main Case: Regular #1
        System.out.println("\t// Test Case - Main Case: Regular #1");
        System.out.println("Expected output:\t\t3221.02");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.calculateInterest(2000, 10, 5));

        // Test Case - Main Case: Regular #2
        System.out.println("\n\t// Test Case - Main Case: Regular #2");
        System.out.println("Expected output:\t\t39799.47");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.calculateInterest(15000, 5, 20));

        // Test Case - Edge Case: Negative Principal Amount
        System.out.println("\n\t// Test Case - Edge Case: Negative Principal Amount");
        try {
            Unit3Exercises.calculateInterest(-1000, 5, 10);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the principal amount was negative, as intended.");
        }

        // Test Case - Edge Case: Negative Interest Rate
        System.out.println("\n\t// Test Case - Edge Case: Negative Interest Rate");
        try {
            Unit3Exercises.calculateInterest(1000, -5, 10);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the interest rate was negative, as intended.");
        }

        // Test Case - Edge Case: Negative Number of Years
        System.out.println("\n\t// Test Case - Edge Case: Negative Number of Years");
        try {
            Unit3Exercises.calculateInterest(1000, 5, -10);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the number of years was at or below zero, as intended.");
        }

        // Test Case - Edge Case: Zero Years
        System.out.println("\n\t// Test Case - Edge Case: Zero Years");
        try {
            Unit3Exercises.calculateInterest(1000, 5, 0);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the number of years was at or below zero, as intended.");
        }
    }

    public static void testParsePositiveInteger() {
        System.out.println("\n------------------------------");
        System.out.println(" Testing parsePositiveInteger ");
        System.out.println("------------------------------\n");

        // Test Case - Edge Case: Negative Parsed Integer
        System.out.println("\t// Test Case - Edge Case: Negative Parsed Integer");
        try {
            Unit3Exercises.parsePositiveInteger("-5");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the parsed integer was negative, as intended.");
        }
    }

    public static void testGetArrayElement() {
        System.out.println("\n-------------------------");
        System.out.println(" Testing getArrayElement ");
        System.out.println("-------------------------\n");

        // Test Case - Edge Case: Index Out of Bounds
        System.out.println("\t// Test Case - Edge Case: Index Out of Bounds");
        try {
            String[] words = new String[] {"hello", "my", "name", "is"};
            Unit3Exercises.getArrayElement(words, 4);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the index was out of bounds, as intended.");
        }
    }

    public static void testCalculateSquareRoot() {
        System.out.println("\n-----------------------------");
        System.out.println(" Testing calculateSquareRoot ");
        System.out.println("-----------------------------\n");

        // Test Case - Edge Case: Negative Number
        System.out.println("\t// Test Case - Edge Case: Negative Number");
        try {
            Unit3Exercises.calculateSquareRoot(-16);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the number to be square rooted was negative, as intended.");
        }
    }

    public static void testSumArrayElements() {
        System.out.println("\n--------------------------");
        System.out.println(" Testing sumArrayElements ");
        System.out.println("--------------------------\n");

        // Test Case - Edge Case: Null Array
        System.out.println("\t// Test Case - Edge Case: Null Array");
        System.out.println("Expected output:\t\t0");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.sumArrayElements(null));
        System.out.println("The method threw an exception when the array was null, as intended.");
    }

    public static void testCalculatePower() {
        System.out.println("\n------------------------");
        System.out.println(" Testing calculatePower ");
        System.out.println("------------------------\n");

        // Test Case - Edge Case: Negative Exponent
        System.out.println("\t// Test Case - Edge Case: Negative Exponent");
        System.out.println("Expected output:\t\t1.0");
        System.out.println("Actual output:\t\t\t" + Unit3Exercises.calculatePower(2, -4));
        System.out.println(
                "The method threw an exception when the exponent was negative, as intended.");
    }
}

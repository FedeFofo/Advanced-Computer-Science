import java.util.ArrayList;
import java.util.Arrays;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        int[] frontArray = new int[n];
        for (int i = 0; i < n; i++) {
            frontArray[i] = nums[i];
        }

        int[] backArray = new int[n];
        for (int i = 0; i < n; i++) {
            backArray[n - 1 - i] = nums[nums.length - 1 - i];
        }

        return Arrays.equals(frontArray, backArray);
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        int consecutiveCount = 0;
        int previous = 2;
        for (int number : nums) {
            int result = number % 2;
            if (result == previous) {
                consecutiveCount++;
            } else {
                consecutiveCount = 0;
            }
            previous = result;
            if (consecutiveCount == 3) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] sequence = new int[end - start];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = start + i;
        }
        return sequence;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        int[] sequence = generateNumberSequence(start, end);
        String[] stringSequence = new String[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            stringSequence[i] = String.valueOf(sequence[i]);
        }
        for (String num : stringSequence) {
            if (((Integer.valueOf(num) % 3) == 0) && ((Integer.valueOf(num) % 5) == 0)) {
                num = "FizzBuzz";
            } else if ((Integer.valueOf(num) % 3) == 0) {
                num = "Fizz";
            } else if ((Integer.valueOf(num) % 5) == 0) {
                num = "Buzz";
            }
        }
        return stringSequence;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method
        return new int[0];
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}

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
                consecutiveCount = 1;
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
        if (end - start < 0) {
            return new int[0];
        }
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
        for (int i = 0; i < stringSequence.length; i++) {
            if (((Integer.valueOf(stringSequence[i]) % 3) == 0)
                    && ((Integer.valueOf(stringSequence[i]) % 5) == 0)) {
                stringSequence[i] = "FizzBuzz";
            } else if ((Integer.valueOf(stringSequence[i]) % 3) == 0) {
                stringSequence[i] = "Fizz";
            } else if ((Integer.valueOf(stringSequence[i]) % 5) == 0) {
                stringSequence[i] = "Buzz";
            }
        }
        return stringSequence;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] rearrangedNums = new int[nums.length];
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                rearrangedNums[evenIndex] = nums[i];
                evenIndex++;
            }
        }
        for (int i = 0; i < rearrangedNums.length; i++) {
            if (nums[i] % 2 != 0) {
                rearrangedNums[evenIndex] = nums[i];
                evenIndex++;
            }
        }
        return rearrangedNums;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        ArrayList<Integer> noNegatives = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (num >= 0) {
                noNegatives.add(num);
            }
        }
        return noNegatives;
    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> noTeens = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (!(num >= 13 && num <= 19)) {
                noTeens.add(num);
            }
        }
        return noTeens;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> withY = new ArrayList<String>();
        for (String str : strs) {
            if (str.equals("")) {
                withY.add("y");
                continue;
            }
            if (!(str.charAt(str.length() - 1) == 'y')) {
                withY.add(str + "y");
            }
        }
        return withY;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (Integer num : nums) {
            Integer result = (int) (Math.pow(num, 2)) + 10;
            if (!((result % 10) == 5 || (result % 10) == 6)) {
                results.add(result);
            }
        }
        return results;
    }
}

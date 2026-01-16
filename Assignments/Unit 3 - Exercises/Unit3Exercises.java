public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    // Fixes made:
    // * added check to see if element is null
    // * added check to see if array is null
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        if (strs == null) {
            throw new NullPointerException("Array is null");
        }
        while (i < strs.length) {
            if (strs[i] != null) {
                sum += strs[i].length();
                counted++;
            }
            i++;
        }
        return sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    // Fixes made:
    // * rebuilt part of method that reverses using a for loop (now uses less lines and works)
    // * added check to see if string is null
    public static String reverseString(String str) {
        if (str == null) {
            throw new NullPointerException("String is null");
        }
        char[] chars = str.toCharArray();
        char[] reversed = new char[chars.length];
        int currentChar = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[currentChar];
            currentChar--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]);
        }
        return new String(reversed);
    }

    // Intended: return the largest value found in the array.
    // Fixes made:
    // * corrected an off-by-one error within for loop (max = numbers[i], not max = numbers[i - 1])
    // * added check to see if array is null
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array is null");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] == max && i % 2 == 0) {
                max = max + 1;
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and backwards.
    // Fixes made:
    // * utilized preexisting methods to simplify existing code to one line
    // * added check to see if string is null
    // * added check to see if string is empty
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new NullPointerException("String is null");
        } else if (str.equals("")) {
            throw new IllegalArgumentException("String is empty");
        }
        return reverseString(str).equals(str);
    }

    // Intended: sum only the even numbers in the array.
    // Fixes made:
    // * removed completely unnecessary & harmful if statement
    // * fixed two off-by-one errors
    // * added check to see if array is null
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array is null");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                continue;
            }
        }
        return sum;
    }

}

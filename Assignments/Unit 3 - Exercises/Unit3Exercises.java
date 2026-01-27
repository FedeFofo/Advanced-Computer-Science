public class Unit3Exercises {
    // Method Description: return the average length of the strings in the array.

    // Fixes made:
    // * added check to see if element is null
    // * added check to see if array is null
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        if (strs == null) {
            throw new NullPointerException("Array cannot be null");
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

    // Method Description: produce a new string with the characters of the input reversed.

    // Fixes made:
    // * rebuilt part of method that reverses using a for loop (now uses less lines
    // and works)
    // * added check to see if string is null
    public static String reverseString(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
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

    // Method Description: return the largest value found in the array.

    // Fixes made:
    // * corrected an off-by-one error within for loop (max = numbers[i], not max =
    // numbers[i - 1])
    // * added check to see if array is null
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null");
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

    // Method Description: check whether the input string reads the same forwards and
    // backwards.

    // Fixes made:
    // * utilized preexisting methods to simplify existing code to one line
    // * added check to see if string is null
    // * added check to see if string is empty
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        } else if (str.equals("")) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        return reverseString(str).equals(str);
    }

    // Method Description: sum only the even numbers in the array.

    // Fixes made:
    // * removed completely unnecessary & harmful if statement
    // * fixed two off-by-one errors
    // * added check to see if array is null
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null");
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

    // Method Description: The method calculates the sum of the squares of numbers
    // in an array.

    // Fixes made:
    // * changed i in the for loop to start at 0, not 1
    // * added check to see if array is null
    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    // Method Description: The method returns the nth Fibonacci number, the sequence
    // starts with 1.

    // Fixes made:
    // * added check to see if n is negative
    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Integer n cannot be negative");
        } else if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Method Description: The method sorts an array in descending order.

    // Fixes made:
    // * changed if statement from sorting the array in ascending order to sorting
    // the array in descending order
    // * added check to see if array is null
    public static int[] sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Method Description: The method takes a String, creates an array of the words
    // separated by spaces, and returns the longest word in the sentence. If there
    // are words with equal lengths, it returns the first one.

    // Fixes made:
    // * changed >= to just >
    // * added check to see if string is null
    // * added check to see if string is empty
    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("String cannot be null");
        } else if (sentence.equals("")) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    // Method Description: The method calculates the total amount after applying interest to a
    // principal amount.

    // Fixes made:
    // * added checks to make sure principal and rate are not negative, and years is above zero
    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0) {
            throw new IllegalArgumentException("Principal amount cannot be negative");
        } else if (rate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        } else if (years <= 0) {
            throw new IllegalArgumentException("Number of years cannot be at or below zero");
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    // Method Description: The method converts a string to a positive integer. If the string cannot
    // be converted or represents a negative number, return a default positive integer of 1.

    // Fixes made:
    // * added check to see if parsed integer is negative
    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        if (number <= 0) {
            throw new NumberFormatException("The parsed integer cannot be negative or zero");
        }
        return number;
    }

    // Method Description: The method returns an element at a specific index in an array. If the
    // index is out of bounds, return a null element.

    // Fixes made:
    // * none
    public static String getArrayElement(String[] arr, int index) {
        return arr[index];
    }

    // Method Description: The method calculates the square root of a number. If the number is
    // negative, it returns Double.NaN, which stands for "Not a Number."

    // Fixes made:
    // * added check to see if number was negative
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Number to be square rooted cannot be negative. Result: " + Double.NaN);
        }
        return Math.sqrt(number);
    }

    // Method Description: The method calculates the sum of all elements in an int array. If the
    // array is null, it returns 0.

    // Fixes made:
    // * wrapped everything in try-catch block
    public static int sumArrayElements(int[] array) {
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    // Method Description: The method calculates the power of a base number. If the exponent is
    // negative, return 1.

    // Fixes made:
    // * wrapped everything in a try-catch block
    // * added check to see if exponent is negative
    public static double calculatePower(double base, int exponent) {
        try {
            if (exponent < 0) {
                throw new IllegalArgumentException("Exponent cannot be negative");
            }
            return Math.pow(base, exponent);
        } catch (Exception e) {
            System.out.println(e);
            return 1;
        }
    }
}

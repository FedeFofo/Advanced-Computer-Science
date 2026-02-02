public class ArrayOps {

    public static String printStringArray(String[] array) {
        String printedArray = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                printedArray += array[i] + "]";
            } else {
                printedArray += array[i] + ", ";
            }
        }
        if (printedArray.charAt(printedArray.length() - 1) == ']') {
            return printedArray;
        } else {
            printedArray += "]";
            return printedArray;
        }
    }

    public static String printIntegerArray(int[] array) {
        String printedArray = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                printedArray += array[i] + "]";
            } else {
                printedArray += array[i] + ", ";
            }
        }
        return printedArray;
    }
    
    public static int findMax(int[] array) {
        int biggestNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggestNum) {
                biggestNum = array[i];
            }
        }
        return biggestNum;
    }

    public static String findLongestString(String[] array) {
        int largestLength = array[0].length();
        int longestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else if (array[i].length() > largestLength) {
                largestLength = array[i].length();
                longestIndex = i;
            }
        }
        return array[longestIndex];
    }

    public static double averageStringLength(String[] array) {
        if (array == null) {
            return 0.0;
        }
        double sum = 0;
        int totalStrings = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                totalStrings -= 1;
            } else {
                sum += array[i].length();
            }
        }
        if (totalStrings == 0) {
            return 0.0;
        }
        return sum / totalStrings;
    }

    public static int[] countLetterFrequencies(String input) {
        if (input == null) {
            return new int[0];
        }
        int[] frequencies = new int[26];
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            int letter = (int) input.charAt(i);
            letter -= 97;
            if (letter >= 0 && letter <= 25) {
                frequencies[letter] += 1;
            }
        }
        return frequencies;
    }

    public static int[] removeIntAndScoot(int[] array, int index) {
        int[] updated = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < index) {
                updated[i] = array[i];
            } else if (i >= index) {
                updated[i] = array[i + 1];
            }
        }
        updated[array.length - 1] = 0;
        return updated;
    }

    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0;
            }
        }
        return newArray;
    }

    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            return new String[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = null;
            } else {
                array[i] = "#" + i + " " + array[i];
            }
        }
        return array;
    }

    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] reversedArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[index] = array[i];
            index++;
        }
        return reversedArray;
    }
}
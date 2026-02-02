public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if ((day == 0 || day == 6) && !vacation) {
            return "10:00";
        } else if (!vacation) {
            return "7:00";
        } else if ((day == 0 || day == 6) && vacation) {
            return "off";
        } else {
            return "10:00";
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c && a == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        str = str.toLowerCase();
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString += str.charAt(i);
            newString += str.charAt(i);
        }
        return newString;

    }

    public static int countHi(String str) {
        str = str.toLowerCase();
        int sum = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                sum++;
            }
        }
        return sum;
    }

    public static boolean catDog(String str) {
        str = str.toLowerCase();
        int countCats = 0;
        int countDogs = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCats++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                countDogs++;
            }
        }
        return countCats == countDogs;
    }

    public static String mixString(String a, String b) {
        String newString = "";
        int times = 0;
        if (a.length() < b.length()) {
            times = a.length();
        } else {
            times = b.length();
        }
        for (int i = 0; i < times; i++) {
            newString += a.charAt(i);
            newString += b.charAt(i);
        }
        if (a.length() > b.length()) {
            newString += a.substring(times);
        } else if (b.length() > a.length()) {
            newString += b.substring(times);
        }
        return newString;
    }

    public static String repeatEnd(String str, int n) {
        String endOfStr = str.substring(str.length() - n);
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += endOfStr;
        }
        return newString;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public static int countCode(String str) {
        int code = 0;
        if (str.length() < 4) {
            return code;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                code++;
            }
        }
        return code;
    }

    public static int countEvens(int[] nums) {
        int evens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                threeCount++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return threeCount == 3;
    }

    public static String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

    public static int[] zeroFront(int[] nums) {
        int[] newArray = new int[nums.length];
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }
        int index = zeroCount;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArray[index] = nums[i];
                index++;
            }
        }
        return newArray;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int targetCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                targetCount++;
            }
        }
        int index = 0;
        String[] newArray = new String[words.length - targetCount];
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                continue;
            } else {
                newArray[index] = words[i];
                index++;
            }
        }
        return newArray;
    }

    public static int scoresAverage(int[] scores) {
        int firstHalfAverage = average(scores, 0, scores.length / 2);
        int secondHalfAverage = average(scores, scores.length / 2, scores.length);
        if (firstHalfAverage > secondHalfAverage) {
            return firstHalfAverage;
        } else {
            return secondHalfAverage;
        }
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

    public static boolean scoresIncreasing(int[] scores) {
        int previousNumber = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] >= previousNumber) {
                previousNumber = scores[i];
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int firstSpecial = findLargestSpecial(a);
        int secondSpecial = findLargestSpecial(b);
        return firstSpecial + secondSpecial;
    }

    public static int findLargestSpecial(int[] scores) {
        int largestSpecial = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 == 0 && scores[i] > largestSpecial) {
                largestSpecial = scores[i];
            }
        }
        return largestSpecial;
    }

    public static String firstTwo(String str) {
        if (str.length() == 1) {
            return str + "*";
        } else if (str.length() == 0) {
            return "**";
        }
        return str.substring(0, 2);
    }

    public static double divide(int a, int b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }
        if (a > b) {
            return (double) a / b;
        }
        return (double) b / a;
    }
}

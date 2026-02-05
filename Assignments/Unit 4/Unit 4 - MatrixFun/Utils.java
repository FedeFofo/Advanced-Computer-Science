public class Utils {
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

    public static int generateRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

public class ArrayOpsTester {
    public static void main(String[] args) {

        // Testing printStringArray()
        System.out.println("-----------------------------");
        System.out.println(" Testing printStringArray(): ");
        System.out.println("-----------------------------");

        String[] stringArr1 = {"apple", "banana", "kiwi", "orange"};
        System.out.println("\tprintStringArray(stringArr1)");
        System.out.println("Expected output:\t[apple, banana, kiwi, orange]");
        System.out.println("Actual output:\t\t" + ArrayOps.printStringArray(stringArr1) + "\n");

        String[] stringArr2 = {"cat", "dog", "elephant", "lion"};
        System.out.println("\tprintStringArray(stringArr2)");
        System.out.println("Expected output:\t[cat, dog, elephant, lion]");
        System.out.println("Actual output:\t\t" + ArrayOps.printStringArray(stringArr2) + "\n");

        String[] stringArr3 = {"red", "green", "blue", "yellow"};
        System.out.println("\tprintStringArray(stringArr3)");
        System.out.println("Expected output:\t[red, green, blue, yellow]");
        System.out.println("Actual output:\t\t" + ArrayOps.printStringArray(stringArr3) + "\n");

        // Testing printIntegerArray()
        System.out.println("------------------------------");
        System.out.println(" Testing printIntegerArray(): ");
        System.out.println("------------------------------");

        int[] intArr1 = {1, 2, 3, 4, 5};
        System.out.println("\tprintIntegerArray(intArr1)");
        System.out.println("Expected output:\t[1, 2, 3, 4, 5]");
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(intArr1) + "\n");

        int[] intArr2 = {10, 20, 30, 40, 50};
        System.out.println("\tprintIntegerArray(intArr2)");
        System.out.println("Expected output:\t[10, 20, 30, 40, 50]");
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(intArr2) + "\n");

        int[] intArr3 = {-1, -2, -3, -4, -5};
        System.out.println("\tprintIntegerArray(intArr3)");
        System.out.println("Expected output:\t[-1, -2, -3, -4, -5]");
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(intArr3) + "\n");

        // Testing findMax()
        System.out.println("--------------------");
        System.out.println(" Testing findMax(): ");
        System.out.println("--------------------");

        int[] intArr4 = {5, 10, 3, 8, 2};
        System.out.println("\tfindMax(intArr4)");
        System.out.println("Expected output:\t10");
        System.out.println("Actual output:\t\t" + ArrayOps.findMax(intArr4) + "\n");

        int[] intArr5 = {-1, -5, -3, -2, -8};
        System.out.println("\tfindMax(intArr5)");
        System.out.println("Expected output:\t-1");
        System.out.println("Actual output:\t\t" + ArrayOps.findMax(intArr5) + "\n");
        
        int[] intArr6 = {100, 200, 300, 400, 500};
        System.out.println("\tfindMax(intArr6)");
        System.out.println("Expected output:\t500");
        System.out.println("Actual output:\t\t" + ArrayOps.findMax(intArr6) + "\n");

        // Testing findLongestString()
        System.out.println("------------------------------");
        System.out.println(" Testing findLongestString(): ");
        System.out.println("------------------------------");
        
        System.out.println("\tfindLongestString(stringArr1)");
        System.out.println("Expected output:\tbanana");
        System.out.println("Actual output:\t\t" + ArrayOps.findLongestString(stringArr1) + "\n");
        
        System.out.println("\tfindLongestString(stringArr2)");
        System.out.println("Expected output:\telephant");
        System.out.println("Actual output:\t\t" + ArrayOps.findLongestString(stringArr2) + "\n");
        
        System.out.println("\tfindLongestString(stringArr3)");
        System.out.println("Expected output:\tyellow");
        System.out.println("Actual output:\t\t" + ArrayOps.findLongestString(stringArr3) + "\n");

        // Testing averageStringLength()
        System.out.println("--------------------------------");
        System.out.println(" Testing averageStringLength(): ");
        System.out.println("--------------------------------");

        System.out.println("\taverageStringLength(stringArr1)");
        System.out.println("Expected output:\t5.25");
        System.out.println("Actual output:\t\t" + ArrayOps.averageStringLength(stringArr1) + "\n");

        System.out.println("\taverageStringLength(stringArr2)");
        System.out.println("Expected output:\t4.5");
        System.out.println("Actual output:\t\t" + ArrayOps.averageStringLength(stringArr2) + "\n");

        System.out.println("\taverageStringLength(stringArr3)");
        System.out.println("Expected output:\t4.5");
        System.out.println("Actual output:\t\t" + ArrayOps.averageStringLength(stringArr3) + "\n");

        // Testing countLetterFrequencies()
        System.out.println("-----------------------------------");
        System.out.println(" Testing countLetterFrequencies(): ");
        System.out.println("-----------------------------------");

        String input1 = "Hello, World!";
        System.out.println("\tcountLetterFrequencies(input1)");
        System.out.println("Expected output:\t[0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 3, 0, 0, " 
            + "2, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0]");
        int[] frequencies1 = ArrayOps.countLetterFrequencies(input1);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(frequencies1) + "\n");

        String input2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        System.out.println("\tcountLetterFrequencies(input2)");
        System.out.println("Expected output:\t[2, 0, 3, 2, 5, 0, 1, 0, 6, 0, 0, 3, 3, 2, " 
            + "4, 2, 0, 3, 4, 5, 2, 0, 0, 0, 0, 0]");
        int[] frequencies2 = ArrayOps.countLetterFrequencies(input2);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(frequencies2) + "\n");

        String input3 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("\tcountLetterFrequencies(input3)");
        System.out.println("Expected output:\t[1, 1, 1, 1, 3, 1, 1, 2, 1, 1, 1, 1, 1, 1, " 
            + "4, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1]");
        int[] frequencies3 = ArrayOps.countLetterFrequencies(input3);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(frequencies3) + "\n");

        // Testing removeIntAndScoot()
        System.out.println("------------------------------");
        System.out.println(" Testing removeIntAndScoot(): ");
        System.out.println("------------------------------");

        System.out.println("\tremoveIntAndScoot(intArr1, 2)");
        System.out.println("Expected output:\t[1, 2, 4, 5, 0]");
        int[] arr1Update = ArrayOps.removeIntAndScoot(intArr1, 2);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(arr1Update) + "\n");

        System.out.println("\tremoveIntAndScoot(intArr2, 3)");
        System.out.println("Expected output:\t[10, 20, 30, 50, 0]");
        int[] arr2Update = ArrayOps.removeIntAndScoot(intArr2, 3);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(arr2Update) + "\n");

        System.out.println("\tremoveIntAndScoot(intArr3, 0)");
        System.out.println("Expected output:\t[-2, -3, -4, -5, 0]");
        int[] arr3Update = ArrayOps.removeIntAndScoot(intArr3, 0);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(arr3Update) + "\n");

        // Testing resizeIntArray()
        System.out.println("---------------------------");
        System.out.println(" Testing resizeIntArray(): ");
        System.out.println("---------------------------");

        System.out.println("\tresizeIntArray(intArr1)");
        System.out.println("Expected output:\t[1, 2, 3, 4, 5, 0, 0, 0, 0, 0]");
        int[] resizedArr1 = ArrayOps.resizeIntArray(intArr1);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(resizedArr1) + "\n");

        System.out.println("\tresizeIntArray(intArr2)");
        System.out.println("Expected output:\t[10, 20, 30, 40, 50, 0, 0, 0, 0, 0]");
        int[] resizedArr2 = ArrayOps.resizeIntArray(intArr2);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(resizedArr2) + "\n");

        System.out.println("\tresizeIntArray(intArr3)");
        System.out.println("Expected output:\t[-1, -2, -3, -4, -5, 0, 0, 0, 0, 0]");
        int[] resizedArr3 = ArrayOps.resizeIntArray(intArr3);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(resizedArr3) + "\n");

        // Testing addNumToStringArray()
        System.out.println("--------------------------------");
        System.out.println(" Testing addNumToStringArray(): ");
        System.out.println("--------------------------------");

        System.out.println("\taddNumToStringArray(stringArr1)");
        System.out.println("Expected output:\t[#0 apple, #1 banana, #2 kiwi, #3 orange]");
        String[] modifiedArr1 = ArrayOps.addNumToStringArray(stringArr1);
        System.out.println("Actual output:\t\t" + ArrayOps.printStringArray(modifiedArr1) + "\n");

        System.out.println("\taddNumToStringArray(stringArr2)");
        System.out.println("Expected output:\t[#0 cat, #1 dog, #2 elephant, #3 lion]");
        String[] modifiedArr2 = ArrayOps.addNumToStringArray(stringArr2);
        System.out.println("Actual output:\t\t" + ArrayOps.printStringArray(modifiedArr2) + "\n");

        System.out.println("\taddNumToStringArray(stringArr3)");
        System.out.println("Expected output:\t[#0 red, #1 green, #2 blue, #3 yellow]");
        String[] modifiedArr3 = ArrayOps.addNumToStringArray(stringArr3);
        System.out.println("Actual output:\t\t" + ArrayOps.printStringArray(modifiedArr3) + "\n");

        // Testing reverseIntArray()
        System.out.println("----------------------------");
        System.out.println(" Testing reverseIntArray(): ");
        System.out.println("----------------------------");

        System.out.println("\treverseIntArray(intArr1)");
        System.out.println("Expected output:\t[5, 4, 3, 2, 1]");
        int[] reversedArr1 = ArrayOps.reverseIntArray(intArr1);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(reversedArr1) + "\n");

        System.out.println("\treverseIntArray(intArr2)");
        System.out.println("Expected output:\t[50, 40, 30, 20, 10]");
        int[] reversedArr2 = ArrayOps.reverseIntArray(intArr2);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(reversedArr2) + "\n");

        System.out.println("\treverseIntArray(intArr3)");
        System.out.println("Expected output:\t[-5, -4, -3, -2, -1]");
        int[] reversedArr3 = ArrayOps.reverseIntArray(intArr3);
        System.out.println("Actual output:\t\t" + ArrayOps.printIntegerArray(reversedArr3) + "\n");
    }
}
public class DecompositionSolution {

    public static void run() {
        int[] hours = hoursArray();
        int[] steps = stepsArray();
        int[] activeMinutes = activeMinutesArray();

        // Validator
        if (!equalLengths(hours, steps, activeMinutes)) {
            System.out.println("Invalid input: arrays must be the same length.");
            return;
        }

        // Total steps
        int totalSteps = sum(steps);

        double averageSteps = average(totalSteps);

        int totalActiveMinutes = sum(activeMinutes);
        double averageActiveMinutes = average(activeMinutes);
        int activeHalfHourCount = countHalfHours(activeMinutes);
    }

    public static int[] hoursArray() {
        return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    }

    public static int[] stepsArray() {
        return new int[] { 120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900 };
    }

    public static int[] activeMinutesArray() {
        return new int[] { 2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15 };
    }

    public static boolean equalLengths(int[] array1, int[] array2, int[] array3) {
        return array1.length == array2.length && array2.length == array3.length;
    }

    public static int sum(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        return sumTotal;
    }

    public static double average(int[] array) {
        int total = sum(array);

        return (double) total / array.length;
    }

    public static int countHalfHours(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] >= 30) {
                count++;
            }
        }
        return count;
    }

    
    // Methods have to have a signle purpose
}
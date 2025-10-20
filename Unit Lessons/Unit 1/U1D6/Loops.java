public class Loops {
    public static void main(String[] args) {

        // loop 1
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        // loop 2
        boolean isRunning = true;
        while (isRunning) {
            count++;
            if (count == 100) {
                isRunning = false;
            }
        }

        // loop 3
        for (int count2 = 0; count2 < 10; count2++) {
            System.out.println(count2);
        }

        // a for-loop is best when you know the exact number of iterations (repetitions)
        // a for-loop is more compact with its syntax

        // a while loop is best when you DON'T know the exact number of repetitions
        // a while loop requires the initialization to be outside of the loop, and the
        // iterator to be updated inside the loop

        // loop 4 - dowhile loops
        do {
            System.out.println("do this first");
            System.out.println("then check condition");
        } while (isRunning);

        // loop 5
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("All work and no play makes Jack a dull boy");
            }
        }

        // keep the maximum level of nested loops to 2!

        // while (true) {
        //     while (true) {
        //         System.out.println("Hello, World!");
        //     }
        // }
    }
}
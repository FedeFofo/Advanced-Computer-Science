public class ConditionalChallenge {
    public static void main(String[] args) {

        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 75.0;
        boolean isCold = false;
        System.out.println("Initial temperature: " + temperature);
        System.out.println("isCold: " + isCold);
        if (isCold) {
            temperature -= 15;
        } else {
            temperature += 10;
        }
        System.out.println("New temperature: " + temperature);
        System.out.println();

        // Part 2: Grade Calculator
        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 90;
        System.out.println("Score: " + score);
        if (score >= 70) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
        System.out.println();
        
        // Part 3: Season Determiner
        System.out.println("--- Part 3: Season Determiner ---");
        int temperature2 = 45;
        System.out.println("Temperature: " + temperature);
        if (temperature > 80) {
            System.out.println("Season: Summer");
        } else if (temperature >= 60 && temperature <= 80) {
            System.out.println("Season: Spring");
        } else if (temperature >= 40 && temperature <= 59) {
            System.out.println("Season: Fall");
        } else {
            System.out.println("Season: Winter");
        }
        System.out.println();
        
        // Part 4: Number Classifier
        System.out.println("--- Part 4: Number Classifier ---");
        int number = 5;
        String positivity = "";
        String size = "Neither large nor very negative";
        System.out.println("Number: " + number);
        if (number > 0) {
            positivity = "Positive";
        } else if (number < 0) {
            positivity = "Negative";
        } else if (number == 0) {
            positivity = "Zero";
        }
        if (number > 100) {
            size = "Large";
        } else if (number < -100) {
            size = "Very Negative";
        }
        System.out.println("Classification: " + positivity + ", " + size);
    }
}
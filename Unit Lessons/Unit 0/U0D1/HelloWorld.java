// A class is a collection of related attributes and behaviors

public class HelloWorld {

    // Main -> an entrypoint for your computer to start running code
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is James");

        System.out.print("My favorite pizza topping is olives. ");
        System.out.print("My favorite caffeinated drink is matcha lattes or iced teas.");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // boolean
        float decimal = 50.0f; // 32 bit decimal
        double bigDecimal = 0.6; // 64 bit decimal

        // INT ALTERNATIVES
        byte age = 25;
        short population = 3200;
        long bigInteger = 10000;

        String myName = "James"; // String is a CLASS not a primitive data type
        // a collection of PRIMITIVE characters to describe text

        // print out the length of the string using the length() method
        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        // conditons are always BOOLEAN meaning true/false
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        boolean isCompSciFun = true;

        // Example 2
        if (isCompSciFun == false) {
            System.out.println("Comp Sci Sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun!");
        }

        // Example 2.1
        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci Sucks");
        }

        // Challenge: Write a conditional if-else statement where you do something if you ate 5
        // apples vs 10, it should print something if neither condition is true.


        int appleCount = 5;
        // Challenge Complete 1
        if (appleCount == 5) {
            System.out.println("Wow, you have eaten a lot of apples today!");
        } else if (appleCount == 10) {
            System.out.println("Maybe you should slow down on apples for today.");
        } else {
            System.out.println(
                    "Either you haven't had a lot of apples today, or you've gone overboard with them.");
        }

        // Challenge Complete 2
        if (appleCount == 5 || appleCount == 10) {
            System.out.println("You have eaten " + appleCount + " apples today.");
        } else {
            System.out.println("You haven't had exactly 5 or 10 apples today");
        }

        // == equals
        // > greater than
        // >= greater than or equal to
        // < less than
        // <= less than or equal to
    }

}

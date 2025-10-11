public class Utils {
    public static void main(String[] args) {
        
        // a class that contains a list of characters to form words
        // it gives strings methods that we can use!
        String x = "hello";
        String.valueOf("123"); // converts an integer String to int

        int y = 10; // are primitive and DO NOT have any methods

        // Integer Wrapper
        Integer yWrapper = 10; // the value 10 has methods now!
        yWrapper.toString();
        System.out.println(Integer.parseInt("123")); // converts strings to integers

        // Boolean Wrapper
        boolean isFalse = false;
        Boolean isTrue = true;

        isTrue.toString();
        System.out.println(Boolean.parseBoolean("hello")); // converts strings to booleans ("true" -> true, "false" -> false)

        // Double Wrapper
        double decimal = 1.1;
        Double decimalWrapper = 1.1;

        System.out.println(Double.parseDouble("13.76"));
    }
}